/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprototypes;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Amman Nega/Donald Hawkins
 */
public class FinalPrototypes extends Application {
    //private int choice;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
//        Button btn = new Button();
//        Button back = new Button();
//        
//        back.setText("Back");
//        btn.setText("Submit");
//        Button first = new Button();
//        first.setText("Choice 1");
//        first.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent event){
//                    choice = 1;
//                }
//            });
//        Button second = new Button();
//        second.setText("Choice 2");
//        second.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent event){
//                    choice = 2;
//                }
//            });
//        Button third = new Button();
//        third.setText("Choice 3");
//        third.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//                public void handle(ActionEvent event){
//                    choice = 3;
//                }
//            });
//        Button fourth = new Button();
//        fourth.setText("Choice 4");
//        fourth.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent event){
//                    choice = 4;
//                }
//            });
//        HBox box = new HBox();
//        box.getChildren().add(first);
//        box.getChildren().add(second);
//        box.getChildren().add(third);
//        box.getChildren().add(fourth);
//        box.setSpacing(10);
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(box);
//        root.getChildren().add(btn);
//
//        StackPane sample = new StackPane();
//        sample.getChildren().add(back);
//        Scene newScene = new Scene(sample, 300, 250);
//
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//        
//            @Override
//            public void handle(ActionEvent event) {
//                if(choice == 1) {    
//                    primaryStage.setTitle("Choice 1");
//                    primaryStage.setScene(newScene);
//                    primaryStage.show();
//                }
//                if(choice == 2) {     
//                    primaryStage.setTitle("Choice 2");
//                    primaryStage.setScene(newScene);
//                    primaryStage.show();
//                }
//                if(choice == 3) {   
//                    primaryStage.setTitle("Choice 3");
//                    primaryStage.setScene(newScene);
//                    primaryStage.show();
//                }
//                if(choice == 4) {                    
//                    primaryStage.setTitle("Choice 4");
//                    primaryStage.setScene(newScene);
//                    primaryStage.show();
//                }
//            }
//        });
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("PViz.fxml"));
        
        URL url = new File("src/finalprototypes/PViz.fxml").toURL();
        Parent root = FXMLLoader.load(url);
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/PViz.fxml"));
        Scene scene = new Scene(root, 1280, 768);
        
        primaryStage.setTitle("Prov Visualizer");
        primaryStage.setScene(scene);
        primaryStage.show();
        //back.setOnAction(new EventHandlerImpl(primaryStage, scene));
    }
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root, 300, 250);
//        
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();

//    private static class EventHandlerImpl implements EventHandler<ActionEvent> {
//
//        private final Stage primaryStage;
//        private final Scene scene;
//
//        public EventHandlerImpl(Stage primaryStage, Scene scene) {
//            this.primaryStage = primaryStage;
//            this.scene = scene;
//        }
//
//        @Override
//        public void handle(ActionEvent event){
//            primaryStage.setScene(scene);
//            
//        }
//    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
