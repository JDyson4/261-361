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
public class User2 {
    
    private int id;
    private String fName;
    private String lName;
    private int age;
    public int workNo;
    public String job;
    public String employer;
    public int hours;
    public int height;
    public String nName;
    public String hello;
    public int width;
    
    public User2(int i, String fn, String ln, int a, int wn, String j, String e, int h, int hi, String n, String he, int w) {
        this.id = i;
        this.fName = fn;
        this.lName = ln;
        this.age = a;
        this.workNo = wn;
        this.job = j;
        this.employer = e;
        this.hours = h;
        this.height = hi;
        this.nName = n;
        this.hello = he;
        this.width = w;
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

    /**
     * @return the workNo
     */
    public int getWorkNo() {
        return workNo;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @return the employer
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return the nName
     */
    public String getnName() {
        return nName;
    }

    /**
     * @return the hello
     */
    public String getHello() {
        return hello;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }
}
