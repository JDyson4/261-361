/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class ECAMDatabase {
    
    public ECAMDatabase () {

    }
    
    private Connection getConnection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("Driver failed to connect");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://y5-ist361.ad.psu.edu:3306/rwm5661", "rwm5661", "welcome");
            System.out.println("Connected to DB");
        } catch (SQLException ex) {
            Logger.getLogger(ECAMDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
    public void getUsername() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM aircraft");
        
        String programNo = "";
        String programName = "";
        while(rs.next()){
            programNo = rs.getString("programNo");
            programName = rs.getString("programName");
            System.out.println(programNo + " " + programName);
        }
    }
    
    public ArrayList<CustomerPrograms> retrieveCustomerProgramsReport() throws SQLException {
        ArrayList<CustomerPrograms> customerPrograms = new ArrayList<CustomerPrograms>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
        
        }
        
        return customerPrograms;
    }
    
    public ArrayList<CustomerPurchases> retrieveCustomerPurchasesReport() throws SQLException {
        ArrayList<CustomerPurchases> customerPurchases = new ArrayList<CustomerPurchases>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return customerPurchases;
    }
    
    public ArrayList<OpenOrders> retrieveOpenOrdersReport() throws SQLException {
        ArrayList<OpenOrders> openOrders = new ArrayList<OpenOrders>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return openOrders;
    }
    
    public ArrayList<PartsAircraft> retrievePartsAircraftReport() throws SQLException {
        ArrayList<PartsAircraft> partsAircraft = new ArrayList<PartsAircraft>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return partsAircraft;
    }
    
    public ArrayList<Parts> retrievePartsReport() throws SQLException {
        ArrayList<Parts> parts = new ArrayList<Parts>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return parts;
    }
    
    public ArrayList<AircraftParts> retrieveAircraftPartsReport() throws SQLException {
        ArrayList<AircraftParts> aircraftParts = new ArrayList<AircraftParts>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return aircraftParts;
    }
    
    public ArrayList<EngineerPrograms> retrieveEngineerProgramsReport() throws SQLException {
        ArrayList<EngineerPrograms> engineerPrograms = new ArrayList<EngineerPrograms>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return engineerPrograms;
    }
    
    public ArrayList<EngineerProgramHours> retrieveEngineerProgramHoursReport() throws SQLException {
        ArrayList<EngineerProgramHours> engineerProgramHours = new ArrayList<EngineerProgramHours>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return engineerProgramHours;
    }
    
    public ArrayList<EngineerEngineerDrawings> retrieveEngineerEngineerDrawingsReport() throws SQLException {
        ArrayList<EngineerEngineerDrawings> engineerEngineerDrawings = new ArrayList<EngineerEngineerDrawings>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return engineerEngineerDrawings;
    }
    
    public ArrayList<EngineerDrawingChanges> retrieveEngineerDrawingChangesReport() throws SQLException {
        ArrayList<EngineerDrawingChanges> engineerDrawingChanges = new ArrayList<EngineerDrawingChanges>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
        while(rs.next()){
            
        }
        
        return engineerDrawingChanges;
    }
    
    public void insertRowCustomerProgramsReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowCustomerPurchasesReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowOpenOrdersReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowPartsAircraftReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowPartsReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowAircraftPartsReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowEngineerProgramsReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowEngineerProgramHoursReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowEngineerEngineerDrawingsReport(JTextField value) throws SQLException {
        
    }
    
    public void insertRowEngineerDrawingChangesReport(JTextField value) throws SQLException {
        
    }

}
