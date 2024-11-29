/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package primerjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Juan Antonio
 */
public class PrimerJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pantalla Pantalla1 = new Pantalla();//ceamos el objeto de la calase pantalla
        Pantalla1.setVisible(true); //hacemos que salga con el Visible(true (si) o faslse (no) para abri o cerrar ventanas)
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
