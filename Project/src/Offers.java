
package project_;

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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Offers extends Application {
    private SingleRoom singleRoom;
    private DoubleRoom doubleRoom;
    private Suite suite;
    private Room selectedRoom;

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 700, 600); // Window size

        // Create the services pane with the "Next" button at the bottom-right
        StackPane mainLayout = createOfferPane(root, scene, stage);

        // Add the main layout to the root
        root.getChildren().addAll(mainLayout);

        // Set up the stage
        stage.setTitle("Offers");
        stage.setScene(scene);
        stage.show();
    }

    private StackPane createOfferPane(StackPane root, Scene originalScene, Stage stage) {
        // Background
        Image backgroundUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back2.jpg");
        ImageView background = new ImageView(backgroundUrl);
        background.setOpacity(0.4);
        background.fitWidthProperty().bind(originalScene.widthProperty());
        background.fitHeightProperty().bind(originalScene.heightProperty());

        GridPane offersPane = new GridPane();
        offersPane.setAlignment(Pos.CENTER);
        offersPane.setHgap(20);
        offersPane.setVgap(20);
        offersPane.setPadding(new Insets(10, 10, 10, 10));

        // Title
        Label offer = new Label("Offers");
        offer.setStyle("-fx-font-size: 24px;" +
                       "-fx-font-weight: bold;" +
                       "-fx-text-fill: #004d99;" +
                       "-fx-background-color: linear-gradient(to right, #e0f7fa, #b3e5fc);" +
                       "-fx-padding: 10px 20px;" +
                       "-fx-background-radius: 10px;" +
                       "-fx-border-color: #007acc;" +
                       "-fx-border-width: 2px;" +
                       "-fx-border-radius: 10px;" +
                       "-fx-effect: dropshadow(gaussian, rgba(0, 76, 153, 0.5), 10, 0.5, 0, 3);");
        offersPane.add(offer, 0, 0, 2, 1); // Span 2 columns

        // Images
        Image singleUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\singleroom.jpg");
        ImageView singleV = new ImageView(singleUrl);
        singleV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        singleV.fitWidthProperty().bind(originalScene.widthProperty().divide(2));
        singleV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L1 = new Label(new SingleRoom().GetOffer());
        L1.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L1.setAlignment(Pos.CENTER);
        VBox singleR = new VBox(10, singleV, L1);

        Image doubleUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\doubleroom.jpg");
        ImageView doubleV = new ImageView(doubleUrl);
        doubleV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        doubleV.fitWidthProperty().bind(originalScene.widthProperty().divide(2));
        doubleV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L2 = new Label(new DoubleRoom().GetOffer());
        L2.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L2.setAlignment(Pos.CENTER);
        VBox doubleR = new VBox(10, doubleV, L2);

        Image suiteUrl = new Image("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\suite.jpg");
        ImageView suiteV = new ImageView(suiteUrl);
        suiteV.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0); -fx-border-color: #ddd; -fx-border-width: 2px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        suiteV.fitWidthProperty().bind(originalScene.widthProperty().divide(2));
        suiteV.fitHeightProperty().bind(originalScene.heightProperty().divide(6));
        Label L3 = new Label(new Suite().GetOffer());
        L3.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #333;");
        L3.setAlignment(Pos.CENTER);
        VBox suiteR = new VBox(10, suiteV, L3);

        // Create RadioButtons and add them to a ToggleGroup
        RadioButton box1 = new RadioButton();
        RadioButton box2 = new RadioButton();
        RadioButton box3 = new RadioButton();

        // Create a ToggleGroup to ensure only one RadioButton can be selected
        ToggleGroup toggleGroup = new ToggleGroup();
        box1.setToggleGroup(toggleGroup);
        box2.setToggleGroup(toggleGroup);
        box3.setToggleGroup(toggleGroup);

       
        box1.setOnAction(e ->{
            singleRoom = new SingleRoom();
            singleRoom.x = true;
            singleRoom.GetOffer();
            selectedRoom = singleRoom;
            
           System.out.println("Selected Single Room Price: " + selectedRoom.Price);
        });
        
         box2.setOnAction(e ->{
             doubleRoom = new DoubleRoom();
             doubleRoom.x = true;
            doubleRoom.GetOffer();
            selectedRoom = doubleRoom;
            System.out.println("Selected Double Room Price: " + selectedRoom.Price);
        });
         
          box3.setOnAction(e ->{
              suite= new Suite();
              suite.x = true;
            suite.GetOffer();
            selectedRoom = suite;
            System.out.println("Selected Suite Price: " + selectedRoom.Price);
        });

          Button next = new Button("Next");
    //    next.setAlignment(Pos.BOTTOM_RIGHT);
       // next.setPadding(new Insets(5, 5, 5, 5));
        next.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");
          Button back = new Button("Back");
           back.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");

        offersPane.add(singleR, 0, 1);
        offersPane.add(box1, 1, 1);
        offersPane.add(doubleR, 0, 2);
        offersPane.add(box2, 1, 2);
        offersPane.add(suiteR, 0, 3);
        offersPane.add(box3, 1, 3);
        offersPane.add(next,1,4);
        offersPane.add(back,0,4);
        

        // Button next
        
//        next.setMinSize(80, 40); // Ensure minimum size for visibility
//        HBox bt = new HBox();
//        bt.getChildren().add(next);
//        bt.setAlignment(Pos.BOTTOM_RIGHT);
//        bt.setPadding(new Insets(5, 5, 5, 5));

        // Add nodes to StackPane in correct order: background first, then offersPane, then button
        StackPane offersLayout = new StackPane();
        offersLayout.getChildren().addAll(background,offersPane);

        // Ensure the background does not consume mouse events
        background.setMouseTransparent(true);

        next.setOnAction((ActionEvent e) -> {
           
            new Reservation(selectedRoom).start(stage);
           
        });
        
        
        back.setOnAction((ActionEvent e) -> {
             new RoomsSceneClass().start(stage);
        });
        return offersLayout;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}