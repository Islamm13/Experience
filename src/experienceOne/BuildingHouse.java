package experienceOne;
public class BuildingHouse extends Apartment {

    int buildingFloor;

    public BuildingHouse(String name, int rooms, int doors, int windows, double calculatekv, int buildingFloor) {
        super(name, rooms, doors, windows, calculatekv);
        this.buildingFloor = buildingFloor;
    }

    public void setBuildingFloor(){
        System.out.println("Floor:"+buildingFloor);
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
