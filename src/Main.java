import experienceOne.Apartment;
import experienceOne.BuildingHouse;
import experienceOne.GardenHouse;
public class Main {
    public static void main(String[] args) {

        GardenHouse islam =new GardenHouse("Garden House",4,3,4,"Yes",
                15.5,"Yes","No");
        islam.houseInfo();
        islam.setGarage();
        islam.setTree();

        System.out.println("________________________________________________________");

        BuildingHouse sarxan =new BuildingHouse("Serkhan's House",3,3,3,
                100.5,14);
        sarxan.houseInfo();
        sarxan.setBuildingFloor();
        sarxan.calculatekv();

    }
}