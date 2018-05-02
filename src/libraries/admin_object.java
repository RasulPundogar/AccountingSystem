package libraries;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rasul-PC
 */
public class admin_object {
    database_connection db = new database_connection();
    ResultSet rs = null;
    String[] values = null;
    /*
        Guidelines in using the database queries, per command has its own method. 
        Here are the list of methods that we can use:
        
        1. select(query) -> this will return a resultset base from the query you declared in the parameter
        2. select_criteria(query,values[]) -> you can use this when you want to use a select query with a WHERE Clause
        3. insert_data(query,values[]) -> when you want to insert a data into the database use this method.
        4. update_data(query,values[]) -> when you want to update a data into the database use this method.
        5. delete_data(query,values[]) -> when you want to delete a data into the database use this method.
        
        sample query format for methods parameters with values[]:
        - SELECT * FROM tbl_accounts WHERE acct_uname = :uname
        * instead of using ? we will use parameter names so that it will be easier for us to remember it and ease in reading
        
        BELOW we have 5 methods that shows how are we going to use SELECT ,SELECT CLAUSE ,INSERT ,UPDATE ,DELETE
        
        NEXT
        FINISH! GOOD JOB
    
        APRIL 27, 2018
        1:31 AM
    */
    public admin_object(){}
    public admin_object(String id){
        
    }
    public ResultSet get_branches() throws SQLException{
        ResultSet rs = db.data.select("SELECT * FROM tbl_branches ");
        return rs;
    }
    public ResultSet get_branches_no(String id,String name) throws SQLException{
        values = new String[]{id,name};
        rs = db.data.select_criteria("SELECT * FROM tbl_branches WHERE branch_No = :bNo AND branch_name = :bName", values);
        return rs;
    }
    public String new_branch(String branchNo,String branchName,String branchAddress,String branchContactNo,String branchEmailAdd,String msg) throws SQLException{
       values = new String[]{branchNo, branchName, branchAddress, branchContactNo, branchEmailAdd};
       return db.data.insert_data("INSERT INTO tbl_branches (branch_No,branch_name,branch_address,branch_ContactNo,branch_EmailAdd)VALUES(:bRan,:bRan2,:bRan3,:bRan4,:bRan5)",values);
    }
    public String update_branch(String branchNo,String branchName,String branchAddress,String branchContactNo,String branchEmailAdd,String msg) throws SQLException{
       values = new String[]{ branchName, branchAddress, branchContactNo, branchEmailAdd,branchNo};
       return db.data.update_data("UPDATE tbl_branches SET branch_name =:bRan2 ,branch_address =:bRan3 ,branch_ContactNo =:bRan4 ,branch_EmailAdd =:bRan5 WHERE branch_No =:bRan",values);
    }
    public String delete_branch(String branchNo) throws SQLException{
       values = new String[]{branchNo};
       return db.data.delete_data("DELETE FROM tbl_branches WHERE branch_No =:bRan",values);
    }
    public String hash_password(String password) throws NoSuchAlgorithmException, InvalidKeySpecException{
        String generatedHash = null;
        generatedHash = db.data.generateHash(password);
        return generatedHash;
    }
    public boolean validate_password(String password,String storedpass) throws NoSuchAlgorithmException, InvalidKeySpecException{
        boolean matched = false;
        matched = db.data.validate(password,storedpass);
        return matched;
       
    }
}
