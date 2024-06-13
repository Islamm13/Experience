package lesson13.composition;

import java.util.ArrayList;
import java.util.List;

public class House {

private List<Room> rooms;

    public House(String room) {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalArea(){
        int totalArea = 0;
        for (Room room :rooms){
            totalArea+=room.getArea();
        }
        return totalArea;

    }

    public void displayRooms(){
        System.out.println("Rooms in the House: ");
        for (Room room : rooms){
            System.out.println(room);
        }
    }







}
