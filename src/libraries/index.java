/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import java.sql.*;


/**
 *
 * @author Rasul-PC
 */
public class index {
    admin_object admin = new admin_object();
    
    ResultSet st = null;
    //String val = data.showText();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            index obj = new index();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    public void run (String[] args) throws Exception
    {
           // ------------------------- FOR PASSWORD HASHING AND SALTING ------------------------------------
          String pass = admin.hash_password("Password");
          System.out.println(pass);
          System.out.println("------------------------------------------------------------------------------");
          String pass2 = admin.hash_password("Sample");
          System.out.println(pass2);
          System.out.println("------------------------------------------------------------------------------");
          System.out.println(admin.validate_password("Sample","sample"));
          
          // ------------------------- FOR PASSWORD HASHING AND SALTING ------------------------------------
          
//        Connection con = admin.db.con;
//        String query="select * from tbl_branches where branch_No=:code or branch_name=:name";
//        String[] val = new String[]{"Baguio001","SM Baguio"} ;
//        
//       database p=new database();
//        
//        ResultSet rs= p.executeSqlQuery(con, query,val);
//        while(rs.next()){
//            System.out.println(rs.getString("branch_No"));
//        }
    }
}
