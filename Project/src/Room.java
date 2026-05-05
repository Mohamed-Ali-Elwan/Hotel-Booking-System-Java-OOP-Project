package project_;

abstract public class Room implements Comparable<Room> {
    protected int RoomNumber ;
    protected double Price ;
    protected boolean x ;
    
    
    Room(){
        
    }

    public double getPrice() {
        return Price;
    }
    
    
    @Override
   public int compareTo(Room o) {
    return Double.compare(Price, o.getPrice());
}

   abstract public String GetDetails();
   abstract public String GetOffer();
    
}
