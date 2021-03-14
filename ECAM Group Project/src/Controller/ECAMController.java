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
        
        view.getLogin().getjLabel1().addMouseListener(
            new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent evt)
                {
                    System.exit(0);
                }
            }
        );//end JLabel1 end MouseListener
        
        view.getLogin().getUsername().addFocusListener(
            new FocusAdapter()
            {
                @Override
                public void focusLost(FocusEvent evt)
                {
                    if ("".equals(view.getLogin().getUsername().getText())) {
                        view.getLogin().getUsername().setText("Username");
                    }
                }
            }
        );//end Username FocusListener
        
        view.getLogin().getPassword().addFocusListener(
            new FocusAdapter()
            {
                @Override
                public void focusLost(FocusEvent evt)
                {
                    if (view.getLogin().getPassword().getPassword().length == 0) {
                        view.getLogin().getPassword().setText("Password");
                    }
                }
            }
        );//end Password FocusListener
        
        view.getLogin().getUsername().addMouseListener(
            new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent evt)
                {
                    //"Password" is the text in the password field then text in password field text is revealed
                    //Text is hidden if text in the password field does not equal "Password"
                    if ("Password".equals(String.valueOf(view.getLogin().getPassword().getPassword()))){
                        view.getLogin().getPassword().setEchoChar((char) 0);
                    }
                    //if "Username" is the text in the username field then username field text is set blank
                    if ("Username".equals(view.getLogin().getUsername().getText())){
                        view.getLogin().getUsername().setText("");
                    }
                }
            }
        );//end Username MouseListener
        
        view.getLogin().getPassword().addMouseListener(
            new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent evt)
                {
                    if ("Password".equals(String.valueOf(view.getLogin().getPassword().getPassword()))){
                        view.getLogin().getPassword().setText("");
                        view.getLogin().getPassword().setEchoChar((char)0x2022); //this will display '•' for every character in the password
                    }
                }
            }
        );//end Password MouseListener
        
        view.getLogin().getSignIn().addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userID = view.getLogin().getUsername().getText();
                    String passcode = String.valueOf(view.getLogin().getPassword().getPassword());
        
                    if(view.getLogin().getUserInfo().containsKey(userID)) {
                        if (view.getLogin().getUserInfo().get(userID).equals(passcode)) {
                            view.getLogin().dispose();
                            ECAMMainFrame mf = new ECAMMainFrame();
                            mf.getInitialPanel().getjButton1().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e)
                                        {
                                            mf.getInitialPanel().getjLabel1().setText("River Was Here");
                                        }
                                    }    
                            );
                        } else {
                            view.getLogin().getjLabel3().setText("Password is incorrect");
                        }
                    } else {
                        view.getLogin().getjLabel3().setText("Username does not exist");
                    }
                }
            }
        );//end SignIn ActionListener
        
        view.getLogin().getUsername().addKeyListener(
            new KeyAdapter()
            {
                @Override
                public void keyPressed(KeyEvent evt)
                {
                    if ("Username".equals(view.getLogin().getUsername().getText())){
                        view.getLogin().getUsername().setText("");
                    }
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        String userID = view.getLogin().getUsername().getText();
                        String passcode = String.valueOf(view.getLogin().getPassword().getPassword());

                        if(view.getLogin().getUserInfo().containsKey(userID)) {
                            if (view.getLogin().getUserInfo().get(userID).equals(passcode)) {
                                view.getLogin().dispose();
                                ECAMMainFrame mf = new ECAMMainFrame();
                                mf.getInitialPanel().getjButton1().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e)
                                        {
                                            mf.getInitialPanel().getjLabel1().setText("River Was Here");
                                        }
                                    }    
                                );
                            } else {
                                view.getLogin().getjLabel3().setText("Password is incorrect");
                            }
                        } else {
                            view.getLogin().getjLabel3().setText("Username does not exist");
                        }
                    }
                }
            }
        );//end Username KeyListener
        
        view.getLogin().getPassword().addKeyListener(
            new KeyAdapter()
            {
                @Override
                public void keyPressed(KeyEvent evt)
                {
                    if ("Password".equals(String.valueOf(view.getLogin().getPassword().getPassword()))){
                        view.getLogin().getPassword().setText("");
                        view.getLogin().getPassword().setEchoChar((char)0x2022); //this will display '•' for every character in the password
                    }
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        String userID = view.getLogin().getUsername().getText();
                        String passcode = String.valueOf(view.getLogin().getPassword().getPassword());

                        if(view.getLogin().getUserInfo().containsKey(userID)) {
                            if (view.getLogin().getUserInfo().get(userID).equals(passcode)) {
                                view.getLogin().dispose();
                                ECAMMainFrame mf = new ECAMMainFrame();
                                mf.getInitialPanel().getjButton1().addActionListener(
                                    new ActionListener()
                                    {
                                        @Override
                                        public void actionPerformed(ActionEvent e)
                                        {
                                            mf.getInitialPanel().getjLabel1().setText("River Was Here");
                                        }
                                    }    
                                );
                            } else {
                                view.getLogin().getjLabel3().setText("Password is incorrect");
                            }
                        } else {
                            view.getLogin().getjLabel3().setText("Username does not exist");
                        }
                    }
                }
            }
        );//end Password KeyListener
        
    }//end Controller Constructor
}
