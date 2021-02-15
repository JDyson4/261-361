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
public class ECAMModel {
    
    ECAMUserInfo eCAMUserInfo;
    
    ECAMModel() {
        eCAMUserInfo = new ECAMUserInfo();
    }
    
    protected HashMap getUserInfo() {
        return eCAMUserInfo.userInfo;
    }
}
