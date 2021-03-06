/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class Orders {
    private int orderNo;
    private int customerNo;
    private String orderDate;
    
    public Orders() {
        
    }
    public Orders(int ordNo, int custNo, String ordDate) {
        orderNo = ordNo;
        customerNo = custNo;
        orderDate = ordDate;
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
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
