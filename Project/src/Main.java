/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_;

import java.util.Arrays;

/**
 *
 * @author ALKODS
 */
public class Main {
    public static void main(String[] args) {
    Room[] rooms = {new DoubleRoom(), new SingleRoom(), new Suite()};
   Arrays.sort(rooms);
        System.out.println("Rooms sorted by price:");
        for (Room room : rooms) {
            System.out.println(room.GetDetails());
        }
        
        SingleRoom room1= new SingleRoom();
        System.out.println("***********************************************");
        room1.isAvaliable();
        System.out.println(room1.GetDetails());
        
        
}
}
