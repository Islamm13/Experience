package experienceOne;

public class GardenHouse extends Apartment {


    String tree;

    String garage;

    public GardenHouse(String name, int rooms, int doors, int windows, String yes, double calculatekv, String tree, String garage) {
        super(name, rooms, doors, windows, calculatekv);
        this.tree = tree;
        this.garage = garage;
    }

    public void setTree(){
        System.out.println("Name Tree:"+tree);
    }
    public void setGarage(){
        System.out.println("Garage:"+garage);
    }

    @Override
    public void houseInfo() {
        super.houseInfo();
    }

    @Override
    public double calculatekv() {
        return calculatekv;
    }
}
