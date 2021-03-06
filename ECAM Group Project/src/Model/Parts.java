/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class Parts {
    private int partNo;
    private int inventory;
    private String vendor;
    
    public Parts() {
        
    }
    public Parts(int partNum, int qty, String vendr) {
        partNo = partNum;
        inventory = qty;
        vendor = vendr;
    }

    /**
     * @return the partNo
     */
    public int getPartNo() {
        return partNo;
    }

    /**
     * @param partNo the partNo to set
     */
    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    /**
     * @return the inventory
     */
    public int getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the vendor
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * @param vendor the vendor to set
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
