package Controller;

import Model.ECAMModel;
import View.ECAMReportFrame;
import View.ECAMView;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Purpose: Used to channel interactions between the Model and View classes
 */
public class ECAMController {
    
    private ECAMModel model;
    private ECAMView view;
    private DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    
    public ECAMController(ECAMModel model, ECAMView view) {
        this.model = model;
        this.view = view;
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        view.getLogin().getExitLabel().addMouseListener( //Login Exit Label MouseListener
            new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent evt)
                {
                    System.exit(0);
                }
            }
        );//end JLabel1 end MouseListener
        
        view.getLogin().getUsernameField().addFocusListener( //Login Username FocusListener
            new FocusAdapter()
            {
                @Override
                public void focusLost(FocusEvent evt)
                {
                    if ("".equals(view.getLogin().getUsernameField().getText())) {
                        view.getLogin().getUsernameField().setText("Username");
                    }
                }
            }
        );//end Username FocusListener
        
        view.getLogin().getPasswordField().addFocusListener( //Login Password FocusListener
            new FocusAdapter()
            {
                @Override
                public void focusLost(FocusEvent evt)
                {
                    if (view.getLogin().getPasswordField().getPassword().length == 0) {
                        view.getLogin().getPasswordField().setText("Password");
                    }
                }
            }
        );//end Password FocusListener
        
        view.getLogin().getUsernameField().addMouseListener( //Login Username KeyListener
            new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent evt)
                {
                    //"Password" is the text in the password field then text in password field text is revealed
                    //Text is hidden if text in the password field does not equal "Password"
                    if ("Password".equals(String.valueOf(view.getLogin().getPasswordField().getPassword()))){
                        view.getLogin().getPasswordField().setEchoChar((char) 0);
                    }
                    //if "Username" is the text in the username field then username field text is set blank
                    if ("Username".equals(view.getLogin().getUsernameField().getText())){
                        view.getLogin().getUsernameField().setText("");
                    }
                }
            }
        );//end Username MouseListener
        
        view.getLogin().getPasswordField().addMouseListener( //Login Password MouseListener
            new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent evt)
                {
                    if ("Password".equals(String.valueOf(view.getLogin().getPasswordField().getPassword()))){
                        view.getLogin().getPasswordField().setText("");
                        view.getLogin().getPasswordField().setEchoChar((char)0x2022); //this will display '•' for every character in the password
                    }
                }
            }
        );//end Password MouseListener
        
        view.getLogin().getSignInButton().addActionListener(//Login Sign in ActionListener
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userID = view.getLogin().getUsernameField().getText();
                    String passcode = String.valueOf(view.getLogin().getPasswordField().getPassword());
        
                    if(model.getUserInfo().getUser().containsKey(userID)) {
                        if (model.getUserInfo().getUser().get(userID).equals(passcode)) {
                            view.getLogin().dispose();
                            //ActionListeners MainFrame
                            ECAMReportFrame mf = new ECAMReportFrame();
                            mf.getGoButton().addActionListener( //Go Button Action Listener to JTabel with different reports
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                            && "Customers to Programs".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveCustomerProgramsReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 4; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    if (i == 1){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(300);
                                                    }
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Customers to Purchases".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveCustomerPurchasesReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 4; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    if (i == 1){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(300);
                                                    }
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Open Orders".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveOpenOrdersReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 3; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Parts to Aircraft".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrievePartsAircraftReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 5; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Parts".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrievePartsReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 3; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Aircraft to Parts".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveAircraftPartsReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 5; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Engineers to Programs".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveEngineerProgramsReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 7; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Engineers to Program Hours".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveEngineerProgramHoursReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 8; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                    && "Engineers to Drawings".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveEngineerEngineerDrawingsReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 7; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                   && "Drawing Changes to Engineers".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            try {
                                                mf.getReportDataTable().setModel(model.getDB().retrieveEngineerDrawingChangesReport());
                                                mf.getReportDataTable().setRowHeight(120);
                                                for(int i = 0; i < 10; i++){
                                                    mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                }
                                                mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        }
                                    }
                                }
                            );
                            mf.getSaveItem().addActionListener( //Save Menu Item Action Listener
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("Save as... clicked");
                                    }
                                }
                            );
                            mf.getExitItem().addActionListener( //Exit Menu Item Action Listener
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.exit(0);
                                    } 
                                }
                            );
                            mf.getInsertItem().addActionListener( //Insert Menu Item Action Listener
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("Insert row... clicked");
                                    }
                                }
                            );
                            mf.getDeleteItem().addActionListener( //Delete Menu Item Action Listener
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("Delete row... clicked");
                                    }
                                }
                            );
                            mf.getDeptsComboBox().addActionListener( //Dept ComboBox Action Listener
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        mf.getReportComboBox().removeAllItems();
                                        if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Customers to Programs");
                                            mf.getReportComboBox().addItem("Customers to Purchases");
                                            mf.getReportComboBox().addItem("Open Orders");
                                        } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Parts to Aircraft");
                                            mf.getReportComboBox().addItem("Parts");
                                            mf.getReportComboBox().addItem("Aircraft to Parts");
                                        } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Engineers to Programs");
                                            mf.getReportComboBox().addItem("Engineers to Program Hours");
                                        } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Engineers to Drawings");
                                            mf.getReportComboBox().addItem("Drawing Changes to Engineers");
                                        }
                                        mf.getReportComboBox().setSelectedIndex(-1);
                                    }
                                }
                            );
                        } else {
                            view.getLogin().getLoginMessageLabel().setText("Password is incorrect");
                        }
                    } else {
                        view.getLogin().getLoginMessageLabel().setText("Username does not exist");
                    }
                }
            }
        );//end SignIn ActionListener
        
        view.getLogin().getUsernameField().addKeyListener(//Login Username KeyListener
            new KeyAdapter()
            {
                @Override
                public void keyPressed(KeyEvent evt)
                {
                    if ("Username".equals(view.getLogin().getUsernameField().getText())){
                        view.getLogin().getUsernameField().setText("");
                    }
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        String userID = view.getLogin().getUsernameField().getText();
                        String passcode = String.valueOf(view.getLogin().getPasswordField().getPassword());

                        if(model.getUserInfo().getUser().containsKey(userID)) {
                            if (model.getUserInfo().getUser().get(userID).equals(passcode)) {
                                view.getLogin().dispose();
                                //ActionListeners on MainFrame
                                ECAMReportFrame mf = new ECAMReportFrame();
                                mf.getGoButton().addActionListener( //Go Button Action Listener to JTabel with different reports
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                && "Customers to Programs".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveCustomerProgramsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 4; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                        if (i == 1){
                                                            mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(300);
                                                        }
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Customers to Purchases".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveCustomerPurchasesReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 4; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                        if (i == 1){
                                                            mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(300);
                                                        }
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Open Orders".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveOpenOrdersReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 3; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Parts to Aircraft".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrievePartsAircraftReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 5; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Parts".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrievePartsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 3; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Aircraft to Parts".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveAircraftPartsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 5; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Engineers to Programs".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerProgramsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 7; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Engineers to Program Hours".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerProgramHoursReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 8; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Engineers to Drawings".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerEngineerDrawingsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 7; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                       && "Drawing Changes to Engineers".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerDrawingChangesReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 10; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            }
                                        }
                                    }
                                );
                                mf.getSaveItem().addActionListener( //Save Menu Item Action Listener
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Save as... clicked");
                                        }
                                    }
                                );
                                mf.getExitItem().addActionListener( //Exit Menu Item Action Listener
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.exit(0);
                                        } 
                                    }
                                );
                                mf.getInsertItem().addActionListener( //Insert Menu Item Action Listener
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Insert row... clicked");
                                        }
                                    }
                                );
                                mf.getDeleteItem().addActionListener( //Delete Menu Item Action Listener
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Delete row... clicked");
                                        }
                                    }
                                );
                                mf.getDeptsComboBox().addActionListener( //Dept ComboBox Action Listener
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            mf.getReportComboBox().removeAllItems();
                                            if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Customers to Programs");
                                                mf.getReportComboBox().addItem("Customers to Purchases");
                                                mf.getReportComboBox().addItem("Open Orders");
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Parts to Aircraft");
                                                mf.getReportComboBox().addItem("Parts");
                                                mf.getReportComboBox().addItem("Aircraft to Parts");
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Engineers to Programs");
                                                mf.getReportComboBox().addItem("Engineers to Program Hours");
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Engineers to Drawings");
                                                mf.getReportComboBox().addItem("Drawing Changes to Engineers");
                                            }
                                            mf.getReportComboBox().setSelectedIndex(-1);
                                        }
                                    }
                                );
                            } else {
                                view.getLogin().getLoginMessageLabel().setText("Password is incorrect");
                            }
                        } else {
                            view.getLogin().getLoginMessageLabel().setText("Username does not exist");
                        }
                    }
                }
            }
        );//end Username KeyListener
        
        view.getLogin().getPasswordField().addKeyListener(//Login Password KeyListener
            new KeyAdapter()
            {
                @Override
                public void keyPressed(KeyEvent evt)
                {
                    if ("Password".equals(String.valueOf(view.getLogin().getPasswordField().getPassword()))){
                        view.getLogin().getPasswordField().setText("");
                        view.getLogin().getPasswordField().setEchoChar((char)0x2022); //this will display '•' for every character in the password
                    }
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        String userID = view.getLogin().getUsernameField().getText();
                        String passcode = String.valueOf(view.getLogin().getPasswordField().getPassword());

                        if(model.getUserInfo().getUser().containsKey(userID)) {
                            if (model.getUserInfo().getUser().get(userID).equals(passcode)) {
                                view.getLogin().dispose();
                                //ActionListener MainFrame
                                ECAMReportFrame mf = new ECAMReportFrame();
                                mf.getGoButton().addActionListener( //Go Button Action Listener to JTabel with different reports
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                && "Customers to Programs".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveCustomerProgramsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 4; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                        if (i == 1){
                                                            mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(300);
                                                        }
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Customers to Purchases".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveCustomerPurchasesReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 4; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                        if (i == 1){
                                                            mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(300);
                                                        }
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Open Orders".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveOpenOrdersReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 3; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Parts to Aircraft".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrievePartsAircraftReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 5; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Parts".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrievePartsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 3; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Aircraft to Parts".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveAircraftPartsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 5; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Engineers to Programs".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerProgramsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 7; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Engineers to Program Hours".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerProgramHoursReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 8; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                        && "Engineers to Drawings".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerEngineerDrawingsReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 7; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                       && "Drawing Changes to Engineers".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                try {
                                                    mf.getReportDataTable().setModel(model.getDB().retrieveEngineerDrawingChangesReport());
                                                    mf.getReportDataTable().setRowHeight(120);
                                                    for(int i = 0; i < 10; i++){
                                                        mf.getReportDataTable().getColumnModel().getColumn(i).setPreferredWidth(260);
                                                    }
                                                    mf.getReportDataTable().getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(String.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Double.class, centerRenderer);
                                                    mf.getReportDataTable().setDefaultRenderer(Integer.class, centerRenderer);
                                                } catch (SQLException ex) {
                                                    Logger.getLogger(ECAMController.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            }
                                        }
                                    }
                                );
                                mf.getSaveItem().addActionListener( //Save Menu Item Action Listener
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Save as... clicked");
                                        }
                                    }
                                );
                                mf.getExitItem().addActionListener( //Exit Menu Item Action Listener
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.exit(0);
                                        } 
                                    }
                                );
                                mf.getInsertItem().addActionListener( //Insert Menu Item Action Listener
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Insert row... clicked");
                                        }
                                    }
                                );
                                mf.getDeleteItem().addActionListener( //Delete Menu Item Action Listener
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Delete row... clicked");
                                        }
                                    }
                                );
                                mf.getDeptsComboBox().addActionListener( //Dept ComboBox Action Listener
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            mf.getReportComboBox().removeAllItems();
                                            if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Customers to Programs");
                                                mf.getReportComboBox().addItem("Customers to Purchases");
                                                mf.getReportComboBox().addItem("Open Orders");
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Parts to Aircraft");
                                                mf.getReportComboBox().addItem("Parts");
                                                mf.getReportComboBox().addItem("Aircraft to Parts");
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Engineers to Programs");
                                                mf.getReportComboBox().addItem("Engineers to Program Hours");
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Engineers to Drawings");
                                                mf.getReportComboBox().addItem("Drawing Changes to Engineers");
                                            }
                                            mf.getReportComboBox().setSelectedIndex(-1);
                                        }
                                    }
                                );
                            } else {
                                view.getLogin().getLoginMessageLabel().setText("Password is incorrect");
                            }
                        } else {
                            view.getLogin().getLoginMessageLabel().setText("Username does not exist");
                        }
                    }
                }
            }
        );//end Password KeyListener
        
    }//end Controller Constructor
}
