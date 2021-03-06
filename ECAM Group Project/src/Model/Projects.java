/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jpdys
 */
public class Projects {
    private int projectNo;
    private int programMadeBy;
    
    public Projects() {
        
    }
    public Projects(int projNo, int progMadeBy) {
        projectNo = projNo;
        programMadeBy = progMadeBy;
    }

    /**
     * @return the projectNo
     */
    public int getProjectNo() {
        return projectNo;
    }

    /**
     * @param projectNo the projectNo to set
     */
    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    /**
     * @return the programMadeBy
     */
    public int getProgramMadeBy() {
        return programMadeBy;
    }

    /**
     * @param programMadeBy the programMadeBy to set
     */
    public void setProgramMadeBy(int programMadeBy) {
        this.programMadeBy = programMadeBy;
    }
}
