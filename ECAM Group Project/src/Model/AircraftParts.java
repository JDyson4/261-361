/**
 * 
 */
package Model;

/**
 *
 * @author Catie
 */
public class AircraftParts {
    
    private int programNo,
                partNo,
                partInvent;
    private String programName,
                   partVendor;

    public AircraftParts() {
    }

    public AircraftParts(int programNo, int partNo, int partInvent, String programName, String partVendor) {
        this.programNo = programNo;
        this.partNo = partNo;
        this.partInvent = partInvent;
        this.programName = programName;
        this.partVendor = partVendor;
    }

    public int getProgramNo() {
        return programNo;
    }

    public void setProgramNo(int programNo) {
        this.programNo = programNo;
    }

    public int getPartNo() {
        return partNo;
    }

    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    public int getPartInvent() {
        return partInvent;
    }

    public void setPartInvent(int partInvent) {
        this.partInvent = partInvent;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getPartVendor() {
        return partVendor;
    }

    public void setPartVendor(String partVendor) {
        this.partVendor = partVendor;
    }
    
}
