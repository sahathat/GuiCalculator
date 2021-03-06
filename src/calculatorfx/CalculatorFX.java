/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sahat
 */
public class CalculatorFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //load resource form fxml.file
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        //create root scene
        Scene scene = new Scene(root);
        
        //create stage
        stage.setScene(scene);
        
        //show stage
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch stage
        launch(args);
    }
    
}
