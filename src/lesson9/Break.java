package lesson9;

import java.util.Scanner;

public class Break {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            int number = scanner.nextInt();

            if (number <= -1) {

                System.out.println("Break ");
                break;
            }
            System.out.println("Number " + number);

        }
    }
}