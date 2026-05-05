/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_;

/**
 *
 * @author 10120
 */
import java.util.Date;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class Reservation extends Application {
    private Room selectedRoom;
    private boolean path_flag;
    public Reservation() {
        path_flag = false;
    }
    
    public Reservation(Room selectedRoom) {
        this.selectedRoom = selectedRoom;
        path_flag = true;
    }
    
    @Override
    public void start(Stage stage) {
        // First elements to be in the Scene
        // next button
        Button next = new Button("Next");
        next.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");
        
        Button back = new Button("Back");
        back.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 5px; -fx-background-color: #00B8D4;");

        // radio buttons
        RadioButton single_RadioButton = new RadioButton("Single");
        RadioButton double_RadioButton = new RadioButton("Double");
        RadioButton suite_RadioButton = new RadioButton("Suite");
        // set toggle group for the radiobuttons to select one only from the group
        ToggleGroup toggle = new ToggleGroup();
        single_RadioButton.setToggleGroup(toggle);
        double_RadioButton.setToggleGroup(toggle);
        suite_RadioButton.setToggleGroup(toggle);
        
        if(path_flag)
            for (Toggle t : toggle.getToggles()) {
                ((RadioButton) t).setDisable(true);
            }
        // labels
        Label booking = new Label("Booking");
        booking.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        
        Label check_in_Label = new Label("Check-in date");
        Label check_out_Label = new Label("No. of Nights");
        Label room_type_Label = new Label("Room");
        Label no_of_rooms_Label = new Label("No. of Rooms");
        Label no_of_members_Label = new Label("No. of memebers");
        
        Label slash1 = new Label("/");
        Label slash2 = new Label("/");
        Label slash3 = new Label("/");
        Label slash4 = new Label("/");
        
        
        Font labelFont = Font.font("Arial", FontWeight.NORMAL, 14);
        
        check_in_Label.setFont(labelFont);
        check_out_Label.setFont(labelFont);
        room_type_Label.setFont(labelFont);
        no_of_rooms_Label.setFont(labelFont);
        no_of_members_Label.setFont(labelFont);

        slash1.setFont(labelFont);
        slash2.setFont(labelFont);
        slash3.setFont(labelFont);
        slash4.setFont(labelFont);
        
        // Textfields with min size
        TextField checkIn_day_TextField = new TextField();
        checkIn_day_TextField.setMaxWidth(50);

        TextField checkIn_month_TextField = new TextField();
        checkIn_month_TextField.setMaxWidth(50);

        TextField checkIn_year_TextField = new TextField();
        checkIn_year_TextField.setMaxWidth(80);

        TextField checkOut_day_TextField = new TextField();
        checkOut_day_TextField.setMaxWidth(50);

        
        
        // Textfields with normal size
        TextField no_of_rooms_TextField = new TextField(); // can be changed later !!!!!!
        TextField no_of_members_TextField = new TextField(); // can be changed later !!!!!
        
        GridPane grid1 = new GridPane();
//        grid1.setGridLinesVisible(true);
        grid1.setAlignment(Pos.CENTER);
        grid1.setHgap(10);
        grid1.setVgap(20);
        //don't forget the padding and the vgap and hgap !!!!!!
        
        grid1.addColumn(0, check_in_Label, room_type_Label, no_of_rooms_Label, no_of_members_Label);
        
        // check-in in the grid
        grid1.add(checkIn_day_TextField, 1, 0);
        grid1.add(slash1, 2, 0);
        grid1.add(checkIn_month_TextField, 3, 0);
        grid1.add(slash2, 4, 0);
        grid1.add(checkIn_year_TextField, 5, 0);
        
        //check-out in the grid
        grid1.add(check_out_Label, 9, 0);
        grid1.addRow(0,checkOut_day_TextField);
        
        //can be changed later !!!!!!!
        grid1.add(no_of_rooms_TextField, 1, 2, 7, 1);
        grid1.add(no_of_members_TextField, 1, 3, 7, 1);
        
        //set radiobuttons on the grid
        grid1.add(single_RadioButton, 1, 1, 2,1);
        grid1.add(double_RadioButton, 3, 1, 2,1);
        grid1.add(suite_RadioButton, 5, 1, 2,1);
        
        
        
        StackPane grid_stack = new StackPane(grid1);
        grid_stack.setMaxSize(650, 260);
        grid_stack.setStyle("-fx-background-color: rgba(255,255,255,0.8); -fx-background-radius: 20;");
        grid_stack.setAlignment(Pos.CENTER);
        
        // wrraper for booking and next button to set alignment in border1
        HBox topBox = new HBox(booking);
        topBox.setAlignment(Pos.CENTER); 
        topBox.setPadding(new Insets(60));
        
        HBox bottomBox = new HBox(next);
        bottomBox.setAlignment(Pos.CENTER_RIGHT); 
        bottomBox.setPadding(new Insets(60, 20, 20, 20)); // Padding: top, right, bottom, left
        
        HBox Bottom_left = new HBox(back);
        Bottom_left.setAlignment(Pos.CENTER_LEFT);        
        Bottom_left.setPadding(new Insets(60, 20, 20, 20)); // Padding: top, right, bottom, left

        HBox wBox = new HBox(Bottom_left,bottomBox);
        wBox.setSpacing(500);
        wBox.setAlignment(Pos.CENTER);
        
        // creating border for title and next button
        BorderPane border1 = new BorderPane();
        border1.setTop(topBox);
        border1.setBottom(wBox);
        border1.setCenter(grid_stack);
     
        
        //Background image
        ImageView image = new ImageView("file:D:\\junior computr spring 2025\\advanced progg\\projects\\New folder\\back2.jpg");
        image.setOpacity(0.4);
        image.setSmooth(true);
        
        // stackpane to put the background and stack on it the rest of panes
        StackPane outer_stack = new StackPane();
        outer_stack.getChildren().addAll(image, border1);
        
        image.fitWidthProperty().bind(outer_stack.widthProperty());
        image.fitHeightProperty().bind(outer_stack.heightProperty());
        
        Scene sc5 = new Scene(outer_stack,700,600);
              
        
        
        Button calc= new Button("Calculate Total");
        grid1.add(calc, 0, 4);
        calc.setOnAction(eh ->
        {
            Room room_type2;
                if(path_flag)
                    room_type2 = selectedRoom;
                else if((((RadioButton)toggle.getSelectedToggle()).getText())=="Single")
                    room_type2 = new SingleRoom();
                else if((((RadioButton)toggle.getSelectedToggle()).getText())=="Double")
                    room_type2 = new DoubleRoom();
                else
                    room_type2 = new Suite();
            Label price = new Label("Total is "+ room_type2.getPrice()* Integer.parseInt(no_of_rooms_TextField.getText()) *Integer.parseInt(checkOut_day_TextField.getText()) );
            grid1.add(price, 1, 4,2,1); 
        } );
        next.setOnAction(e -> 
        {
            
            try {
                int checkin_day_data = Integer.parseInt(checkIn_day_TextField.getText());
                int checkin_month_data = Integer.parseInt(checkIn_month_TextField.getText());
                int checkin_year_data = Integer.parseInt(checkIn_year_TextField.getText());
                if(checkin_month_data <= 12 )
                    switch (checkin_month_data) {
                        case 1,3,5,7,8,10,12:
                            if(checkin_day_data > 31)
                                throw new Exception();
                            break;
                        case 4,6,9,11:
                            if(checkin_day_data > 30)
                                throw new Exception();
                            break;
                        case 2:
                            if(checkin_day_data > 28)
                            throw new Exception();
                            break;
                    }
                else
                    throw new Exception();
                         
                Date f = new Date(checkin_day_data,checkin_month_data,checkin_year_data);
                int no_nights = Integer.parseInt(checkOut_day_TextField.getText());
                int no_rooms = Integer.parseInt(no_of_rooms_TextField.getText());
                int no_memebers = Integer.parseInt(no_of_members_TextField.getText());
                
                Room room_type;
                if(path_flag)
                    room_type = selectedRoom;
                else if((((RadioButton)toggle.getSelectedToggle()).getText())=="Single")
                    room_type = new SingleRoom();
                else if((((RadioButton)toggle.getSelectedToggle()).getText())=="Double")
                    room_type = new DoubleRoom();
                else
                    room_type = new Suite();
                
                Booking b1 = new Booking(room_type,no_nights,f,no_rooms,no_memebers);
                
                new Registeration().start(stage);
            } catch (Exception ex) {
                Label error = new Label("Wrong Data !!!!");
                grid1.add(error, 9, 2);
                error.setTextFill(Color.RED);
            }
        });
        back.setOnAction(eh -> 
        {
            new RoomsSceneClass().start(stage);
        });
        
        wBox.spacingProperty().bind(sc5.widthProperty().multiply(500.0/780));
        stage.setScene(sc5);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}