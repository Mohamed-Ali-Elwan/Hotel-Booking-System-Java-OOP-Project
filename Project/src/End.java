/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_;

/**
 *
 * @author ALKODS
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;



public class End extends Application {

    @Override
    public void start(Stage stage)  {
        // Main layout: Use a StackPane for pane switching
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 700, 600); // Window size

        // Create the services pane with the "Next" button at the bottom-right
        StackPane mainLayout = createEndPane(root, scene, stage);

        // Add the main layout to the root
        //background
        
        
        root.getChildren().addAll(mainLayout);

        // Set up the stage
        stage.setTitle("End");
        stage.setScene(scene);
        stage.show();
    }
    
    private StackPane createEndPane(StackPane root, Scene originalScene, Stage stage){
        
        Image backgroundUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back2.jpg");
        ImageView background = new ImageView(backgroundUrl);
        background.setOpacity(0.4);
        background.fitWidthProperty().bind(originalScene.widthProperty());
        background.fitHeightProperty().bind(originalScene.heightProperty());
        
        Label sub = new Label("Submitted successfully");
        sub.setStyle("-fx-font-size: 24px;" +
                      "-fx-font-weight: bold;" +
                      "-fx-text-fill: #004d99;" +
                      "-fx-background-color: linear-gradient(to right, #e0f7fa, #b3e5fc);" +
                      "-fx-padding: 10px 20px;" +
                      "-fx-background-radius: 10px;" +
                      "-fx-border-color: #007acc;" +
                      "-fx-border-width: 2px;" +
                      "-fx-border-radius: 10px;" +
                      "-fx-effect: dropshadow(gaussian, rgba(0, 76, 153, 0.5), 10, 0.5, 0, 3);");
        
        
        VBox v1=new VBox();
        v1.getChildren().add(sub);
        v1.setAlignment(Pos.CENTER);
        Button next = new Button("New Booking");
        next.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");
         VBox v2=new VBox();
        v2.getChildren().add(next);
        v2.setAlignment(Pos.BOTTOM_RIGHT);
        v2.setPadding(new Insets(20));
        
        StackPane mainLayout= new StackPane();
        mainLayout.getChildren().addAll(background,v1,v2);
        
        next.setOnAction((ActionEvent e) -> {
           
            new Hotel_Project().start(stage);
           
        });

        return mainLayout;
    }
     public static void main(String[] args) {
        launch(args);
    }
    
}
