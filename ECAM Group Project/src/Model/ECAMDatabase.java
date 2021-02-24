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
        
        String className = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://192.168.1.29:1527/ECAMProjectDB";
        String user = "app";
        String password = "app";

        try
        {
            Class.forName(className);
        }
        catch (Exception e)
        {
            System.out.println(className + " driver failed to load.");
            System.exit(-1);
        }
        try
        {
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to DB");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("");

            while (rs.next())
            {
                
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
