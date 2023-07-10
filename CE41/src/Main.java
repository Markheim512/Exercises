import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = getIntegers(5);
//        printArray(sortIntegers(array));
//        printArray(array);
    }

    public static int[] getIntegers(int size) {
         Scanner scanner = new Scanner(System.in);
         int[] array = new int[size];
         for(int i=0; i<array.length; i++) {
             array[i] = scanner.nextInt();
         }
         scanner.close();
         return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        if (array.length == 1) return array;
        boolean isUnsorted = true;
        do {
            isUnsorted = false;
            for (int i=0; i<array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    System.out.println("Swapping " + array[i] + " with " + array[i+1] );
                    array[i] += array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] -= array[i + 1];
                    isUnsorted = true;
                }
            }
        } while (isUnsorted);
        return array;
    }
}