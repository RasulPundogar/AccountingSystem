/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;
import com.sun.rowset.*;

import java.sql.*;
import java.sql.Timestamp;
import java.util.*;
import java.util.logging.*;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
/**
 *
 * @author Rasul-PC
 */
public class database {
     private PreparedStatement statement;

    /** Maps parameter names to arrays of ints which are the parameter indices. 
*/
    private Map indexMap;
    private static ArrayList<String> col = new ArrayList<String>();
    String db_url = "";
    String db_uname = "";
    String db_upass = "";
    
    public database(){}
    
    /**
     * Creates a database.  Wraps a call to
     * c.{@link Connection#prepareStatement(java.lang.String) 
prepareStatement}.
     * @param db_url
     * @param db_uname
     * @param db_upass
     * @param connection the database connection
     * @param query      the parameterized query
     * @param values    the parameter values
     * @param name      the value of parameterized query
     * @throws SQLException if the statement could not be created
     */
//    public database(Connection connection, String query, String[] values)  {
////        indexMap =new HashMap();
////        String parsedQuery=parse(query, indexMap);
////        statement= connection.prepareStatement(parsedQuery);
////        int count = 0;
////        for(String val : col){
////            setString(val, values[count]);
////            count++;
////        }
//       
//    }
    public database(String db_url,String db_uname,String db_upass){
         
        this.db_url = db_url;
        this.db_uname = db_uname;
        this.db_upass = db_upass;
        //return conn;
    }
    
    public Connection connect(){
        Connection conn;
         try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(this.db_url,this.db_uname,this.db_upass);
            return conn;
        } catch (Exception e) {
           e.printStackTrace();
           return null;
        }
    }
    public ResultSet select(String queryStr) {
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs = null;
        Connection conn = connect(); 
        try {
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(queryStr);
            crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        } catch (SQLException e) {
            throw new IllegalStateException("Unable to execute query: " + queryStr, e);
        }finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connect() != null) {
                    connect().close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return crs;
}
    
    public ResultSet select_criteria(String query, String[] values) {
             Connection connection = connect();
             ResultSet st = null;
         try {
             indexMap = new HashMap();
             String parsedQuery=parse(query, indexMap);
             statement= connection.prepareStatement(parsedQuery);
             int count = 0;
             if(values.length > 1){
                 for(String val : col){
                    setString(val, values[count]);
//                    System.out.println(col);
//                    System.out.println(val+"-"+values[count]);
                    count++;
                 }
             }else if (values.length == 1 ){
                 for(String val : col){
                    setString(val, values[0]);
//                    System.out.println(count);
//                    System.out.println(val+"-"+values[0]);
                 }
             }
             col.clear();
             st = statement.executeQuery();
             return st;
             
         } catch (SQLException ex) {
             Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }
    
    public String insert_data(String query,String[] values) throws SQLException{
        Connection connection = connect();
        indexMap = new HashMap();
        String parsedQuery=parse(query, indexMap);
        statement= connection.prepareStatement(parsedQuery);
        int count = 0;
        if(values.length > 1){
            for(String val : col){
                setString(val, values[count]);
                count++;
            }
        }
        if(statement.executeUpdate() == 1){
            return "Inserting new data, Successful!";
        }else{
            return "Inserting new data, Failed!";
        }
    }
    
    public String update_data(String query,String[] values) throws SQLException{
        Connection connection = connect();
        indexMap = new HashMap();
        String parsedQuery=parse(query, indexMap);
        statement= connection.prepareStatement(parsedQuery);
        int count = 0;
        if(values.length >= 1){
            for(String val : col){
                setString(val, values[count]);
                count++;
            }
        }
        if(statement.executeUpdate() == 1){
            return "Updating data, Successful!";
        }else{
            return "Updating data, Failed!";
        }
    }
    
    public String delete_data(String query,String[] values) throws SQLException{
        Connection connection = connect();
        indexMap = new HashMap();
        String parsedQuery=parse(query, indexMap);
        statement= connection.prepareStatement(parsedQuery);
        int count = 0;
        if(values.length >= 1){
            for(String val : col){
                setString(val, values[count]);
                count++;
            }
        }
        if(statement.executeUpdate() == 1){
            return "Deleting data, Successful!";
        }else{
            return "Deleting data, Failed!";
        }
    }
   
    /**
     * Parses a query with named parameters.  The parameter-index mappings are  put into the map, and the
     * parsed query is returned.  DO NOT CALL FROM CLIENT CODE.  This method is non-private so JUnit code can
     * test it.
     * @param query    query to parse
     * @param paramMap map to hold parameter-index mappings
     * @return the parsed query
     */
    static final String parse(String query, Map paramMap) {
        // parameter-like strings inside quotes.
        int length=query.length();
        StringBuffer parsedQuery=new StringBuffer(length);
        boolean inSingleQuote=false;
        boolean inDoubleQuote=false;
        int index=1;
        for(int i=0;i<length;i++) {
            char c=query.charAt(i);
            if(inSingleQuote) {
                if(c=='\'') {
                    inSingleQuote=false;
                }
            } else if(inDoubleQuote) {
                if(c=='"') {
                    inDoubleQuote=false;
                }
            } else {
                if(c=='\'') {
                    inSingleQuote=true;
                } else if(c=='"') {
                    inDoubleQuote=true;
                } else if(c==':' && i+1<length &&
                        Character.isJavaIdentifierStart(query.charAt(i+1))) {
                    int j=i+2;
                    while(j<length && Character.isJavaIdentifierPart(query.charAt(j))) {
                        j++;
                    }
                    String name=query.substring(i+1,j);
                    c='?'; // replace the parameter with a question mark
                    i+=name.length(); // skip past the end if the parameter

                    List indexList=(List)paramMap.get(name);
                    if(indexList==null) {
                        indexList=new LinkedList();
                        col.add(name);
                        paramMap.put(name, indexList);
                    }
                    indexList.add(new Integer(index));

                    index++;
                }
            }
            parsedQuery.append(c);
        }

        // replace the lists of Integer objects with arrays of ints
        for(Iterator itr=paramMap.entrySet().iterator(); itr.hasNext();) {
            Map.Entry entry=(Map.Entry)itr.next();
            List list=(List)entry.getValue();
            int[] indexes=new int[list.size()];
            int i=0;
            for(Iterator itr2=list.iterator(); itr2.hasNext();) {
                Integer x=(Integer)itr2.next();
                indexes[i++]=x.intValue();
            }
            entry.setValue(indexes);
        }

        return parsedQuery.toString();
    }

    /**
     * Returns the indexes for a parameter.
     * @param name parameter name
     * @return parameter indexes
     * @throws IllegalArgumentException if the parameter does not exist
     */
    private int[] getIndexes(String name){
        int[] indexes=(int[])indexMap.get(name);
        if(indexes==null) {
            throw new IllegalArgumentException("Parameter not found: "+name);
        }
        return indexes;
    }

    /**
     * Sets a parameter.
     * @param name  parameter name
     * @param value parameter value
     * @throws SQLException if an error occurred
     * @throws IllegalArgumentException if the parameter does not exist
     * @see PreparedStatement#setObject(int, java.lang.Object)
     */
    public void setObject(String name, Object value) throws SQLException {
        int[] indexes=getIndexes(name);
        for(int i=0; i < indexes.length; i++) {
            statement.setObject(indexes[i], value);
        }
    }

    /**
     * Sets a parameter.
     * @param name  parameter name
     * @param value parameter value
     * @throws SQLException if an error occurred
     * @throws IllegalArgumentException if the parameter does not exist
     * @see PreparedStatement#setString(int, java.lang.String)
     */
    public void setString(String name, String value) throws SQLException {
        int[] indexes=getIndexes(name);
        for(int i=0; i < indexes.length; i++) {
            statement.setString(indexes[i], value);
        }
    }

    /**
     * Sets a parameter.
     * @param name  parameter name
     * @param value parameter value
     * @throws SQLException if an error occurred
     * @throws IllegalArgumentException if the parameter does not exist
     * @see PreparedStatement#setInt(int, int)
     */
    public void setInt(String name, int value) throws SQLException {
        int[] indexes=getIndexes(name);
        for(int i=0; i < indexes.length; i++) {
            statement.setInt(indexes[i], value);
        }
    }

    /**
     * Sets a parameter.
     * @param name  parameter name
     * @param value parameter value
     * @throws SQLException if an error occurred
     * @throws IllegalArgumentException if the parameter does not exist
     * @see PreparedStatement#setInt(int, int)
     */
    public void setLong(String name, long value) throws SQLException {
        int[] indexes=getIndexes(name);
        for(int i=0; i < indexes.length; i++) {
            statement.setLong(indexes[i], value);
        }
    }

    /**
     * Sets a parameter.
     * @param name  parameter name
     * @param value parameter value
     * @throws SQLException if an error occurred
     * @throws IllegalArgumentException if the parameter does not exist
     * @see PreparedStatement#setTimestamp(int, java.sql.Timestamp)
     */
    public void setTimestamp(String name, Timestamp value) throws SQLException 
    {
        int[] indexes=getIndexes(name);
        for(int i=0; i < indexes.length; i++) {
            statement.setTimestamp(indexes[i], value);
        }
    }

    /**
     * Returns the underlying statement.
     * @return the statement
     */
    public PreparedStatement getStatement() {
        return statement;
    }

    /**
     * Executes the statement.
     * @return true if the first result is a {@link ResultSet}
     * @throws SQLException if an error occurred
     * @see PreparedStatement#execute()
     */
    public boolean execute() throws SQLException {
        return statement.execute();
    }
    
    /**
     * Executes the statement, which must be a query.
     * @return the query results
     * @throws SQLException if an error occurred
     * @see PreparedStatement#executeQuery()
     */
    public ResultSet executeQuery() throws SQLException {
        return statement.executeQuery();
    }

    /**
     * Executes the statement, which must be an SQL INSERT, UPDATE or DELETE 
statement;
     * or an SQL statement that returns nothing, such as a DDL statement.
     * @return number of rows affected
     * @throws SQLException if an error occurred
     * @see PreparedStatement#executeUpdate()
     */
    public int executeUpdate() throws SQLException {
        return statement.executeUpdate();
    }

    /**
     * Closes the statement.
     * @throws SQLException if an error occurred
     * @see Statement#close()
     */
    public void close() throws SQLException {
        statement.close();
    }

    /**
     * Adds the current set of parameters as a batch entry.
     * @throws SQLException if something went wrong
     */
    public void addBatch() throws SQLException {
        statement.addBatch();
    }


    /**
     * Executes all of the batched statements.
     * 
     * See {@link Statement#executeBatch()} for details.
     * @return update counts for each statement
     * @throws SQLException if something went wrong
     */
    public int[] executeBatch() throws SQLException {
        return statement.executeBatch();
    }
    
    
    /**
     Create a hashing and salting for the password
     * @param pass this will be the storage of the password of the user
     * @return this will return a string with a generated hash password
     * @throws java.security.NoSuchAlgorithmException to allow the algorithms used in this function.
     * @throws java.security.spec.InvalidKeySpecException 
     */
    public String generateHash(String pass) throws NoSuchAlgorithmException, InvalidKeySpecException{
        String hash = generateStrongPasswordHash(pass); 
        return hash;
    }
    
    public boolean validate(String pass,String storedPassword) throws NoSuchAlgorithmException, InvalidKeySpecException{
        
        Boolean matched = false;
        matched = validatePassword(pass,storedPassword);
        return matched;
        
    }
    
    // YOU STOP HERE, YOU CANNOT CREATE A LOGIN PROGRAMME
    public byte[] from_hex(String password) throws NoSuchAlgorithmException{ 
        return fromHex(password); 
    }
    public String to_hex(String password) throws NoSuchAlgorithmException{
        return toHex(password.getBytes()); 
    }
    
    private static boolean validatePassword(String originalPassword, String storedPassword) throws NoSuchAlgorithmException, InvalidKeySpecException
	{
		String[] parts = storedPassword.split(":");
		int iterations = Integer.parseInt(parts[0]);
		byte[] salt = fromHex(parts[1]);
		byte[] hash = fromHex(parts[2]);
		
		PBEKeySpec spec = new PBEKeySpec(originalPassword.toCharArray(), salt, iterations, hash.length * 8);
		
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		
		byte[] testHash = skf.generateSecret(spec).getEncoded();
		
		int diff = hash.length ^ testHash.length;
		
		for(int i = 0; i < hash.length && i < testHash.length; i++)
		{
			diff |= hash[i] ^ testHash[i];
		}
		
		return diff == 0;
	}
	
	private static String generateStrongPasswordHash(String password) throws NoSuchAlgorithmException, InvalidKeySpecException
	{
		int iterations = 1000;
		char[] chars = password.toCharArray();
		byte[] salt = getSalt().getBytes();
		
		PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] hash = skf.generateSecret(spec).getEncoded();
		return iterations + ":" + toHex(salt) + ":" + toHex(hash);
				
	}
	
	private static String getSalt() throws NoSuchAlgorithmException
	{
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		byte[] salt = new byte[16];
		sr.nextBytes(salt);
		return salt.toString();
	}
	
	private static String toHex(byte[] array) throws NoSuchAlgorithmException
	{
		BigInteger bi = new BigInteger(1, array);
		String hex = bi.toString(16);
		int paddingLength = (array.length * 2) - hex.length();
		if(paddingLength > 0)
		{
			return String.format("%0"  +paddingLength + "d", 0) + hex;
		}else{
			return hex;
		}
	}
	
	private static byte[] fromHex(String hex) throws NoSuchAlgorithmException
	{
		byte[] bytes = new byte[hex.length() / 2];
		for(int i = 0; i<bytes.length ;i++)
		{
			bytes[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
		}
		return bytes;
	}
//    private static String generateStorngPasswordHash(String password) throws NoSuchAlgorithmException, InvalidKeySpecException
//    {
//        int iterations = 1000;
//        char[] chars = password.toCharArray();
//        byte[] salt = getSalt();
//         
//        PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
//        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
//        byte[] hash = skf.generateSecret(spec).getEncoded();
//        return iterations + ":" + toHex(salt) + ":" + toHex(hash);
//    }
//     
//    private static byte[] getSalt() throws NoSuchAlgorithmException
//    {
//        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
//        byte[] salt = new byte[16];
//        sr.nextBytes(salt);
//        return salt;
//    }
//     
//    private static String toHex(byte[] array) throws NoSuchAlgorithmException
//    {
//        BigInteger bi = new BigInteger(1, array);
//        String hex = bi.toString(16);
//        int paddingLength = (array.length * 2) - hex.length();
//        if(paddingLength > 0)
//        {
//            return String.format("%0"  +paddingLength + "d", 0) + hex;
//        }else{
//            return hex;
//        }
//    }
     
}
