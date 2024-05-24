package experienceOne;

public class Apartment {

    String name;

    int rooms;

    int doors;

    int windows;


    double calculatekv;


    public Apartment(String name, int rooms, int doors, int windows, double calculatekv) {
        this.name = name;
        this.rooms = rooms;
        this.doors = doors;
        this.windows = windows;
        this.calculatekv = calculatekv;
    }

    public void houseInfo(){
        System.out.println("House Name:"+name);
        System.out.println("Rooms:"+rooms);
        System.out.println("Doors:"+doors);
        System.out.println("Windows:"+windows);
        System.out.println("House Kv Metr:"+calculatekv);
    }

    public double calculatekv(){
        return calculatekv();
    }
}
