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
public class EngineerPrograms {
    
    private int employeeNo;
    private String employeeFName;
    private String employeeLName;
    private int programNo;
    private String programName;
    
    public EngineerPrograms(int eN, String eFN, String eLN, int pNo, String pNa) {
        this.employeeNo = eN;
        this.employeeFName = eFN;
        this.employeeLName = eLN;
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
}
