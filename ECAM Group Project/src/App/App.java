package App;

import Controller.ECAMController;
import Model.ECAMModel;
import View.ECAMView;
import java.sql.SQLException;

/**
 * Purpose: Runs MVC structured application
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ECAMModel model = new ECAMModel();
        ECAMView view = new ECAMView();
        ECAMController controller = new ECAMController(model, view);
    }
    
}
