/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RIVER
 */
public class ECAMDatabase {

     public ECAMDatabase () {
        
        String url = "jdbc:mysql://127.0.0.1:3306/riverdb";
        String user = "root";
        String password = "";

        try
        {
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Password FROM test WHERE Username = 'river1'");

            while (rs.next())
            {
                String queryPass = rs.getString("Password");
                System.out.println("Password: " + queryPass);
            }
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
