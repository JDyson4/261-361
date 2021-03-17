package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIVER
 */
public class User {
    
    private int id;
    private String fName;
    private String lName;
    private int age;
    
    public User(int i, String fn, String ln, int a) {
        this.id = i;
        this.fName = fn;
        this.lName = ln;
        this.age = a;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
}
