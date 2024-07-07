package lesson17;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    // Massiv yaradırıq (məsələn, 5 elementli bir massiv)
    int[] massiv = {2, 5, 8, 10, 15};

        System.out.print("Axtarmaq istədiyiniz ədədi daxil edin: ");
    int axtarilanEded = scanner.nextInt();

    // Axtarilan ədədi massivdə axtarıb tapmaq
    boolean tapildi = false;
        for (int i = 0; i < massiv.length; i++) {
        if (massiv[i] == axtarilanEded) {
            tapildi = true;
            break;
        }
    }

    // Nəticəni çap etmək
        if (tapildi) {
        System.out.println("Ədəd massivdə tapıldı.");
    } else {
        System.out.println("Ədəd massivdə tapılmadı.");
    }

        scanner.close();
    }
}
