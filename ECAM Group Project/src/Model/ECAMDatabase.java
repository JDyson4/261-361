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

/**
 * Purpose: Holds custom methods to retrieve reports, insert rows into reports,
 * and delete rows from reports
 */
public class ECAMDatabase {
    
    public ECAMDatabase () {

    }
    
    /**
     * Purpose: Returns a Connection object connected to the MySQl database
     * @return 
     */
    private Connection getConnection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("Driver failed to connect");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://y5-ist361.ad.psu.edu:3306/rwm5661", "rwm5661", "welcome");
        } catch (SQLException ex) {
            Logger.getLogger(ECAMDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
    /**
     * Purpose: Retrieves Customer to Program report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveCustomerProgramsReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Customer Programs Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT customers.CustomerNo, "
                                    + "customers.CustomerName, "
                                    + "aircraft.ProgramNo, "
                                    + "aircraft.ProgramName, "
                            + "FROM customers"
                            + "JOIN customerPrograms ON customerPrograms.CustomerNo = customers.CustomerNo"
                            + "JOIN aircraft ON aircraft.ProgramNo = customerPrograms.ProgramNo"); 
        
        ArrayList<CustomerPrograms> cprogA = new ArrayList<>();
        CustomerPrograms cprog;
        while(rs.next()){
            cprog = new CustomerPrograms(
            rs.getInt("customers.CustomerNo"),
            rs.getString("customers.CustomerName"),
            rs.getInt("aircraft.ProgramNo"),
            rs.getString("aircraft.ProgramName")
            );
            cprogA.add(cprog);
        }
        
        
        //column size needs changed; column size = 8
        Object[][] cprogRows = new Object[cprogA.size()][4];
        
        for(int i = 0; i < cprogA.size(); i++) {
            cprogRows[i][0] = cprogA.get(i).getCustomerNo();
            cprogRows[i][1] = cprogA.get(i).getCustomerName();
            cprogRows[i][2] = cprogA.get(i).getProgramNo();
            cprogRows[i][3] = cprogA.get(i).getProgramName();
        }
        
        //Names need updated
        String[] cprogColumnNames = {"Customer No.","Customer Name", "Program No.","Program Name"};
        
        ReportTableModel rtm = new ReportTableModel(cprogColumnNames,cprogRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Customer to Purchases report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveCustomerPurchasesReport() throws SQLException {
        
        Connection con = getConnection(); 
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Customer Purchases Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT customers.CustomerNo, "
                                    + "customers.CustomerName, "
                                    + "orders.OrderNo, "
                                    + "orders.OrderDateTime "
                             + "FROM customers, orders "
                             + "WHERE customers.CustomerNo = orders.CustomerNo");
        
        ArrayList<CustomerPurchases> cpurchA = new ArrayList<>();
        CustomerPurchases cpurch;
        while(rs.next()){
            cpurch = new CustomerPurchases(
                rs.getInt("customers.CustomerNo"),
                rs.getString("customers.CustomerName"),
                rs.getInt("orders.OrderNo"),
                rs.getString("orders.OrderDateTime")     
            );
            cpurchA.add(cpurch);
        }
        
        Object[][] cpurchRows = new Object[cpurchA.size()][4];
        
        for (int i = 0; i < cpurchA.size(); i++){
            cpurchRows[i][0] = cpurchA.get(i).getCustomerNo();
            cpurchRows[i][1] = cpurchA.get(i).getCustomerName();
            cpurchRows[i][2] = cpurchA.get(i).getOrderNo();
            cpurchRows[i][3] = cpurchA.get(i).getOrderDateTime();
        }
        
        String[] cpurchColumnNames = {"Customer No.","Customer Name","Order No.","Order DateTime"};
        
        ReportTableModel rtm = new ReportTableModel(cpurchColumnNames,cpurchRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Open Orders report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveOpenOrdersReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Open Orders Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT orders.OrderNo, "
                                    + "orders.OrderDateTime, "
                                    + "orders.CustomerNo "
                             + "FROM orders");
        
        ArrayList<OpenOrders> ooA = new ArrayList<>();
        OpenOrders oo;
        while(rs.next()){
            oo = new OpenOrders(
                rs.getInt("orders.OrderNo"),
                rs.getString("orders.OrderDateTime"),
                rs.getInt("orders.CustomerNo")
            );
            ooA.add(oo);
        }

        Object[][] ooRows = new Object[ooA.size()][3];

        for (int i = 0; i < ooA.size(); i++) {
            ooRows[i][0] = ooA.get(i).getOrderNo();
            ooRows[i][1] = ooA.get(i).getOrderDateTime();
            ooRows[i][2] = ooA.get(i).getCustomerNo();
        }

        String[] ooColumnNames = {"Order No.","Order DateTime","Customer No."};
        
        ReportTableModel rtm = new ReportTableModel(ooColumnNames,ooRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Parts to Aircraft report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrievePartsAircraftReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Parts to Aircraft Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT aircraft.ProgramNo," +
                                    "aircraft.ProgramName," +
                                    "parts.PartNo," +
                                    "parts.Inventory," +
                                    "parts.Vendor" +
                                "FROM aircraft" +
                                "JOIN aircraftparts ON aircraftparts.ProgramNo = aircraft.ProgramNo" +
                                "JOIN parts ON aircraftparts.PartNo = parts.PartNo");
        
        ArrayList<PartsAircraft> paA = new ArrayList<>();
        PartsAircraft pa;
        while(rs.next()){
            pa = new PartsAircraft(
            rs.getInt("aircraft.ProgramNo"),
            rs.getString("aircraft.ProgramName"),
            rs.getInt("parts.PartNo"),
            rs.getInt("parts.Inventory"),
            rs.getString("parts.Vendor")
            );
            paA.add(pa);
        }
        
        //column size needs changed; column size = 8
        Object[][] paRows = new Object[paA.size()][5];
        
        for(int i = 0; i < paA.size(); i++) {
            paRows[i][0] = paA.get(i).getProgramNo();
            paRows[i][1] = paA.get(i).getPartNo();
            paRows[i][2] = paA.get(i).getProgramName();
            paRows[i][3] = paA.get(i).getInventory();
            paRows[i][4] = paA.get(i).getVendor();
        }
        
        //Names need updated
        String[] paColumnNames = {"Program No.","Program Name","Part No.","Inventory","Vendor"};
        
        ReportTableModel rtm = new ReportTableModel(paColumnNames,paRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Parts report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrievePartsReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Parts Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT parts.PartNo, " + 
                                      "parts.Inventory, " +
                                      "parts.Vendor " +
                               "FROM parts");
        
        ArrayList<Parts> partsA = new ArrayList<Parts>();
        Parts parts;
        while(rs.next()){
            parts = new Parts(
                rs.getInt("parts.PartNo"),
                rs.getInt("parts.Inventory"),
                rs.getString("parts.Vendor")
            );
            partsA.add(parts);
        }
        
        Object[][] partsRows = new Object[partsA.size()][3];
        
        for (int i = 0; i < partsA.size(); i++){
            partsRows[i][0] = partsA.get(i).getPartNo();
            partsRows[i][1] = partsA.get(i).getInventory();
            partsRows[i][2] = partsA.get(i).getVendor();
        }
        
        String[] partsColumnNames = {"Part No.","Inventory","Vendor"};
        
        ReportTableModel rtm = new ReportTableModel(partsColumnNames,partsRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Aircraft to Parts report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveAircraftPartsReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Aircraft to Parts Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT aircraft.ProgramNo, " +
                                      "aircraft.ProgramName, " +
                                      "parts.PartNo, " +
                                      "parts.Inventory, " +
                                      "parts.Vendor " +
                               "FROM aircraft " +
                               "JOIN aircraftparts ON aircraft.ProgramNo = aircraftparts.ProgramNo " +
                               "JOIN parts ON aircraftparts.PartNo = parts.PartNo"); // <-- update query
        
        ArrayList<AircraftParts> apA = new ArrayList<AircraftParts>();
        AircraftParts ap;
        while(rs.next()){ //<--store data in report object and add to arraylist
            ap = new AircraftParts(
                rs.getInt("aircraft.ProgramNo"),
                rs.getString("aircraft.ProgramName"),
                rs.getInt("parts.PartNo"),
                rs.getInt("parts.Inventory"),
                rs.getString("parts.Vendor")
            );
            apA.add(ap);
        }
        
        Object[][] apRows = new Object[apA.size()][5];
        
        for (int i = 0; i < apA.size(); i++){
            apRows[i][0] = apA.get(i).getProgramNo();
            apRows[i][1] = apA.get(i).getProgramName();
            apRows[i][2] = apA.get(i).getPartNo();
            apRows[i][3] = apA.get(i).getInventory();
            apRows[i][4] = apA.get(i).getVendor();
        }        
        
        String[] apColumnNames = {"Program No.","Program Name","Part No.","Inventory","Vendor"};
        
        ReportTableModel rtm = new ReportTableModel(apColumnNames,apRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Engineer to Programs report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveEngineerProgramsReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Engineer to Program Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT employees.EmployeeNo, "
                                    + "employees.EmployeeFName, "
                                    + "employees.EmployeeLName, "
                                    + "employees.Skill, "
                                    + "employees.JobTitle, "
                                    + "aircraft.ProgramNo, "
                                    + "aircraft.ProgramName "
                             + "FROM employees "
                             + "JOIN engineerprojects ON employees.EmployeeNo = engineerprojects.EmployeeNo "
                             + "JOIN projects ON engineerprojects.ProjectNo = projects.ProjectNo "
                             + "JOIN aircraft ON projects.ProgramNo = aircraft.ProgramNo "
                             + "WHERE employees.JobTitle = 'Engineer'");
        
        ArrayList<EngineerPrograms> epA = new ArrayList<EngineerPrograms>();
        EngineerPrograms ep;
        while(rs.next()){ //<--store data in report object and add to arraylist
            ep = new EngineerPrograms(
                rs.getInt("employees.EmployeeNo"),
                rs.getString("employees.EmployeeFName"),
                rs.getString("employees.EmployeeLName"),
                rs.getString("employees.Skill"),
                rs.getString("employees.JobTitle"),
                rs.getInt("aircraft.ProgramNo"),
                rs.getString("aircraft.ProgramName")
            );
            epA.add(ep);
        }
        
        Object[][] epRows = new Object[epA.size()][7];
        
        for (int i = 0; i < epA.size(); i++){
            epRows[i][0] = epA.get(i).getEmployeeNo();
            epRows[i][1] = epA.get(i).getEmployeeFName();
            epRows[i][2] = epA.get(i).getEmployeeLName();
            epRows[i][3] = epA.get(i).getSkill();
            epRows[i][4] = epA.get(i).getJobTitle();
            epRows[i][5] = epA.get(i).getProgramNo();
            epRows[i][6] = epA.get(i).getProgramName();
        }
        
        String[] epColumnNames = {"Employee No.","Employee FName","Employee LName", "Skill",
                                  "Job Title", "Program No.", "Program Name"};
        
        ReportTableModel rtm = new ReportTableModel(epColumnNames,epRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Engineer to Program Hours report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveEngineerProgramHoursReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Engineer to Program Hours Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT employees.EmployeeNo, "
                                    + "employees.EmployeeFName, "
                                    + "employees.EmployeeLName, "
                                    + "employees.Skill, "
                                    + "employees.JobTitle, "
                                    + "engineerprojects.EngineerHours, "
                                    + "aircraft.ProgramNo, "
                                    + "aircraft.ProgramName "
                             + "FROM employees "
                             + "JOIN engineerprojects ON employees.EmployeeNo = engineerprojects.EmployeeNo "
                             + "JOIN projects ON engineerprojects.ProjectNo = projects.ProjectNo "
                             + "JOIN aircraft ON projects.ProgramNo = aircraft.ProgramNo "
                             + "WHERE employees.JobTitle = 'Engineer'");
        
        ArrayList<EngineerProgramHours> ephA = new ArrayList<EngineerProgramHours>();
        EngineerProgramHours eph;
        while(rs.next()){ 
            eph = new EngineerProgramHours(
                rs.getInt("employees.EmployeeNo"),
                rs.getString("employees.EmployeeFName"),
                rs.getString("employees.EmployeeLName"),
                rs.getString("employees.Skill"),
                rs.getString("employees.JobTitle"),    
                rs.getInt("engineerprojects.EngineerHours"),
                rs.getInt("aircraft.ProgramNo"),
                rs.getString("aircraft.ProgramName")
            );
            ephA.add(eph);
        }
        
        Object[][] ephRows = new Object[ephA.size()][8];
        
        for (int i = 0; i < ephA.size(); i++){
            ephRows[i][0] = ephA.get(i).getEmployeeNo();
            ephRows[i][1] = ephA.get(i).getEmployeeFName();
            ephRows[i][2] = ephA.get(i).getEmployeeLName();
            ephRows[i][3] = ephA.get(i).getSkill();
            ephRows[i][4] = ephA.get(i).getJobTitle();
            ephRows[i][5] = ephA.get(i).getEngineerHours();
            ephRows[i][6] = ephA.get(i).getProgramNo();
            ephRows[i][7] = ephA.get(i).getProgramName();
        }
        
        String[] ephColumnNames = {"Employee No.","Employee FName","Employee LName", "Skill", "Job Title",
                                   "Engineer Hours", "Program No.", "Program Name"};
        
        ReportTableModel rtm = new ReportTableModel(ephColumnNames,ephRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Engineer to Drawing report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveEngineerEngineerDrawingsReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Engineer to Engineer Drawing Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT employees.EmployeeNo, "
                                    + "employees.EmployeeFName, "
                                    + "employees.EmployeeLName, "
                                    + "employees.Skill, "
                                    + "employees.JobTitle, "
                                    + "drawings.DrawingNo, "
                                    + "drawings.Drawing "
                             + "FROM employees "
                             + "JOIN engineerdrawings ON employees.EmployeeNo = engineerdrawings.EmployeeNo "
                             + "JOIN drawings ON drawings.DrawingNo = engineerdrawings.DrawingNo "
                             + "WHERE employees.JobTitle = 'Engineer'");
        
        ArrayList<EngineerEngineerDrawings> eedA = new ArrayList<EngineerEngineerDrawings>();
        EngineerEngineerDrawings eed;
        while(rs.next()){
            eed = new EngineerEngineerDrawings(
                rs.getInt("employees.EmployeeNo"),
                rs.getString("employees.EmployeeFName"),
                rs.getString("employees.EmployeeLName"),
                rs.getString("employees.Skill"),    
                rs.getString("employees.JobTitle"),
                rs.getInt("drawings.DrawingNo"),
                rs.getBytes("drawings.Drawing")
            );
            eedA.add(eed);
        }
        
        Object[][] eedRows = new Object[eedA.size()][7];
        
        for(int i = 0; i < eedA.size(); i++)
        {
            eedRows[i][0] = eedA.get(i).getEmployeeNo();
            eedRows[i][1] = eedA.get(i).getEmployeeFName();
            eedRows[i][2] = eedA.get(i).getEmployeeLName();
            eedRows[i][3] = eedA.get(i).getSkill();
            eedRows[i][4] = eedA.get(i).getJobTitle();
            eedRows[i][5] = eedA.get(i).getDrawingNo();
            if (eedA.get(i).getDrawing() != null) {
                ImageIcon drawing = new ImageIcon(
                        new ImageIcon(eedA.get(i).getDrawing()).getImage()
                                .getScaledInstance(160, 120, Image.SCALE_SMOOTH));
                eedRows[i][6] = drawing;
            } else {
                eedRows[i][6] = null;
            }
        }
        
        String[] eedColumnNames = {"Employee No.", "Employee FName", "Employee LName", "Skill", "Job Title", "Drawing No.","Drawing"};
        
        EngineerDrawingReportTableModel rtm = new EngineerDrawingReportTableModel(eedColumnNames, eedRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return rtm;
    }
    
    /**
     * Purpose: Retrieves Engineer to Drawing Changes report
     * @return
     * @throws SQLException 
     */
    public AbstractTableModel retrieveEngineerDrawingChangesReport() throws SQLException {
        
        Connection con = getConnection();
        Statement stmt;
        ResultSet rs;
        
        System.out.println("Retrieved Engineer Drawing Changes Report"); //For testing
        
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT drawings.DrawingNo, "
                                    + "drawings.Drawing, "
                                    + "drawings.Version, "
                                    + "drawings.VersionDateTime, "
                                    + "drawings.ReasonForChange, "
                                    + "employees.EmployeeNo, "
                                    + "employees.EmployeeFName, "
                                    + "employees.EmployeeLName, "
                                    + "employees.Skill, "
                                    + "employees.JobTitle "
                             + "FROM drawings "
                             + "JOIN engineerdrawings ON drawings.DrawingNo = engineerdrawings.DrawingNo "
                             + "JOIN employees ON employees.EmployeeNo = engineerdrawings.EmployeeNo "
                             + "WHERE employees.JobTitle = 'Engineer'");
        
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
                rs.getString("employees.EmployeeLName"),
                rs.getString("employees.Skill"),
                rs.getString("employees.JobTitle")    
            );
            edcA.add(edc);
        }
        
        Object[][] edcRows = new Object[edcA.size()][10];
        
        for(int i = 0; i < edcA.size(); i++)
        {
            edcRows[i][0] = edcA.get(i).getDrawingNo();
            if (edcA.get(i).getDrawing() != null) {
                ImageIcon drawing = new ImageIcon(
                        new ImageIcon(edcA.get(i).getDrawing()).getImage()
                                .getScaledInstance(160, 120, Image.SCALE_SMOOTH));
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
            edcRows[i][8] = edcA.get(i).getSkill();
            edcRows[i][9] = edcA.get(i).getJobTitle(); 
        }
        
        String[] edcColumnNames = {"Drawing No.","Drawing","Version",
                                "Version DateTime", "Reason For Change", 
                                "Employee No.", "Employee FName", "Employee LName", "Skill","Job Title"};
        
        DrawingChangesReportTableModel dcrtm = new DrawingChangesReportTableModel(edcColumnNames,edcRows){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        return dcrtm;
    }
    
    /**
     * Purpose: Inserts a row into Customer to Programs report
     * @return
     * @throws SQLException 
     */
    public void insertRowCustomerProgramsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Customer to Purchases report
     * @return
     * @throws SQLException 
     */
    public void insertRowCustomerPurchasesReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Open Orders report
     * @return
     * @throws SQLException 
     */
    public void insertRowOpenOrdersReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Parts to Aircraft report
     * @return
     * @throws SQLException 
     */
    public void insertRowPartsAircraftReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Parts report
     * @return
     * @throws SQLException 
     */
    public void insertRowPartsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Aircraft to Parts report
     * @return
     * @throws SQLException 
     */
    public void insertRowAircraftPartsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Engineer to Programs report
     * @return
     * @throws SQLException 
     */
    public void insertRowEngineerProgramsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Engineer to Program Hours report
     * @return
     * @throws SQLException 
     */
    public void insertRowEngineerProgramHoursReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Engineer to Drawing report
     * @return
     * @throws SQLException 
     */
    public void insertRowEngineerEngineerDrawingsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Inserts a row into Engineer to Drawing Changes report
     * @return
     * @throws SQLException 
     */
    public void insertRowEngineerDrawingChangesReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Customer to Programs report
     * @return
     * @throws SQLException 
     */
    public void deleteRowCustomerProgramsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Customer to Purchases report
     * @return
     * @throws SQLException 
     */
    public void deleteRowCustomerPurchasesReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Open Orders report
     * @return
     * @throws SQLException 
     */
    public void deleteRowOpenOrdersReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Parts to Aircraft report
     * @return
     * @throws SQLException 
     */
    public void deleteRowPartsAircraftReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Parts report
     * @return
     * @throws SQLException 
     */
    public void deleteRowPartsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Aircraft to Parts report
     * @return
     * @throws SQLException 
     */
    public void deleteRowAircraftPartsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Engineer to Program report
     * @return
     * @throws SQLException 
     */
    public void deleteRowEngineerProgramsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Engineer to Program Hours report
     * @return
     * @throws SQLException 
     */
    public void deleteRowEngineerProgramHoursReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Engineer to Drawing report
     * @return
     * @throws SQLException 
     */
    public void deleteRowEngineerEngineerDrawingsReport(JTextField value) throws SQLException {
        
    }
    
    /**
     * Purpose: Deletes a row into Engineer to Drawing Changes report
     * @return
     * @throws SQLException 
     */
    public void deleteRowEngineerDrawingChangesReport(JTextField value) throws SQLException {
        
    }

}
