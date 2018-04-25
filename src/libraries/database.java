/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import com.sun.rowset.CachedRowSetImpl;
import java.awt.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Rasul-PC
 */
public class database {
     database_connection con = new database_connection();
     public String val ="";
//     public String showText(){
//        
//        boolean connn = con.dbConnect("jdbc:sqlserver://localhost:1433;databaseName=DbAccounting","sa", "12345");
//        if(connn){
//        val= "Connected";
//        }else{
//        val= "Not connected";
//        }
//        return val;
//     }
     
     
    public ResultSet select(String queryStr) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet resultSet = null;
    CachedRowSetImpl crs = null;
    try {
        conn = con.dbConnect("jdbc:sqlserver://localhost:1433;databaseName=DbAccounting","sa", "12345");
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
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return crs;
}
//    public ResultSet select(String query){
//        
//        con.dbConnect("jdbc:sqlserver://RASUL-PC//SQLEXPRESS","Rasul-PC", "");
//        
//        return null;
//    }
//    public List<Biler> list() throws SQLException {
//    Connection connection = null;
//    PreparedStatement statement = null;
//    ResultSet resultSet = null;
//    List<Biler> bilers = new ArrayList<Biler>();
//
//    try {
//        connection = database.getConnection();
//        statement = connection.prepareStatement("SELECT id, name, value FROM Biler");
//        resultSet = statement.executeQuery();
//
//        while (resultSet.next()) {
//            Biler biler = new Biler();
//            biler.setId(resultSet.getLong("id"));
//            biler.setName(resultSet.getString("name"));
//            biler.setValue(resultSet.getInt("value"));
//            bilers.add(biler);
//        }
//    } finally {
//        if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
//        if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
//        if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
//    }
//
//    return bilers;
//}
}
