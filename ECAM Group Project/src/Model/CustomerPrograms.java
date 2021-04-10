/**
 * 
 */
package Model;

/**
 *
 * @author John
 */
public class CustomerPrograms {
    private int programNo;
    private int customerNo;
    private String programName;
    private String customerFName;
    private String customerLName;
    
    public CustomerPrograms(int prNo, int custNo, String prName, String custFName, String custLName) {
        programNo = prNo;
        customerNo = custNo;
        programName = prName;
        customerFName = custFName;
        customerLName = custLName;
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
     * @return the customerNo
     */
    public int getCustomerNo() {
        return customerNo;
    }

    /**
     * @param customerNo the customerNo to set
     */
    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
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
     * @return the customerFName
     */
    public String getCustomerFName() {
        return customerFName;
    }

    /**
     * @param customerFName the customerFName to set
     */
    public void setCustomerFName(String customerFName) {
        this.customerFName = customerFName;
    }

    /**
     * @return the customerLName
     */
    public String getCustomerLName() {
        return customerLName;
    }

    /**
     * @param customerLName the customerLName to set
     */
    public void setCustomerLName(String customerLName) {
        this.customerLName = customerLName;
    }
    
}
