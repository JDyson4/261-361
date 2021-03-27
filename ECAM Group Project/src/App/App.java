/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controller.ECAMController;
import Model.ECAMDatabase;
import Model.ECAMModel;
import View.ECAMView;
import java.sql.SQLException;

/**
 *
 * @author RIVER
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ECAMModel model = new ECAMModel();
        ECAMView view = new ECAMView();
        ECAMController controller = new ECAMController(model, view);
        ECAMDatabase db = new ECAMDatabase();
        db.getUsername();
    }
    
}
