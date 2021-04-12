package Model;

/**
 * Purpose: Object to store one row of Open Orders report
 */
public class OpenOrders {
    private int orderNo;
    private String orderDateTime;
    private int customerNo;
    
    public OpenOrders(int orNo, String oDT, int custNo) {
        orderNo = orNo;
        orderDateTime = oDT;
        customerNo = custNo;
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
