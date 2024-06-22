package lesson15;

public class Main {
    public static void main(String[] args) {

        Bmw bmw = new Bmw("BMW M5","Red",2024);
        bmw.infoBMW();
        bmw.speed();
        bmw.drive();
        bmw.oil();

        System.out.println("-----------------------------------");

        Ferrari ferrari = new Ferrari("Ferrari F40","Yellow",2020);
        ferrari.infoFerrari();
        ferrari.speed();
        ferrari.drive();
        ferrari.oil();

        System.out.println("-----------------------------------");

        Audi audi = new Audi("Audi Q8","Black",2021);
        audi.infoAudi();
        audi.speed();
        audi.drive();
        audi.oil();

    }
}
