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
    
    public ECAMView() {
        login = new ECAMLoginFrame();
    }

    /**
     * @return the login
     */
    public ECAMLoginFrame getLogin() {
        return login;
    }  
}