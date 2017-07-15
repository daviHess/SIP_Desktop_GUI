/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author david.hession
 */
public class JavaFXApplication7 extends Application {

    Stage window;
    Scene scene1;

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Login Window");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(8);

        Label inputLabel = new Label("Add Text: ");
        GridPane.setConstraints(inputLabel, 0, 0);
        TextField nameField = new TextField();
        GridPane.setConstraints(nameField, 1, 0);

        Button loginButton = new Button("Enter");
        loginButton.setOnAction(e -> isInt(nameField.getText()));
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(inputLabel, nameField, loginButton);

        scene1 = new Scene(grid, 300, 250);
        window.setScene(scene1);

        window.show();
    }

    private boolean isInt(String input) {
        try {
            Integer.parseInt(input);
            System.out.println("The user entered: "+ input);
            return true;
        } catch (NumberFormatException e) {
            
             System.out.println("Error: "+ input+" is not a number");
            return false;
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
