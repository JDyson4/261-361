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
    
    public CustomerPrograms(int prNo, int custNo) {
        programNo = prNo;
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
