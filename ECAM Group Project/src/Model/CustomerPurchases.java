/**
 * 
 */
package Model;

/**
 *
 * @author RIVER
 */
public class CustomerPurchases {
    private int customerNo;
    private String customerName;
    
    public CustomerPurchases(int custNo, String custName) {
        customerNo = custNo;
        customerName = custName;
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
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
}
