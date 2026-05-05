package project_;

import java.util.Random;

public class Suite  extends Room{
    public Suite() {
            Price=3000 ;
            Random random = new Random();
            RoomNumber = random.nextInt(250) + 1;

    }

    public double getPrice() {
        return Price;
    }
    

    @Override
    public String GetDetails()
    {
         String details= "\nSuite_"+"SuiteNumber: "+RoomNumber+ "\n\n Price: "+Price;
        return details;
    }

    @Override
    public String GetOffer() {
        if(x==true)
          Price =2500;
        String offer = "Suite Room Price = 2500 (for more than 5 days) ";
        return offer;
    }
}
