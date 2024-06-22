package lesson15;

public class Ferrari extends Vehicle implements Car{


    public Ferrari(String name, String color, int age) {
        super(name, color, age);
    }
    public void infoFerrari(){
        System.out.println("Model: "+name);
        System.out.println("Color: "+color);
        System.out.println("Year: "+age);
    }

    @Override
    public void speed() {
        System.out.println("Speed Limited: 320");
    }

    @Override
    public void drive() {
        System.out.println("Ferrari saatda 320 suretle gedir");
    }

    @Override
    public void oil() {
        System.out.println("Ferrarinin 45 litirlik benzin baki var");
    }


}
