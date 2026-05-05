package project_;
import java.util.Random;

public class SingleRoom  extends Room implements isOccupied{
    private final int occ=10;
    private final int occ2=120;
    private final int occ3=125;
    private final int occ4=244;
    
    public SingleRoom() {
            Price=1000 ;
            Random random = new Random();
            RoomNumber = random.nextInt(250) + 1;

    }
    
    @Override
    public void isAvaliable() {
        if(RoomNumber==occ || RoomNumber==occ2 || RoomNumber==occ3 || RoomNumber==occ4 )
            System.out.println("Room is Occupied ");
         System.out.println("Room is Avaliable");
            
    }

    public double getPrice() {
        return Price;
    }
    
    

    @Override
    public String GetDetails()
    {
        String details= "\nSingle_"+"RoomNumber: "+RoomNumber+ " \n\nPrice: "+Price;
        return details;
    }

    @Override
    public String GetOffer() {
        
        if(x==true)
          Price =800;
        String offer = "Single Room Price = 800 (for more than 10 Nights) ";
        return offer;
        
    }

    
}
