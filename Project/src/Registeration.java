package project_;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10120
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.*;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class Registeration extends Application {

    @Override
    public void start(Stage stage) {

        Button submit = new Button("Submit");
       
        submit.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");
//        submit.setStyle("-fx-text-fill: black; -fx-font-weight: bold; -fx-padding: 8px 15px; -fx-background-radius: 5px;");
       // submit.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 8px 15px; -fx-background-radius: 10px;");
        
        Button back = new Button("Back");       
        back.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");

       
       
        VBox button_wrapper = new VBox(submit);
        button_wrapper.setAlignment(Pos.TOP_RIGHT);
        submit.setAlignment(Pos.TOP_CENTER);
        button_wrapper.setPadding(new Insets(60, 20, 20, 20)); // Padding: top, right, bottom, left
//        submit.setAlignment(Pos.TOP_RIGHT);
        

        // defining labels for the user required data
        Label name_Label = new Label("Name");
        Label id_Label = new Label("ID");
        Label age_Label = new Label("Age");
        Label nationality_Label = new Label("Nationality");
        Label mobile_Label = new Label("Mobile");
        
        name_Label.setStyle("-fx-text-fill: #2F4F4F;");
        id_Label.setStyle("-fx-text-fill: #2F4F4F;");
        age_Label.setStyle("-fx-text-fill: #2F4F4F;");
        nationality_Label.setStyle("-fx-text-fill: #2F4F4F;");
        mobile_Label.setStyle("-fx-text-fill: #2F4F4F;");
        
        Font labelFont = Font.font("Arial", FontWeight.NORMAL, 14); 

        name_Label.setFont(labelFont);
        id_Label.setFont(labelFont);
        age_Label.setFont(labelFont);
        nationality_Label.setFont(labelFont);
        mobile_Label.setFont(labelFont);
        
        // text fields for that labels
        TextField name_TextField = new TextField();
        TextField id_TextField = new TextField();
        TextField age_TextField = new TextField();
        TextField nat_TextField = new TextField();
        TextField mobile_TextField = new TextField();
        
        name_TextField.setMinWidth(300);
        
        // gridpane declaration
        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.CENTER);
//        grid1.setGridLinesVisible(true);
        grid1.setVgap(20);
        grid1.setHgap(20);
        
        // arrange nodes in gridpane
        grid1.add(name_Label, 0, 0);
        grid1.add(id_Label, 0, 1);
        grid1.add(age_Label, 0, 2);
        grid1.add(nationality_Label, 0, 3);
        grid1.add(mobile_Label, 0, 4);
        
        grid1.add(name_TextField, 1, 0);
        grid1.add(id_TextField, 1, 1);
        grid1.add(age_TextField, 1, 2);
        grid1.add(nat_TextField, 1, 3);
        grid1.add(mobile_TextField, 1, 4);
        
        //vbox declaration to contain grid pane
        VBox layout_int = new VBox();
        layout_int.setAlignment(Pos.CENTER);
        
        layout_int.getChildren().add(grid1);
        layout_int.setStyle("-fx-background-color: rgba(255,255,255,0.8); -fx-background-radius: 20;");
        layout_int.setPadding(new Insets(50));
        
        // wrapper for layout_int
        VBox wrapper = new VBox(layout_int);
        wrapper.setAlignment(Pos.CENTER);
        wrapper.setMaxWidth(490);
        
        BorderPane layout_ext = new BorderPane();
        
        Label info = new Label("Client information");
        info.setAlignment(Pos.BOTTOM_CENTER);
        info.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        info.setTextFill(Color.DARKSLATEGRAY);
//        info.setTextFill(Color.web("#333333")); // Dark gray
              
        HBox info_wrapper = new HBox(info);
        info_wrapper.setAlignment(Pos.CENTER);
        info.setPadding(new Insets(50));
        
        HBox Bottom_left = new HBox(back);
        Bottom_left.setAlignment(Pos.CENTER_LEFT);        
        Bottom_left.setPadding(new Insets(60, 20, 20, 20)); // Padding: top, right, bottom, left

        HBox wBox = new HBox(Bottom_left,button_wrapper);
        wBox.setSpacing(500);
        wBox.setAlignment(Pos.CENTER);
        
        layout_ext.setTop(info_wrapper);
        layout_ext.setCenter(wrapper);
        layout_ext.setBottom(wBox);
        
        ImageView image = new ImageView("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back2.jpg");
        image.setOpacity(0.4);
        image.setSmooth(true);
        
        StackPane stack = new StackPane();
        stack.getChildren().addAll(image,layout_ext);
        
        image.fitWidthProperty().bind(stack.widthProperty());
        image.fitHeightProperty().bind(stack.heightProperty());
        
        submit.setOnAction(eg -> 
        {
            try {
                String name = name_TextField.getText();
                long id =(long) Double.parseDouble(id_TextField.getText());
                if(id_TextField.getText().length() != 14)
                    throw new Exception();
                int age = Integer.parseInt(age_TextField.getText());
                if (age > 160)
                    throw new Exception();
                String nationality = nat_TextField.getText();
                long mobile = (long) Double.parseDouble(mobile_TextField.getText());
                if(mobile_TextField.getText().length() != 11)
                    throw new Exception();
                 new End().start(stage);
                
            } catch (Exception e) {
                Label errorLabel = new Label("Wrong Data");
                errorLabel.setTextFill(Color.RED);
                grid1.add(errorLabel, 0, 5,2,1);
            }
         
        });
        
        back.setOnAction(eh -> 
        {
            new Reservation().start(stage);
        });
        
        Scene sc5 = new Scene(stack,780,600);
        wBox.spacingProperty().bind(sc5.widthProperty().multiply(500.0/780));
        stage.setScene(sc5);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
