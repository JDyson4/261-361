package View;

import java.util.HashMap;

/**
 * Purpose: Used to display LoginFrame on the computer screen
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