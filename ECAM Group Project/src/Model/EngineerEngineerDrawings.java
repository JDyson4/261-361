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
public class EngineerEngineerDrawings {
    
    private int employeeNo;
    private String employeeFName;
    private String employeeLName;
    private String skill;
    private String jobTitle;
    private int drawingNo;
    private byte[] drawing;
    
    public EngineerEngineerDrawings(int eN, String eFN, String eLN, String s, String jT, int dNO, byte[] d) {
        this.employeeNo = eN;
        this.employeeFName = eFN;
        this.employeeLName = eLN;
        this.skill = s;
        this.jobTitle = jT;
        this.drawingNo = dNO;
        this.drawing = d;
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
     * @return the drawingNo
     */
    public int getDrawingNo() {
        return drawingNo;
    }

    /**
     * @param drawingNo the drawingNo to set
     */
    public void setDrawingNo(int drawingNo) {
        this.drawingNo = drawingNo;
    }

    /**
     * @return the drawing
     */
    public byte[] getDrawing() {
        return drawing;
    }

    /**
     * @param drawing the drawing to set
     */
    public void setDrawing(byte[] drawing) {
        this.drawing = drawing;
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
