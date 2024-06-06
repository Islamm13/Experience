package lesson9;

public class For {

    public static void main(String[] args) {


//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Java is Great: ");
//
//        }

        for (int i = 1; i <= 10 ; i++) {

            System.out.println("***********************************");

            for (int j = 1; j <= 10 ; j++) {

                System.out.println(i + "x" + j + "=" +(i*j));
            }
            System.out.println("***********************************");
        }
    }
}


