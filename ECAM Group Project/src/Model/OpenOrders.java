/**
 * 
 */
package Model;

/**
 *
 * @author RIVER
 */
public class OpenOrders {
    private int orderNo;
    private int customerNo;
    private String orderDateTime;
    
    public OpenOrders(int orNo, int custNo, String oDT) {
        orderNo = orNo;
        customerNo = custNo;
        orderDateTime = oDT;
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
