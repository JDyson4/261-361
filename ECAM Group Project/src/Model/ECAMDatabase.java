/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

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
    
    /**
     * TESTING CODE FOR DATETIME FORMATTING
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void getOrders() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM orders");
        
        String orderNo = "";
        String customerNo = "";
        String orderDate = "";
        while(rs.next()){
            orderNo = rs.getString("orderNo");
            customerNo = rs.getString("customerNo");
            orderDate = rs.getString("orderDate");
            System.out.println(orderNo + " " + customerNo + " " + orderDate.substring(0, orderDate.length() - 2));
        }
    }
    
    /**
     * TESTING CODE FOR IMAGE RETRIEVING
     * 
     * @param byte[]
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public byte[] getDrawing() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT drawing FROM drawings WHERE drawingNo = 1");
        
        byte[] drawing = "hello".getBytes();
        while(rs.next()){
            drawing = rs.getBytes("drawing");
        }
        return drawing;
    }
    
    public AbstractTableModel retrieveCustomerProgramsReport() throws SQLException {
        ArrayList<CustomerPrograms> cprog = new ArrayList<CustomerPrograms>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] cprogRows = new Object[cprog.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] cprogColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(cprogColumnNames,cprogRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrieveCustomerPurchasesReport() throws SQLException {
        ArrayList<CustomerPurchases> cpurch = new ArrayList<CustomerPurchases>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] cpurchRows = new Object[cpurch.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] cpurchColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(cpurchColumnNames,cpurchRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrieveOpenOrdersReport() throws SQLException {
        ArrayList<OpenOrders> oo = new ArrayList<OpenOrders>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] ooRows = new Object[oo.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] ooColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(ooColumnNames,ooRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrievePartsAircraftReport() throws SQLException {
        ArrayList<PartsAircraft> pa = new ArrayList<PartsAircraft>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] paRows = new Object[pa.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] paColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(paColumnNames,paRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrievePartsReport() throws SQLException {
        ArrayList<Parts> parts = new ArrayList<Parts>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] partsRows = new Object[parts.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] partsColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(partsColumnNames,partsRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrieveAircraftPartsReport() throws SQLException {
        ArrayList<AircraftParts> ap = new ArrayList<AircraftParts>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] apRows = new Object[ap.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] apColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(apColumnNames,apRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrieveEngineerProgramsReport() throws SQLException {
        ArrayList<EngineerPrograms> ep = new ArrayList<EngineerPrograms>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] epRows = new Object[ep.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] epColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(epColumnNames,epRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrieveEngineerProgramHoursReport() throws SQLException {
        ArrayList<EngineerProgramHours> eph = new ArrayList<EngineerProgramHours>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] ephRows = new Object[eph.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] ephColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(ephColumnNames,ephRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    public AbstractTableModel retrieveEngineerEngineerDrawingsReport() throws SQLException {
        ArrayList<EngineerEngineerDrawings> eed = new ArrayList<EngineerEngineerDrawings>();
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM CUSTOMER"); // <-- update query
        
        while(rs.next()){ //<--store data in report object and add to arraylist
            
        }
        
        //column size needs changed; column size = 8
        Object[][] eedRows = new Object[eed.size()][8];
        
        //for loop here
        
        //Names need updated
        String[] eedColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        ReportTableModel rtm = new ReportTableModel(eedColumnNames,eedRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Retrieves a report of all status changes made to a specific engineering drawing, 
     * including the date the change was made and engineer who made it.
     * 
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveEngineerDrawingChangesReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT drawings.DrawingNo, "
                                    + "drawings.Drawing, "
                                    + "drawings.Version, "
                                    + "drawings.VersionDateTime, "
                                    + "drawings.ReasonForChange, "
                                    + "employees.EmployeeNo, "
                                    + "employees.EmployeeFName, "
                                    + "employees.EmployeeLName "
                             + "FROM drawings "
                             + "JOIN engineerdrawings "
                                + "ON drawings.DrawingNo = engineerdrawings.DrawingNo "
                             + "JOIN employees "
                                + "ON employees.EmployeeNo = engineerdrawings.EmployeeNo");
        
        ArrayList<EngineerDrawingChanges> edcA = new ArrayList<EngineerDrawingChanges>();
        EngineerDrawingChanges edc;
        while(rs.next()){
            String versionDT = rs.getString("drawings.VersionDateTime");
            edc = new EngineerDrawingChanges(
                rs.getInt("drawings.DrawingNo"),
                rs.getBytes("drawings.Drawing"),
                rs.getDouble("drawings.Version"),
                versionDT.substring(0, versionDT.length() - 2),
                rs.getString("drawings.ReasonForChange"),
                rs.getInt("employees.EmployeeNo"),
                rs.getString("employees.EmployeeFName"),
                rs.getString("employees.EmployeeFName")
            );
            edcA.add(edc);
        }
        
        Object[][] edcRows = new Object[edcA.size()][8];
        
        for(int i = 0; i < edcA.size(); i++)
        {
            edcRows[i][0] = edcA.get(i).getDrawingNo();
            if (edcA.get(i).getDrawing() != null) {
                ImageIcon drawing = new ImageIcon(
                        new ImageIcon(edcA.get(i).getDrawing()).getImage()
                                .getScaledInstance(150, 120, Image.SCALE_SMOOTH));
                edcRows[i][1] = drawing;
            } else {
                edcRows[i][1] = null;
            }
            edcRows[i][2] = edcA.get(i).getVersion();
            edcRows[i][3] = edcA.get(i).getVersionDateTime();
            edcRows[i][4] = edcA.get(i).getReasonForChange();
            edcRows[i][5] = edcA.get(i).getEmployeeNo();
            edcRows[i][6] = edcA.get(i).getEmployeeFName();
            edcRows[i][7] = edcA.get(i).getEmployeeLName();
        }
        
        String[] edcColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName"};
        
        DrawingChangesReportTableModel dcrtm = new DrawingChangesReportTableModel(edcColumnNames,edcRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return dcrtm;
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
