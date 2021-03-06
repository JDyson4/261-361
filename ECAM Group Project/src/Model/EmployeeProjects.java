/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class EmployeeProjects {
    private int employeeNo;
    private int projectNo;
    
    public EmployeeProjects() {
        
    }
    public EmployeeProjects(int empNo, int projNo) {
        employeeNo = empNo;
        projectNo = projNo;
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
}
