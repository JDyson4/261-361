package Model;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 * Purpose: Custom AbstractTableModel for all reports beside 
 * the Engineer to Drawing Changes report and the Engineer to Drawing report
 */
public class ReportTableModel extends AbstractTableModel {

    private String[] columnNames;
    private Object[][] rows;
    
    public ReportTableModel(String[] c, Object[][] r) {
        this.columnNames = c;
        this.rows = r;
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col){
        return this.columnNames[col];
    }
    
    @Override
    public Class getColumnClass(int column){
        return getValueAt(0,column).getClass();
    }
}
