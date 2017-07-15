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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author david.hession
 */
public class JavaFXApplication7 extends Application {
    
    Stage window;
    Scene scene1;
    ComboBox<String> dropDownMenu;
    
    @Override
    public void start(Stage primaryStage) {
        
        window = primaryStage;
        window.setTitle("Login Window");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(8);
        
        Label inputLabel = new Label("Select Branch: ");
        GridPane.setConstraints(inputLabel, 0, 0);
        dropDownMenu = new ComboBox<>();
        
        dropDownMenu.getItems().addAll("Trunk", "CR1", "CR1.7", "CR1.6");
        dropDownMenu.setPromptText("Select Branch to be cleaned");
//        dropDown.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> branchSelector(dropDown));
        dropDownMenu.setOnAction(e -> System.out.println("Selected Branch: "+ dropDownMenu.getValue()));
        GridPane.setConstraints(dropDownMenu, 1, 0);
        
        Button button = new Button("Enter");
//        button.setOnAction(e ->branchSelector(dropDown));
        
        GridPane.setConstraints(button, 1, 2);
        
        grid.getChildren().addAll(inputLabel, dropDownMenu, button);
        
        scene1 = new Scene(grid, 300, 250);
        window.setScene(scene1);
        
        window.show();
    }
    
    private void branchSelector(ChoiceBox<String> dropDown) {
        if (dropDown.getValue().equals("Trunk")) {
            
            System.out.println("Cleaning Trunk");
            
        } else {
            System.out.println("Cleaning a branch other than Trunk");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
