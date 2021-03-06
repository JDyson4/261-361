/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class EmployeeDrawings {
    private int employeeNo;
    private String drawingTitle;
    
    public EmployeeDrawings() {
        
    }
    public EmployeeDrawings(int empNo, String drawTitle) {
        employeeNo = empNo;
        drawingTitle = drawTitle;
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
     * @return the drawingTitle
     */
    public String getDrawingTitle() {
        return drawingTitle;
    }

    /**
     * @param drawingTitle the drawingTitle to set
     */
    public void setDrawingTitle(String drawingTitle) {
        this.drawingTitle = drawingTitle;
    }
}
