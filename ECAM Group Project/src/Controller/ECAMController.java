/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ECAMModel;
import View.ECAMMainFrame;
import View.ECAMView;
import java.awt.event.*;
/**
 *
 * @author jpdys
 */
public class ECAMController {
    //
    private ECAMModel model;
    private ECAMView view;
    
    public ECAMController(ECAMModel model, ECAMView view) {
        this.model = model;
        this.view = view;
        
        view.getLogin().getExitLabel().addMouseListener( //Exit Label MouseListener
            new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent evt)
                {
                    System.exit(0);
                }
            }
        );//end JLabel1 end MouseListener
        
        view.getLogin().getUsernameField().addFocusListener( //Username FocusListener
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
        
        view.getLogin().getPasswordField().addFocusListener( //Password FocusListener
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
        
        view.getLogin().getUsernameField().addMouseListener( //Username KeyListener
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
        
        view.getLogin().getPasswordField().addMouseListener( //Password MouseListener
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
        
        view.getLogin().getSignInButton().addActionListener( //Sign in ActionListener
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
                            ECAMMainFrame mf = new ECAMMainFrame();
                            mf.getGoButton().addActionListener(
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        mf.getDtm().setRowCount(0);
                                        if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                            && "Human Resources Report 1".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            mf.getDtm().setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Age"});
                                            mf.getRowData1();
                                        } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                   && "Human Resources Report 2".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                            mf.getDtm().setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Age","Work No.","Job Title","Employer","Hours","Height","Nickname","Hello","Width"});
                                            mf.getRowData2();
                                        }
                                        mf.getReportDataTable().setModel(mf.getDtm());
                                    }
                                }
                            );
                            mf.getSaveItem().addActionListener(
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("Save as... clicked");
                                    }
                                }
                            );
                            mf.getExitItem().addActionListener(
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.exit(0);
                                    } 
                                }
                            );
                            mf.getInsertItem().addActionListener(
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("Insert row... clicked");
                                    }
                                }
                            );
                            mf.getDeleteItem().addActionListener(
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("Delete row... clicked");
                                    }
                                }
                            );
                            mf.getDeptsComboBox().addActionListener(
                                new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        mf.getReportComboBox().removeAllItems();
                                        if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Sales Report 1");
                                            mf.getReportComboBox().addItem("Sales Report 2");
                                            mf.getReportComboBox().addItem("Sales Report 3");
                                        } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Manufacturing Report 1");
                                            mf.getReportComboBox().addItem("Manufacturing Report 2");
                                            mf.getReportComboBox().addItem("Manufacturing Report 3");
                                        } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Human Resources Report 1");
                                            mf.getReportComboBox().addItem("Human Resources Report 2");
                                        } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                        {
                                            mf.getReportComboBox().addItem("Engineering Report 1");
                                            mf.getReportComboBox().addItem("Engineering Report 2");
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
        
        view.getLogin().getUsernameField().addKeyListener( //Username KeyListener
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
                                ECAMMainFrame mf = new ECAMMainFrame();
                                mf.getGoButton().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            mf.getDtm().setRowCount(0);
                                            if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                && "Human Resources Report 1".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                mf.getDtm().setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Age"});
                                                mf.getRowData1();
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                       && "Human Resources Report 2".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                mf.getDtm().setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Age","Work No.","Job Title","Employer","Hours","Height","Nickname","Hello","Width"});
                                                mf.getRowData2();
                                            }
                                            mf.getReportDataTable().setModel(mf.getDtm());
                                        }
                                    }
                                );
                                mf.getSaveItem().addActionListener(
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Save as... clicked");
                                        }
                                    }
                                );
                                mf.getExitItem().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.exit(0);
                                        } 
                                    }
                                );
                                mf.getInsertItem().addActionListener(
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Insert row... clicked");
                                        }
                                    }
                                );
                                mf.getDeleteItem().addActionListener(
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Delete row... clicked");
                                        }
                                    }
                                );
                                mf.getDeptsComboBox().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            mf.getReportComboBox().removeAllItems();
                                            if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Sales Report 1");
                                                mf.getReportComboBox().addItem("Sales Report 2");
                                                mf.getReportComboBox().addItem("Sales Report 3");
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Manufacturing Report 1");
                                                mf.getReportComboBox().addItem("Manufacturing Report 2");
                                                mf.getReportComboBox().addItem("Manufacturing Report 3");
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Human Resources Report 1");
                                                mf.getReportComboBox().addItem("Human Resources Report 2");
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Engineering Report 1");
                                                mf.getReportComboBox().addItem("Engineering Report 2");
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
        
        view.getLogin().getPasswordField().addKeyListener( //Password KeyListener
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
                                ECAMMainFrame mf = new ECAMMainFrame();
                                mf.getGoButton().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            mf.getDtm().setRowCount(0);
                                            if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                && "Human Resources Report 1".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                mf.getDtm().setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Age"});
                                                mf.getRowData1();
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem()))
                                                       && "Human Resources Report 2".equals(String.valueOf(mf.getReportComboBox().getSelectedItem()))) {
                                                mf.getDtm().setColumnIdentifiers(new Object[]{"ID","First Name","Last Name","Age","Work No.","Job Title","Employer","Hours","Height","Nickname","Hello","Width"});
                                                mf.getRowData2();
                                            }
                                            mf.getReportDataTable().setModel(mf.getDtm());
                                        }
                                    }
                                );
                                mf.getSaveItem().addActionListener(
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Save as... clicked");
                                        }
                                    }
                                );
                                mf.getExitItem().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.exit(0);
                                        } 
                                    }
                                );
                                mf.getInsertItem().addActionListener(
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Insert row... clicked");
                                        }
                                    }
                                );
                                mf.getDeleteItem().addActionListener(
                                    new ActionListener()
                                        {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Delete row... clicked");
                                        }
                                    }
                                );
                                mf.getDeptsComboBox().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            mf.getReportComboBox().removeAllItems();
                                            if ("Sales".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Sales Report 1");
                                                mf.getReportComboBox().addItem("Sales Report 2");
                                                mf.getReportComboBox().addItem("Sales Report 3");
                                            } else if ("Manufacturing".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Manufacturing Report 1");
                                                mf.getReportComboBox().addItem("Manufacturing Report 2");
                                                mf.getReportComboBox().addItem("Manufacturing Report 3");
                                            } else if ("Human Resources".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Human Resources Report 1");
                                                mf.getReportComboBox().addItem("Human Resources Report 2");
                                            } else if ("Engineering".equals(String.valueOf(mf.getDeptsComboBox().getSelectedItem())))
                                            {
                                                mf.getReportComboBox().addItem("Engineering Report 1");
                                                mf.getReportComboBox().addItem("Engineering Report 2");
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
