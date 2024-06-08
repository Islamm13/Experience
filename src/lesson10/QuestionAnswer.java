package lesson10;

import java.util.Scanner;

public class QuestionAnswer {
    public static void main(String[] args) {



        //1.What is JDK,JVM,JRE?
        //  JDK Java Development Kit dir ve butun istifadeye yararli toollari ozunde barindirir
        //  JVM Java Virtual Machine dir ve kodu Compiler etmek ucun istifade edilir
        //  JRE class librers dir ozun ozun Java size 1.0 dan bugune kimi olan butun kitabxanalari saxlayir



        //2.Which of the following are legal entry point methods that can be run from the command
        //line? (Choose all that apply)
        //    E.public static void main(String[] args).


        //3.  Which of the following lines of code compile? (Choose all that apply)
        //A. int i1 = 1_234;



        //  4...Write Primitive types
    /*
    byte  short  int  long  float  double  char  boolean
     */
        //


//
        // 5...Write a program to print numbers from 1 to 10.

//        for (int i = 0; i <=10 ; i++) {
//            System.out.println(+i);
//        }
//


        // 6...Write a program to calculate the sum of first 10 natural number.
        //Tapa bilmedim





        //
        // 7...What is Scanner ? Why we use it?
        //Scanner class dir ve Userin Output dan  yazdigi kodlari qebul etmek ucun isledilir
        //

        //  8...Write a Java program to print the area and perimeter of a circle.
//        Scanner scanner =new Scanner(System.in);
//
//        System.out.println("Uzunluq reqemini daxil edin:");
//        int uzunluq = scanner.nextInt();
//        System.out.println("En reqemini daxil edin:");
//        int eni = scanner.nextInt();
//        System.out.println("Uzunluq:"+uzunluq+" "+"Eni:"+eni);




        //  9...Write a Java program to print the area and perimeter of a rectangle.
//Yaza bilmedim

        //  10...Write a Java program to divide two numbers and print them on the screen.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Reqem daxil edin:");
//        double num = scanner.nextDouble();
//        System.out.println("Reqem daxil edin:");
//        double num1 = scanner.nextDouble();
//        System.out.println("Cavab: "+num/num1);



//        //   11...Is that true ?
//
//        int myNum = 5;
//        float myFloatNum = 5.99f;
//        char myLetter = 'D';
//        boolean myBool = true;
//        String myText = "Hello";
//
//        Yes that is true!


//        13.Answer

//        public int Valid() {
//            int y = 10;
//            int x;
//            int reply = x + y; //
//            sout(reply); Cavab 10 cunki x hec bir deyer menimsedilmeyib defolt deyeri 0 olduguna gore
//            }


        //
        //14.Difference between do while and while?
        // do while ile yazilan kodda en azi bir defe do nun body-si icra olunacaq sonra while in icine kececek
        //while ise yalniz oz body-si ici icra olunacaq
        //


//        15..What is Scanner input for String?

//        Scanner scanner =new Scanner(System.in);
//        String string = scanner.next();
//


//  16..Is java compiler or Interpreter Language?
        // Yes
//


//  17.. Write about 3 types of comments

        // Single line commen   Iki Slash ile  yazilir
        // Multiple Line Comment  Slash Ulduz ile acilir Ulduz Slash ile baglanir
        // Javadoc Comment   Slash Ulduz Ulduz ile acilir  Ulduz Slash ile baglanir
        //


// 18..       public class Name {
//            String first = "Theodore";
//            String last = "Moose";
//            String full = first + last;
//            Output:?
         //  Hecne Cap edilmeyecek  cunki Sout yoxdu




//  19.. Write a Java program to print the sum (addition), multiply, subtract,
//  divide and remainder of two numbers.
//        int a = 5;
//
//        int b = 8;
//
//        double c = 3;
//
//        System.out.println("Toplama: "+(a+b));
//        System.out.println("Cixma: "+ (b-a));
//        System.out.println("Vurma: "+a*b);
//        System.out.println("Bolme: "+b/a);
//        System.out.println("Qaliqli Bolme: "+b%c);


// 20..Write a Java program that takes a number from the user
// and generates an integer between 1 and 7. It displays the weekday name.

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Heftenin Gununu Secin:");
//        int weeks;
//
//        switch (weeks = scanner.nextInt()) {
//            case 1:
//                System.out.println("Monday: ");
//                break;
//            case 2:
//                System.out.println("Tuesday: ");
//                break;
//            case 3:
//                System.out.println("Wednesday: ");
//                break;
//            case 4:
//                System.out.println("Thursday: ");
//                break;
//            case 5:
//                System.out.println("Friday: ");
//                break;
//            case 6:
//                System.out.println("Saturday: ");
//                break;
//            case 7:
//                System.out.println("Sunday: ");
//                break;
//
//        }



// 21..Write login panel of Any site ,Just like password username.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input Login or Phone Number:");
//        String login = scanner.nextLine();
//        System.out.println("Input The Password:");
//        String password = scanner.next();
//        System.out.println("Login: "+login+" "+"Password: "+password);




// 22..Write types of comments:

        // bear
        /* ferret */


//  23...Write a Java program to print the results of the following operations.
//        System.out.println(-5 + (8 * 6));
//        System.out.println((55+9) % 9);
//        System.out.println(20 + (-3*5) / 8);
//        System.out.println((5 + 15) / (3 * 2 )- (8 % 3));



//  24...Write a Java program to print the sum of two numbers.
//
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        int sumOfEven = 0;
//        int a;
//
//        do {
//            System.out.println("Eded daxil edin: ");
//            a= scanner.nextInt();
//
//            if (a%2 >= 0) {
//                sumOfEven+=a;
//
//            }
//        }while (a!=0);
//
//        System.out.println("Cem = "+sumOfEven);
//         Hazir deyil



//  25...Write a Java program to print 'Hello' on screen and your name on a separate line.
//
//        Scanner scanner =new Scanner(System.in);
//
//        String name = scanner.next();
//        System.out.println("Hello: "+name);




//   26...Write a Java program to get a number from the user and print whether it is positive or negative.
//Scanner scanner = new Scanner(System.in);
//int num1 = scanner.nextInt();
//
//        if (num1 < 0) {
//            System.out.println("Pozitive Number: "+num1);
//        }
//        else
//            System.out.println("Negative Number"+num1);
        // Hazir deyil





//  27...Write a Java program that takes three numbers from the user and prints the greatest number.
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Reqemleri daxil edin:");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        if (a>b && a>c){
//            System.out.println("Boyuk Reqem:"+a);
//        } else if (b>c) {
//            System.out.println("Orta reqem:"+b);
//
//        }else {
//            System.out.println("Kicik Reqem:"+c);
//        }
//        Sout da problem yasadim reqemleri daxil etdikden sora siralamani duzelde bilmedim



//  28...What is Java?
//  Java Proqramlasdirma dilidir isdenilen proqrami Java ile yigmaq olar misal(web site , game , app)



//  29...What is Intellij?
//  Intellej Javani istifade etmeyimiz ucun yaradilan platformadir


//  30..What is “ikili say sistemi” (az melumat okdur)?
//  Tapa bilmedim


      

    }

}
