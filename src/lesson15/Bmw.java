package lesson15;

public class Bmw extends Vehicle implements Car{


    public Bmw(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void infoCar() {
        System.out.println("Model: "+name);
        System.out.println("Color: "+color);
        System.out.println("Year: "+age);
    }

    @Override
    public void speed() {
        System.out.println("Speed Limited: 350");
    }

    @Override
    public void drive() {
        System.out.println("Bmw saatda 350 suretle gedir");
    }

    @Override
    public void oil() {
        System.out.println("Bmw nin 45 litirlik benzin baki var");
    }


}
