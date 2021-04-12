package Model;

/**
 * Purpose: Object to store one row of Aircraft to Parts report
 */
public class AircraftParts {
    
    private int programNo;
    private String programName;
    private int partNo;
    private int inventory;
    private String vendor;

    public AircraftParts(int progNo, String progName, int pNo, int inv, String ven) {
        programNo = progNo;
        partNo = pNo;
        inventory = inv;
        programName = progName;
        vendor = ven;
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
