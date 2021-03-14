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
    
    public ECAMDatabase db;
    
    public ECAMModel() {
        db = new ECAMDatabase();
    }

    /**
     * @return the db
     */
    public ECAMDatabase getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(ECAMDatabase db) {
        this.db = db;
    }

}
