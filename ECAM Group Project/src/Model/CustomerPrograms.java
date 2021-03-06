/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class CustomerPrograms {
    private int programNo;
    private int customerNo;
    
    public CustomerPrograms() {
        
    }
    public CustomerPrograms(int progNo, int custNo) {
        programNo = progNo;
        customerNo = custNo;
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
}
