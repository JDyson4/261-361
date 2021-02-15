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
public class ECAMController {
        private String className=null;
    private static String url=null;
    private static String user = null;
    private static String password = null;
    
    public ECAMController() {
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
        catch (Exception e) {
            System.out.println("Failed to load driver.");
            return;
        }
    }
    
    
    
}
