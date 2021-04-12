package Model;

/**
 * Purpose: Used to access the Database class and its methods, 
 * as well as the UserInfo class 
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
