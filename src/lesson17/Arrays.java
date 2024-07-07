package lesson17;

public class Arrays {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};

        System.out.print("İlk hal: ");
        printArray(array);  // İlk halini çap et

        reverseArray(array);  // Massivi tərsinə çevir

        System.out.print("Tərs hal: ");
        printArray(array);  // Tərs halini çap et
    }

    // Massivi tərsinə çevirən metod
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // İlk və son elementləri mübadilə et
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // İndexsləri bir dərəcə artırmaq və azaltmaq
            start++;
            end--;
        }
    }

    // Massivi çap edən metod
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();



    }
}
