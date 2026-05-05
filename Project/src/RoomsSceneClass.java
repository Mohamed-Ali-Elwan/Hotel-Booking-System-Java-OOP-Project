/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 *
 * @author HP
 */
public class RoomsSceneClass extends Application{

    @Override
    public void start(Stage primaryStage) {
        
           

        StackPane BackgroundPane = new StackPane();

        Text RoomText = new Text("Rooms");
        RoomText.setFont(Font.font("Arial", 36));
        RoomText.setStyle("-fx-fill: #ffffff;");
        
        Rectangle RoomTextBackground = new Rectangle(200, 60); // width, height
        RoomTextBackground.setArcWidth(20);  // Rounded corners
        RoomTextBackground.setArcHeight(20);
        RoomTextBackground.setFill(Color.web("#00B8D4")); // Background color (teal)
        RoomTextBackground.setOpacity(0.9);
        
        StackPane RoomtextBox = new StackPane(RoomTextBackground, RoomText);
        RoomtextBox.setAlignment(Pos.CENTER);
        RoomtextBox.setPadding(new Insets(20));

        VBox Roombox = new VBox(RoomtextBox);
        Roombox.setAlignment(Pos.TOP_CENTER);
        Roombox.setPadding(new Insets(30, 0, 0, 0)); 
        
        
        
        
        String imageUrl = "file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back2.jpg";
        Image Background = new Image(imageUrl);
        ImageView BackgroundView = new ImageView(Background);

        BackgroundView.setPreserveRatio(false);
        BackgroundView.setOpacity(0.3);
        
        
        
        
        Button Offerbtn = new Button("OFFERS");
        Offerbtn.setStyle(
            "-fx-text-fill: white;" +
            "-fx-font-size: 16px;" +
            "-fx-font-weight: bold;" +
            "-fx-padding: 10px 20px;" +
            "-fx-background-radius: 5px;" +
            "-fx-background-color: #FF7043;"  // Deep orange color
        );

        // Create a VBox to position Offerbtn on the left, above center
        VBox OfferBox = new VBox(Offerbtn);
        OfferBox.setAlignment(Pos.BASELINE_RIGHT);
        OfferBox.setPadding(new Insets(30, 25, 25, 25)); // Top, Right, Bottom, Left

        
        Button Nextbtn = new Button("Next");
        Nextbtn.setStyle(
            "-fx-text-fill: white; " +
            "-fx-font-weight: bold; " +
            "-fx-padding: 10px 20px; " +
            "-fx-background-radius: 5px; " +
            "-fx-background-color: #00B8D4;"
        );
        
        
        Button Backbtn = new Button("Back");
        Backbtn.setStyle(
            "-fx-text-fill: white; " +
            "-fx-font-weight: bold; " +
            "-fx-padding: 10px 20px; " +
            "-fx-background-radius: 5px; " +
            "-fx-background-color: #00B8D4;"
        );
        
        
        StackPane SingleRoomLayout = createSingleRoom();
        StackPane DoubleRoomLayout = createDoubleRoom() ;
        StackPane SuiteRoomLayout = createSuiteRoom() ;
       
        
        
        HBox top = new HBox();
        top.setAlignment(Pos.TOP_RIGHT);
        top.setPadding(new Insets(20,0,0,0));
        
        top.getChildren().addAll(OfferBox);
        
        OfferBox.setAlignment(Pos.TOP_RIGHT);
        
        HBox Nextbottom = new HBox(Nextbtn);
        Nextbottom.setAlignment(Pos.BOTTOM_RIGHT);
        Nextbottom.setPadding(new Insets(20,20,20,20));
        
        
        HBox Backbottom = new HBox(Backbtn);
        Backbottom.setAlignment(Pos.BOTTOM_LEFT);
        Backbottom.setPadding(new Insets(20,20,20,20));
 
        
        HBox bottom = new HBox(Backbottom,Nextbottom);
        bottom.setSpacing(450);
        bottom.setAlignment(Pos.BOTTOM_CENTER);
        

       
        
       // bottom.setPadding(new Insets(60,20,20,20));
        

        
        BorderPane RoomsPane = new BorderPane();
        RoomsPane.setTop(top);
        RoomsPane.setBottom(bottom);
        
        BackgroundPane.getChildren().addAll(BackgroundView,Roombox,SingleRoomLayout,DoubleRoomLayout,SuiteRoomLayout,RoomsPane );

 
        Scene Rooms = new Scene(BackgroundPane, 700, 600);
        
        bottom.spacingProperty().bind(Rooms.widthProperty().multiply(450.0/700));
        
        Nextbtn.setOnMouseClicked(e -> {
            new Reservation().start(primaryStage);
        
       });
        
        Offerbtn.setOnMouseClicked(e -> {
        new Offers().start(primaryStage);
       });
               
      Backbtn.setOnMouseClicked(e -> {
          new Services().start(primaryStage);
       });
      
        BackgroundView.setFitWidth(700);
        BackgroundView.setFitHeight(600);
        BackgroundView.fitWidthProperty().bind(Rooms.widthProperty());
        BackgroundView.fitHeightProperty().bind(Rooms.heightProperty());
        
        
        
        

        primaryStage.setTitle("Rooms");
        primaryStage.setScene(Rooms);
        primaryStage.show();
    }
    
    
     private StackPane createSingleRoom(){
        
        StackPane SingleRoomLayout = new StackPane();
        SingleRoomLayout.setAlignment(Pos.TOP_CENTER);
        SingleRoomLayout.setPadding(new Insets(175, 0, 0, 0));

        // Room Image
        ImageView SingleRoomImageView = new ImageView("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\single.jpg");
        SingleRoomImageView.setFitWidth(120);
        SingleRoomImageView.setFitHeight(80);
        SingleRoomImageView.setPreserveRatio(true);

        // Room Details Label (Initially Hidden)
        Label roomDetails = new Label(new SingleRoom().GetDetails());
        roomDetails.setVisible(true);
        roomDetails.setStyle("-fx-text-fill: black; -fx-font-size: 12px;");
        roomDetails.setMaxWidth(300);

        

        // VBox for content
        HBox contentBox = new HBox(30);
        contentBox.setAlignment(Pos.TOP_CENTER);
        contentBox.setPadding(new Insets(10, 280, 10, 0));
        contentBox.getChildren().addAll(SingleRoomImageView,roomDetails);

        // White background rectangle
        Rectangle SingleRoomBackground = new Rectangle(600, 100);
        SingleRoomBackground.setArcWidth(20);
        SingleRoomBackground.setArcHeight(20);
        SingleRoomBackground.setFill(Color.web("#ffffff"));
        SingleRoomBackground.setOpacity(0.8);

        SingleRoomLayout.getChildren().addAll(SingleRoomBackground, contentBox);
        
        return SingleRoomLayout;
     }
     
     
     
     private StackPane createDoubleRoom(){
        
        StackPane DoubleRoomLayout = new StackPane();
        
        DoubleRoomLayout.setAlignment(Pos.TOP_CENTER);
        DoubleRoomLayout.setPadding(new Insets(300,0,0,0));
        
        
        
        
         // Room Image
        ImageView DoubleRoomImageView = new ImageView("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\double.jpg");
        DoubleRoomImageView.setFitWidth(120); // adjust width
        DoubleRoomImageView.setFitHeight(80); // adjust height
        DoubleRoomImageView.setPreserveRatio(true);

        
        // Room Details Label (Initially Hidden)
        Label DoubleroomDetails = new Label(new DoubleRoom().GetDetails());
        DoubleroomDetails.setVisible(true);
        DoubleroomDetails.setStyle("-fx-text-fill: black; -fx-font-size: 12px;");
        DoubleroomDetails.setMaxWidth(300);
   
        
        HBox DoublecontentBox = new HBox(30);
        DoublecontentBox.setAlignment(Pos.TOP_CENTER);
        DoublecontentBox.setPadding(new Insets(15, 280, 10, 0));
        

        DoublecontentBox.getChildren().addAll(DoubleRoomImageView,DoubleroomDetails);
        
        
         
        Rectangle DoubleRoomBackground = new Rectangle(600, 100); // width, height
        DoubleRoomBackground.setArcWidth(20);  // Rounded corners
        DoubleRoomBackground.setArcHeight(20);
        DoubleRoomBackground.setFill(Color.web("#ffffff")); // Background color (teal)
        DoubleRoomBackground.setOpacity(0.8);
        
         
        DoubleRoomLayout.getChildren().addAll(DoubleRoomBackground,DoublecontentBox);
         

         return DoubleRoomLayout;
     }
     
     
     
     private StackPane createSuiteRoom(){
        
        StackPane SuiteRoomLayout = new StackPane();
        
        SuiteRoomLayout.setAlignment(Pos.TOP_CENTER);
        SuiteRoomLayout.setPadding(new Insets(425,0,0,0));
        
        
        
         // Room Image
        ImageView SuiteRoomImageView = new ImageView("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\suitee.jpg");
        SuiteRoomImageView.setFitWidth(120); // adjust width
        SuiteRoomImageView.setFitHeight(80); // adjust height
        SuiteRoomImageView.setPreserveRatio(true);

        // Room Details Label (Initially Hidden)
        Label SuiteroomDetails = new Label(new Suite().GetDetails());
        SuiteroomDetails.setVisible(true);
        SuiteroomDetails.setStyle("-fx-text-fill: black; -fx-font-size: 12px;");
        SuiteroomDetails.setMaxWidth(300);
        
   
        
       /* VBox contentBox = new VBox(); 
        contentBox.setAlignment(Pos.TOP_CENTER);
        contentBox.setPadding(new Insets(10, 450, 10, 0));
       */ 
        
        HBox SuitecontentBox = new HBox(30);
        SuitecontentBox.setAlignment(Pos.TOP_CENTER);
        SuitecontentBox.setPadding(new Insets(10, 280, 10, 0));
        

        SuitecontentBox.getChildren().addAll(SuiteRoomImageView,SuiteroomDetails);
        
        
         
        Rectangle SuiteRoomBackground = new Rectangle(600, 100); // width, height
        SuiteRoomBackground.setArcWidth(20);  // Rounded corners
        SuiteRoomBackground.setArcHeight(20);
        SuiteRoomBackground.setFill(Color.web("#ffffff")); // Background color (teal)
        SuiteRoomBackground.setOpacity(0.8);
        
         
        SuiteRoomLayout.getChildren().addAll(SuiteRoomBackground,SuitecontentBox);
         
         
         
         
         return SuiteRoomLayout;
     }
    
    
  
    
}
