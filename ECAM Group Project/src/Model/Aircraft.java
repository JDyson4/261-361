/**
 * Aircraft.java
 * IST 261/361
 * Purpose: 
 */
package Model;

/**
 *
 * @author jpdys
 */
public class Aircraft {
    private int programNo;
    
    public Aircraft() {
        
    }
    public Aircraft(int progNo) {
        programNo = progNo;
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
}
