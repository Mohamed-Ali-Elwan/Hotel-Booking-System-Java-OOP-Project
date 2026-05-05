package project_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Booking {
    //static private int  count =4200 ;
    static Booking[] bookings;
    private int no_of_rooms;
    private int no_of_members;
    private Room room;
    private Date checkInDate;
    private int no_of_nights;
    static private double BookingID ;
    static int count=0;
    
    Booking(Room room, int no_of_nights, Date checkInDate, int no_of_rooms, int no_of_members){
        this.room=room;
        this.no_of_nights=no_of_nights;
        this.checkInDate=checkInDate;
        this.no_of_members = no_of_members;
        this.no_of_rooms = no_of_rooms;
    //         System.out.println("here is your booking id , keep it safe "+bookings[count].BookingID);

    }
    
    static void add_to_system(Booking b){
        bookings[count] = b;
//                new Booking(room,checkOutDate,checkInDate, no_of_rooms, no_of_members);
        BookingID = count+1223;
        count++;    
    }
    
     
//    void cancelbooking(){
//          bookings[bookingid-1223]=null;
//          count--;
//          System.out.println("canceled");
//     }
    
    String getcheckindate(){
        return this.checkInDate.toString();
    }

    public int getNo_of_nights() {
        return no_of_nights;
    }

    

    public int getNo_of_rooms() {
        return no_of_rooms;
    }

    public int getNo_of_members() {
        return no_of_members;
    }

    public double getBookingID() {
        return BookingID;
    }







}
