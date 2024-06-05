package lesson9;

public class Continue {
    public static void main(String[] args) {


        int a = 0;

        while (a < 11){

            if (a == 5 || a == 7) {
                a++;
                continue;

            }
            System.out.println("a = "+a);
            a++;

        }

    }
}
