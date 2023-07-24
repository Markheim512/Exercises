import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class Main1 {

    // np dla value = 5 oraz tablicy [21, 34, 5, 67, 5, 54, 4, 5] wynikiem [2, 4, 7]
    static String[] getIndicesOf(int value, int[] arr) {
        var sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                sb
                        .append(i)
                        .append(" ");
            }
        }

        return sb.toString().strip().split(" ");
    }

    static int[] toInt(String[] items) {
        var numbers = new int[items.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }
        return numbers;
    }

    // KAJAK
    // kajak
    // KajAk
    static boolean isPalindrome(String text) {
        // Na potrzeby tego zadania pomijam fakt ze moga byc spacje wenatrz
        // napisu, ewentualnie na koncu i poczatku

        var text2 = text.strip();
        return new StringBuilder(text2)
                .reverse()
                .toString()
                .equalsIgnoreCase(text2);
    }

    public static void main(String[] args) {
        // StringBuffer
        StringBuilder sb = new StringBuilder("ala");
        sb.append(" ma kota");
        sb.append("aaa");
        sb.append("aaaaa");
        sb.append("x");
        sb.delete(2, 6);
        sb.deleteCharAt(7);
        sb.insert(0, "ALALALA");
        sb.replace(2, 5, ".");
        sb.reverse(); // odwrocic napis
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        for (int i = 0; i < 1000000; i++) {
            sb.append("x");
        }
        System.out.println("END");
        // System.out.println(sb.toString());

        System.out.println(isPalindrome("kajaK"));
        System.out.println(isPalindrome("kajaczek"));

        int[] arr = {12, 43, 45, 67, 12, 34};
        System.out.println(Arrays.toString(toInt(getIndicesOf(12, arr))));

        StringJoiner sj = new StringJoiner("...");
        sj.add("ALA");
        sj.add("OLA");
        sj.add("EWA");
        System.out.println(sj.toString());
    }
}
