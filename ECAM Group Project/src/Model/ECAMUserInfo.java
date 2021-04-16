package Model;

import java.util.HashMap;

/**
 * Purpose: Object to store log-in credentials
 */
public class ECAMUserInfo {
    
    private HashMap<String,String> user;
    
    public ECAMUserInfo() {
        user = new HashMap<>();
        user.put("rwm5661", "noiceCar102!");
        user.put("jvd5799", "jdyson");
        user.put("can26", "susieq");
        user.put("participant", "test");
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
