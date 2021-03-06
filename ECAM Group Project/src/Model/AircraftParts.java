/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class AircraftParts {
    
    private int programNo;
    private int partNo;
    
    public AircraftParts() {

    }
    public AircraftParts(int progNo, int partNum) {
        programNo = progNo;
        partNo = partNum;
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
}
