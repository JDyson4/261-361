/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author RIVER
 */
public class ECAMUserInfo {
    
    private HashMap<String,String> user;
    
    public ECAMUserInfo() {
        user = new HashMap<>();
        user.put("rwm5661", "noiceCar102!");
        user.put("jvd5799", "jdyson");
        user.put("can26", "susieq");
        user.put("Username", "Password");
        user.put("", "Password");
        user.put("Username", "");
    }

    /**
     * @return the userInfo
     */
    public HashMap<String,String> getUser() {
        return user;
    }

}
