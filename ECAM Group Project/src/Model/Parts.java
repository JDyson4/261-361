package Model;

/**
 * Purpose: Object to store one row of Parts report
 */
public class Parts {
   
    private int partNo,
                inventory;
    private String vendor;

    public Parts() {
    }

    public Parts(int partNo, int inventory, String vendor) {
        this.partNo = partNo;
        this.inventory = inventory;
        this.vendor = vendor;
    }

    public int getPartNo() {
        return partNo;
    }

    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    
}
