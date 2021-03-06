/**
 * 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class Drawings {
    private String drawingTitle;
    private int programNo;
    private int version;
    private String versionDate;
    private String reasonForChange;
    
    public Drawings() {
        
    }
    public Drawings(String drawTitle, int progNo, int vers, 
            String versDate, String reason) {
        drawingTitle = drawTitle;
        programNo = progNo;
        version = vers;
        versionDate = versDate;
        reasonForChange = reason;
    }

    /**
     * @return the drawingTitle
     */
    public String getDrawingTitle() {
        return drawingTitle;
    }

    /**
     * @param drawingTitle the drawingTitle to set
     */
    public void setDrawingTitle(String drawingTitle) {
        this.drawingTitle = drawingTitle;
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
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * @return the versionDate
     */
    public String getVersionDate() {
        return versionDate;
    }

    /**
     * @param versionDate the versionDate to set
     */
    public void setVersionDate(String versionDate) {
        this.versionDate = versionDate;
    }

    /**
     * @return the reasonForChange
     */
    public String getReasonForChange() {
        return reasonForChange;
    }

    /**
     * @param reasonForChange the reasonForChange to set
     */
    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }
}
