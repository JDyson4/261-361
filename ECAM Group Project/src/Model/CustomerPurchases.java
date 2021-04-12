package Model;

/**
 * Purpose: Object to store one row of Customers to Purchases report
 */
public class CustomerPurchases {
    private int customerNo;
    private String customerName;
    private int orderNo;
    private String orderDateTime;
    
    public CustomerPurchases(int custNo, String custName, int ordNo, String ordDT) {
        customerNo = custNo;
        customerName = custName;
        orderNo = ordNo;
        orderDateTime = ordDT;
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

    /**
     * @return the orderNo
     */
    public int getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return the orderDateTime
     */
    public String getOrderDateTime() {
        return orderDateTime;
    }

    /**
     * @param orderDateTime the orderDateTime to set
     */
    public void setOrderDateTime(String orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
    
}
