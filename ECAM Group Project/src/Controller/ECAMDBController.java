/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.*;
import java.io.*;
import java.sql.*;
/**
 *
 * @author jpdys
 */
public class ECAMDBController {
    public static void main(String[] args) {
        String className = null;
        String url = null;
        String user = null;
        String password = null;
        
        try {
            ResourceBundle resources;
            InputStream in = null;
            ResourceBundle newResources;

            className = "org.apache.derby.jdbc.ClientDriver";
            url = "jdbc:derby://localhost:1527/ECAMProjectDB";
            user = "app";
            password = "app";
        }
        catch (Exception exp) {
            System.out.println("Couldn't load resources." + exp);
            System.exit(-1);
        }        
        try {
            Class.forName(className);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver.");
            return;
        }
         try
        {
            Connection con = DriverManager.getConnection(url,user,password);     
                
            Statement stmt = con.createStatement();

                String testString = ("INSERT INTO Aircraft VALUES (1234)");                      
                stmt.execute(testString);
                                
            System.out.println("Inserted Aircraft value");
        
            stmt.close();        
            con.close();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }  
}
