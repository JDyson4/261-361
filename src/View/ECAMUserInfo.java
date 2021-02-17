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
public class ECAMUserInfo {
    
    private HashMap<String,String> userInfo = new HashMap<String,String>();
    
    public ECAMUserInfo() {
        userInfo.put("rwm5661", "noiceCar102!");
        userInfo.put("jvd5799", "jdyson");
        userInfo.put("can26", "susieq");
    }
    
    protected HashMap<String,String> getUserInfo() {
        return userInfo;
    }
}
