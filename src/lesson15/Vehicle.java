package lesson15;

public class Vehicle {

    String name;

    String color;

    int age;

    public void info(){
        System.out.println("Model: "+name);
        System.out.println("Color: "+color);
        System.out.println("Year: "+age);
    }

    public Vehicle(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
