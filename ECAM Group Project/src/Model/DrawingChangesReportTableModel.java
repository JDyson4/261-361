package Model;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 * Purpose: Custom AbstractTableModel for Engineer to Drawing Changes report
 */
public class DrawingChangesReportTableModel extends AbstractTableModel {

    private String[] columnNames;
    private Object[][] rows;
    
    public DrawingChangesReportTableModel(String[] c, Object[][] r) {
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
        if(column == 1){
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
}
