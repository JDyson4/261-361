/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ECAMModel;
import View.ECAMView;
import java.util.*;
import java.io.*;
import java.sql.*;
/**
 *
 * @author jpdys
 */
public class ECAMController {
    
    ECAMModel model;
    ECAMView view;
    
    public ECAMController(ECAMModel model, ECAMView view) {
        this.model = model;
        this.view = view;
        System.out.println("Catie was here");
    }
    
    public static void main(String[] args) {
        ECAMModel model = new ECAMModel();
        ECAMView view = new ECAMView();
        ECAMController controller = new ECAMController(model, view);
    }
}
