package project_;
import java.util.Random;

public class DoubleRoom  extends Room{
    public DoubleRoom() {
            Price=1500 ;
            Random random = new Random();
            RoomNumber = random.nextInt(250) + 1;

    }

    public double getPrice() {
        return Price;
    }

   

    @Override
    public String GetDetails() {
        String details= "\nDouble_"+"RoomNumber: "+RoomNumber+ "\n\n Price: "+Price;
        return details;
    }

    @Override
    public String GetOffer() {
        if(x==true)
          Price =1350;
        String offer = "Double Room Price = 1350 (for more than 7 days) ";
        return offer;
    }
}
