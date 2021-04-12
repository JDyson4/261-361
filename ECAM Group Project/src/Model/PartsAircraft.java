package Model;

/**
 * Purpose: Object to store one row of Parts to Aircraft report
 */
public class PartsAircraft {
    private int programNo;
    private int partNo;
    private String programName;
    private int inventory;
    private String vendor;
    
    public PartsAircraft(int prNo, int prtNo, String prName, int invtry, String vndr) {
        programNo = prNo;
        partNo = prtNo;
        programName = prName;
        inventory = invtry;
        vendor = vndr;
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