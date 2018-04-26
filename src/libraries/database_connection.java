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
public class database_connection {
    public Connection dbConnect(String db_connect_string,String db_userid,String db_password)
    {
      Connection conn = null;
      try {
         Class.forName("org.sqlite.JDBC");
         conn = DriverManager.getConnection(db_connect_string,
                  db_userid, db_password);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }

//   public static void main(String[] args)
//   {
//      database_connection connServer = new database_connection();
//      boolean samp = connServer.dbConnect("jdbc:sqlserver://localhost:1433;databaseName=DbAccounting;","sa", "12345");
//      System.out.print(samp);
//   }
    
}
