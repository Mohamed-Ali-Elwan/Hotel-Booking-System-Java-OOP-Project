/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_;

import javafx.application.Application;

import static javafx.beans.binding.Bindings.not;
import javafx.scene.Scene;
 import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.*;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Services extends Application{

   @Override
    public void start(Stage primaryStage) {
        // Main layout: Use a StackPane for pane switching
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 700, 600); // Window size

        // Create the services pane with the "Next" button at the bottom-right
        StackPane mainLayout = createServicesPane(root, scene, primaryStage);

        // Add the main layout to the root
        //background
        
        
        root.getChildren().addAll(mainLayout);

        // Set up the stage
        primaryStage.setTitle("Services");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private StackPane createServicesPane(StackPane root, Scene originalScene, Stage primaryStage) {
        // Create the GridPane for the services
        GridPane servicesPane = new GridPane();
        servicesPane.setAlignment(Pos.CENTER);
        servicesPane.setHgap(20);
        servicesPane.setVgap(20);
        servicesPane.setPadding(new Insets(10, 10, 10, 10));

        // Title
        Label serv = new Label("Services");
        serv.setStyle("-fx-font-size: 24px;" +
                      "-fx-font-weight: bold;" +
                      "-fx-text-fill: #004d99;" +
                      "-fx-background-color: linear-gradient(to right, #e0f7fa, #b3e5fc);" +
                      "-fx-padding: 10px 20px;" +
                      "-fx-background-radius: 10px;" +
                      "-fx-border-color: #007acc;" +
                      "-fx-border-width: 2px;" +
                      "-fx-border-radius: 10px;" +
                      "-fx-effect: dropshadow(gaussian, rgba(0, 76, 153, 0.5), 10, 0.5, 0, 3);");
        servicesPane.add(serv, 0, 0, 2, 1); // Span 2 columns
       

        
        
         // background
        
        
        // Load images
        Image poolUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\pool.jpg");
        ImageView poolV = new ImageView(poolUrl);
        poolV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        poolV.fitWidthProperty().bind(originalScene.widthProperty().divide(2.5));
        poolV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L1 = new Label("Swimming Pool");
        L1.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L1.setAlignment(Pos.CENTER);
        VBox pool = new VBox(10, poolV, L1);

        Image spaUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\spa.jpg");
        ImageView spaV = new ImageView(spaUrl);
        spaV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        spaV.fitWidthProperty().bind(originalScene.widthProperty().divide(2.5));
        spaV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L4 = new Label("SPA");
        L4.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L4.setAlignment(Pos.CENTER);
        VBox spa = new VBox(10, spaV, L4);

        Image gymUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\gym.jpg");
        ImageView gymV = new ImageView(gymUrl);
        gymV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        gymV.fitWidthProperty().bind(originalScene.widthProperty().divide(2.5));
        gymV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L5 = new Label("GYM");
        L5.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L5.setAlignment(Pos.CENTER);
        VBox gym = new VBox(10, gymV, L5);

        Image laundryUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\laundry.png");
        ImageView laundryV = new ImageView(laundryUrl);
        laundryV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        laundryV.fitWidthProperty().bind(originalScene.widthProperty().divide(2.5));
        laundryV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L3 = new Label("Laundry Service");
        L3.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L3.setAlignment(Pos.CENTER);
        VBox laundry = new VBox(10, laundryV, L3);

        Image roomServiceUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\roomservice.jpg");
        ImageView roomServiceV = new ImageView(roomServiceUrl);
        roomServiceV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        roomServiceV.fitWidthProperty().bind(originalScene.widthProperty().divide(2.5));
        roomServiceV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L6 = new Label("Room Service");
        L6.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L6.setAlignment(Pos.CENTER);
        VBox roomService = new VBox(10, roomServiceV, L6);

        Image restauUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\restaurant.jpg");
        ImageView restaurantV = new ImageView(restauUrl);
        restaurantV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        restaurantV.fitWidthProperty().bind(originalScene.widthProperty().divide(2.5));
        restaurantV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L2 = new Label("Restaurant");
        L2.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L2.setAlignment(Pos.CENTER);
        VBox restaurant = new VBox(10, restaurantV, L2);

        // Add services to the grid (2 columns, 3 rows)
        servicesPane.add(pool, 0, 1);
        servicesPane.add(spa, 1, 1);
        servicesPane.add(gym, 0, 2);
        servicesPane.add(laundry, 1, 2);
        servicesPane.add(roomService, 0, 3);
        servicesPane.add(restaurant, 1, 3);

        // Create the "Next" button
        Button next = new Button("Next");
        next.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");
        next.setMinSize(80, 40); // Ensure minimum size for visibility
        VBox bt=new VBox();
        bt.getChildren().add(next);
        bt.setAlignment(Pos.BOTTOM_RIGHT);
        bt.setPadding(new Insets(5,5,5,5));
       
        // Use a BorderPane to organize the layout
        Image backgroundUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back2.jpg");
        ImageView background = new ImageView(backgroundUrl);
        background.setOpacity(0.4);
        background.fitWidthProperty().bind(originalScene.widthProperty());
        background.fitHeightProperty().bind(originalScene.heightProperty());
        
       
        StackPane mainLayout = new StackPane();
        mainLayout.getChildren().addAll(background,servicesPane,bt);
//        mainLayout.setCenter(servicesPane)
//        mainLayout.setBottom(next);
//        mainLayout.setPadding(new Insets(10)); // Padding for the entire layout
//        BorderPane.setAlignment(next, Pos.BOTTOM_RIGHT);
//        BorderPane.setMargin(next, new Insets(10, 10, 10, 0)); // Margin: top, right, bottom, left
        

        // Action for the "Next" button (navigate to a new scene)
        next.setOnAction((ActionEvent e) -> {
           
            new RoomsSceneClass().start(primaryStage);
           
        });
        

        return mainLayout;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
