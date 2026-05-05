/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package project_;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author HP
 */
public class Hotel_Project extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        

        StackPane BackgroundPane = new StackPane();

    
        GridPane StartPane = new GridPane();
        StartPane.setAlignment(Pos.BOTTOM_RIGHT);  // Align content bottom-right
        StartPane.setHgap(20);
        StartPane.setVgap(20);
        StartPane.setPadding(new Insets(20));
        
        String imageUrl = "file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back2.jpg";
        Image Background = new Image(imageUrl);
        ImageView BackgroundView = new ImageView(Background);

        BackgroundView.setPreserveRatio(false);
        BackgroundView.setOpacity(0.4);

        ImageView LogoView = new ImageView("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back.png");
        BackgroundView.setPreserveRatio(false);
        BackgroundView.setOpacity(0.1);
        
        Button Startbtn = new Button("Start");
        Startbtn.setStyle(
            "-fx-text-fill: white; " +
            "-fx-font-weight: bold; " +
            "-fx-padding: 10px 20px; " +
            "-fx-background-radius: 5px; " +
            "-fx-background-color: #00B8D4;"
        );
        

        StartPane.add(Startbtn, 0, 0);

        BackgroundPane.getChildren().addAll(BackgroundView,LogoView,StartPane);
 
        Scene Start = new Scene(BackgroundPane, 700, 600);
            
        
        Startbtn.setOnAction(e -> {
        new Services().start(primaryStage);
       });
                
        BackgroundView.setFitWidth(700);
        BackgroundView.setFitHeight(600);
        BackgroundView.fitWidthProperty().bind(Start.widthProperty());
        BackgroundView.fitHeightProperty().bind(Start.heightProperty());
   
        LogoView.fitWidthProperty().bind(Start.widthProperty());
        LogoView.fitHeightProperty().bind(Start.heightProperty());


        primaryStage.setTitle("Hotel Project");
        primaryStage.setScene(Start);
        primaryStage.show();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
}

    /*    Startbtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                GridPane ServicePane = new GridPane();
                Scene scene = new Scene(ServicePane, 500, 700);
            }
        });
        */



/*


*/