/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.HashMap;

/**
 *
 * @author RIVER
 */
public class ECAMView {
    
    private ECAMLoginFrame login;
    private ECAMMainFrame mainFrame;
    private HashMap<String,String> userInfoOrig = new ECAMUserInfo().getUserInfo();
    
    public ECAMView() {
        login = new ECAMLoginFrame(userInfoOrig);
    }

    /**
     * @return the login
     */
    public ECAMLoginFrame getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(ECAMLoginFrame login) {
        this.login = login;
    }
    
    public void openMainFrame() {
        mainFrame = new ECAMMainFrame();
    }

    /**
     * @return the mainFrame
     */
    public ECAMMainFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * @param mainFrame the mainFrame to set
     */
    public void setMainFrame(ECAMMainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    
}
