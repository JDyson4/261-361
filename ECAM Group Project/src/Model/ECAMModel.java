/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author RIVER
 */
public class ECAMModel {
    
    private ECAMDatabase db;
    private ECAMUserInfo userInfo;
    
    public ECAMModel() {
        db = new ECAMDatabase();
        userInfo = new ECAMUserInfo();
    }

    /**
     * @return the db
     */
    public ECAMDatabase getDB() {
        return db;
    }

    public ECAMUserInfo getUserInfo() {
        return userInfo;
    }
}
