package lesson9;

import java.util.Scanner;

public class PracticaTask {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        long floors = scanner.nextInt();

        if (floors>= 0 && floors <= 9) {
            System.out.println("1 Ededlidir:");

        } else if (floors>=10 && floors<=99) {
            System.out.println("2 Ededlidir:");

        } else if (floors>=100 && floors<=999) {
            System.out.println("3 Ededlidir:");

        } else if (floors>=1000 && floors<=9999) {
            System.out.println("4 Ededlidir:");

        } else if (floors>=10000 && floors<=99999) {
            System.out.println("5 Ededlidir:");

        } else if (floors>=100000 && floors<=999999) {
            System.out.println("6 Ededlidir:");

        } else if (floors>=1000000 && floors<=9999999) {
            System.out.println("7 Ededlidir:");

        }else {
            System.out.println("Cox Ededlidir:");
        }

    }

}