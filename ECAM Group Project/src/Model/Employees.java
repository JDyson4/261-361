/**
 * Employees.java
 * IST 261/361
 * Purpose: 
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jpdys
 */
public class Employees {
    private ArrayList<Integer> employeeNo = new ArrayList<>();
    private ArrayList<String> empFirstName = new ArrayList<>();
    private ArrayList<String> empLastName = new ArrayList<>();
    private ArrayList<String> skill = new ArrayList<>();
    private ArrayList<String> jobTitle = new ArrayList<>();
    
    public Employees (ArrayList<Integer> empNo, ArrayList<String> empFName, ArrayList<String> empLName, 
            ArrayList<String> empSkill, ArrayList<String> empJob) {
        employeeNo = empNo;
        empFirstName = empFName;
        empLastName = empLName;
        skill = empSkill;
        jobTitle = empJob;
    }

    /**
     * @return the employeeNo
     */
    public ArrayList<Integer> getEmployeeNo() {
        return employeeNo;
    }

    /**
     * @param employeeNo the employeeNo to set
     */
    public void setEmployeeNo(ArrayList<Integer> employeeNo) {
        this.employeeNo = employeeNo;
    }

    /**
     * @return the empFirstName
     */
    public ArrayList<String> getEmpFirstName() {
        return empFirstName;
    }

    /**
     * @param empFirstName the empFirstName to set
     */
    public void setEmpFirstName(ArrayList<String> empFirstName) {
        this.empFirstName = empFirstName;
    }

    /**
     * @return the empLastName
     */
    public ArrayList<String> getEmpLastName() {
        return empLastName;
    }

    /**
     * @param empLastName the empLastName to set
     */
    public void setEmpLastName(ArrayList<String> empLastName) {
        this.empLastName = empLastName;
    }

    /**
     * @return the skill
     */
    public ArrayList<String> getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(ArrayList<String> skill) {
        this.skill = skill;
    }

    /**
     * @return the jobTitle
     */
    public ArrayList<String> getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(ArrayList<String> jobTitle) {
        this.jobTitle = jobTitle;
    }
}
