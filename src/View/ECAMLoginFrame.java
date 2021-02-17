/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author RIVER
 */
public class ECAMLoginFrame extends javax.swing.JFrame {
    
    private HashMap<String,String> userInfo = new HashMap<String,String>();
    
    public ECAMLoginFrame(HashMap<String,String> userInfoOrig) {
        userInfo = userInfoOrig;
        initComponents();
        setLocationRelativeTo(null);
        username.setCaretPosition(0);
        password.setEchoChar((char) 0);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        signIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(325, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ECAM Co.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Haettenschweiler", 0, 51)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Manager");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 230, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setFocusable(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(325, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(102, 102, 255));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        username.setToolTipText("");
        username.setBorder(null);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 210, 30));

        password.setBackground(new java.awt.Color(102, 102, 255));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 210, 30));

        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 30));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 30));

        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 30));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, 30));

        signIn.setBackground(new java.awt.Color(105, 105, 255));
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setText("Sign In");
        signIn.setBorder(null);
        signIn.setFocusable(false);
        signIn.setPreferredSize(new java.awt.Dimension(30, 15));
        signIn.setRequestFocusEnabled(false);
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jPanel2.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 70, 25));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 240, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        String userID = username.getText();
        String passcode = String.valueOf(password.getPassword());
        
        if(userInfo.containsKey(userID)) {
            if (userInfo.get(userID).equals(passcode)) {
                this.dispose();
                ECAMMainFrame mainFrame = new ECAMMainFrame();
            } else {
                jLabel3.setText("Username or password incorrect");
            }
        } else {
            jLabel3.setText("Username does not exist");
        }
    }//GEN-LAST:event_signInActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained

    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained

    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if ("".equals(username.getText())) {
            username.setText("Username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getPassword().length == 0) {
            password.setText("Password");
        }
    }//GEN-LAST:event_passwordFocusLost

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        //"Password" is the text in the password field then text in password field text is revealed
        //Text is hidden if text in the password field does not equal "Password"
        if ("Password".equals(String.valueOf(password.getPassword()))){
            password.setEchoChar((char) 0);
        }
        //if "Username" is the text in the username field then username field text is set blank
        if ("Username".equals(username.getText())){
            username.setText("");
        }
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        if ("Password".equals(String.valueOf(password.getPassword()))){
            password.setText("");
            password.setEchoChar((char)0x2022); //this will display '•' for every character in the password
        }
    }//GEN-LAST:event_passwordMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        if ("Username".equals(username.getText())){
            username.setText("");
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String userID = username.getText();
            String passcode = String.valueOf(password.getPassword());
        
            if(userInfo.containsKey(userID)) {
                if (userInfo.get(userID).equals(passcode)) {
                    this.dispose();
                    ECAMMainFrame mainFrame = new ECAMMainFrame();
                } else {
                    jLabel3.setText("Username or password incorrect");
                }
            } else {
                jLabel3.setText("Username does not exist");
            }
        }
    }//GEN-LAST:event_usernameKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if ("Password".equals(String.valueOf(password.getPassword()))){
            password.setText("");
            password.setEchoChar((char)0x2022); //this will display '•' for every character in the password
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String userID = username.getText();
            String passcode = String.valueOf(password.getPassword());
        
            if(userInfo.containsKey(userID)) {
                if (userInfo.get(userID).equals(passcode)) {
                    this.dispose();
                    ECAMMainFrame mainFrame = new ECAMMainFrame();
                } else {
                    jLabel3.setText("Username or password incorrect");
                }
            } else {
                jLabel3.setText("Username does not exist");
            }
        }
    }//GEN-LAST:event_passwordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signIn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
