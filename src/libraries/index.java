/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.*;

/**
 *
 * @author Rasul-PC
 */
public class index {
    database data = new database();
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
        st = data.select("SELECT * FROM tbl_accounts");
        while(st.next()){
            System.out.print(st.getString("acct_No"));
            System.out.print(st.getString("acct_uname"));
        }
     //  System.out.print(val);
    }
}