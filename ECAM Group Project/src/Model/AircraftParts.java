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
                partNo;

    public AircraftParts() {
    }

    public AircraftParts(int programNo, int partNo) {
        this.programNo = programNo;
        this.partNo = partNo;
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
    
}
