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
        String url = "jdbc:derby://192.168.1.62:1527/ECAMProjectDB";
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
            System.out.println("We made it");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from Inventory ORDER BY ProductName");

            while (rs.next())
            {
                String product = rs.getString("");
                String description = rs.getString("ProductDescription");

                float price = rs.getFloat("Price");

                System.out.println(product + " described by many as \"" + description +
                        "\" is sold for $" + price);
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
