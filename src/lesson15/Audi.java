package lesson15;

public class Audi extends Vehicle implements Car {



    public Audi(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
     void infoCar() {
        System.out.println("Model: "+name);
        System.out.println("Color: "+color);
        System.out.println("Year: "+age);
    }

    @Override
    public void speed() {
        System.out.println("Speed Limited: 300");
    }

    @Override
    public void drive() {
        System.out.println("Audi saatda 300 suretle gedir");
    }

    @Override
    public void oil() {
        System.out.println("Audinin 40 litirlik benzin baki var ");
    }


}
