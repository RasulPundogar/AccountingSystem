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
    //database data = new database_2();
    database data;
    public Connection con = null;
    
    public database_connection(){
        String db_url = "jdbc:sqlite:DbAccounting.db";
        String db_uname = "sa";
        String db_upass = "12345";
        
        data = new database(db_url,db_uname,db_upass);
        this.con = data.connect();
    }

    

}
