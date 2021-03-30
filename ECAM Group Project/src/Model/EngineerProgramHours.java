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
public class EngineerProgramHours {
    
    private int employeeNo;
    private String employeeFName;
    private String employeeLName;
    private String skill;
    private String jobTitle;
    private int engineerHours;
    private int programNo;
    private String programName;
    
    public EngineerProgramHours(int eN, String eFN, String eLN, String s, String jT, int eH, int pNo, String pNa) {
        this.employeeNo = eN;
        this.employeeFName = eFN;
        this.employeeLName = eLN;
        this.skill = s;
        this.jobTitle = jT;
        this.engineerHours = eH;
        this.programNo = pNo;
        this.programName = pNa;
    }

    /**
     * @return the employeeNo
     */
    public int getEmployeeNo() {
        return employeeNo;
    }

    /**
     * @param employeeNo the employeeNo to set
     */
    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    /**
     * @return the employeeFName
     */
    public String getEmployeeFName() {
        return employeeFName;
    }

    /**
     * @param employeeFName the employeeFName to set
     */
    public void setEmployeeFName(String employeeFName) {
        this.employeeFName = employeeFName;
    }

    /**
     * @return the employeeLName
     */
    public String getEmployeeLName() {
        return employeeLName;
    }

    /**
     * @param employeeLName the employeeLName to set
     */
    public void setEmployeeLName(String employeeLName) {
        this.employeeLName = employeeLName;
    }

    /**
     * @return the engineerHours
     */
    public int getEngineerHours() {
        return engineerHours;
    }

    /**
     * @param engineerHours the engineerHours to set
     */
    public void setEngineerHours(int engineerHours) {
        this.engineerHours = engineerHours;
    }

    /**
     * @return the programNo
     */
    public int getProgramNo() {
        return programNo;
    }

    /**
     * @param programNo the programNo to set
     */
    public void setProgramNo(int programNo) {
        this.programNo = programNo;
    }

    /**
     * @return the programName
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * @param programName the programName to set
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }
}
