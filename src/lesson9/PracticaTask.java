package lesson9;

import java.util.Scanner;

public class PracticaTask {

    public static <let> void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Reqem daxil edin:");
//
//        int a = scanner.nextInt();
//        int b =0;
//
//
//       while (a!=0){
//           a/=10;
//           b++;
//
//       }
//        System.out.println(b+" Reqemlidir");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Reqem Daxil Edin:");
        int num = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {

            System.out.println(num + "x" + i + "=" + (i * num));
        }

        System.out.println("***********************************");

    }

}