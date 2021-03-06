/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class Employees {
    private int employeeNo;
    private String empFirstName;
    private String empLastName;
    private String skill;
    private String jobTitle;
    
    public Employees (int empNo, String empFName, String empLName, 
            String empSkill, String empJob) {
        employeeNo = empNo;
        empFirstName = empFName;
        empLastName = empLName;
        skill = empSkill;
        jobTitle = empJob;
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
     * @return the empFirstName
     */
    public String getEmpFirstName() {
        return empFirstName;
    }

    /**
     * @param empFirstName the empFirstName to set
     */
    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    /**
     * @return the empLastName
     */
    public String getEmpLastName() {
        return empLastName;
    }

    /**
     * @param empLastName the empLastName to set
     */
    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
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
}
