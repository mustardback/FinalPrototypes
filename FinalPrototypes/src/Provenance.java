/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package provenance;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author amman
 */
public class Provenance extends Application {
    
    private int choice;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button back = new Button();
        
        back.setText("Back");
        btn.setText("Submit");
        Button first = new Button();
        first.setText("Choice 1");
        first.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){
                    choice = 1;
                }
            });
        Button second = new Button();
        second.setText("Choice 2");
        second.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){
                    choice = 2;
                }
            });
        Button third = new Button();
        third.setText("Choice 3");
        third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    choice = 3;
                }
            });
        Button fourth = new Button();
        fourth.setText("Choice 4");
        fourth.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){
                    choice = 4;
                }
            });
        HBox box = new HBox();
        box.getChildren().add(first);
        box.getChildren().add(second);
        box.getChildren().add(third);
        box.getChildren().add(fourth);
        box.setSpacing(10);
        
        StackPane root = new StackPane();
        root.getChildren().add(box);
        root.getChildren().add(btn);

        StackPane sample = new StackPane();
        sample.getChildren().add(back);
        Scene newScene = new Scene(sample, 300, 250);

        btn.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override
            public void handle(ActionEvent event) {
                if(choice == 1) {    
                    primaryStage.setTitle("Choice 1");
                    primaryStage.setScene(newScene);
                    primaryStage.show();
                }
                if(choice == 2) {     
                    primaryStage.setTitle("Choice 2");
                    primaryStage.setScene(newScene);
                    primaryStage.show();
                }
                if(choice == 3) {   
                    primaryStage.setTitle("Choice 3");
                    primaryStage.setScene(newScene);
                    primaryStage.show();
                }
                if(choice == 4) {                    
                    primaryStage.setTitle("Choice 4");
                    primaryStage.setScene(newScene);
                    primaryStage.show();
                }
            }
        });
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Radio Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
        back.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event){
                    primaryStage.setScene(scene);
                    
                }
            });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
