import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfRoots(1,2,0));
        System.out.println(swapCases("Nazywam się Jan Murawski 123"));
        System.out.println(max(1,2,3));
        System.out.println(rightAngleTriangle(3,5,4));
        System.out.println(sumOfInterval(1, 4));
        System.out.println(countGreater(new int[] {1,2,3,4,5}, 2));
        System.out.println(thirdGreatest(new int[] {2, 7 ,5, 9}));
        System.out.println(moreConsonants("abcde", "fghij"));
        System.out.println(substring("0123456789", 3, 5));
        System.out.println(maxOfLargerAvg(new int[] {1, 2, 5, 4, 3}, new int[] {2, 4, 6, 3}));
    }

    static int numberOfRoots(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if(delta == 0) return 1;
        else if (delta > 0) return 2;
        else return 0;
    }

    static String swapCases(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(array[i])) array[i]=Character.toUpperCase(array[i]);
            else if (Character.isUpperCase(array[i])) array[i]=Character.toLowerCase(array[i]);
        }
        return String.valueOf(array);
    }

    static double max(double a, double b, double c) {
        return Math.max(a, Math.max(b,c));
    }

    static boolean rightAngleTriangle(double a, double b, double c) {
        if (a<=0 || b<=0 || c<=0) throw new IllegalArgumentException("Triangle edges must have positive lengths.");
        double[] edges = {a,b,c};
        Arrays.sort(edges);
        return (edges[0]*edges[0]+edges[1]*edges[1] == edges[2]*edges[2]);
    }

    static int sumOfInterval(int a, int b) {
        return (b-a+1)*(a+b)/2;
    }

    static int countGreater(int[] array, int a) {
        int counter = 0;
        for (int x: array) {
            if (x>a) counter++;
        }
        return counter;
    }

    static int thirdGreatest(int[] array) {
        if (array.length < 3) throw new IllegalArgumentException("Array must have at least 3 elements.");
        int[] a2 = Arrays.copyOf(array, array.length);
        Arrays.sort(a2);
        return a2[a2.length - 3];
    }

    static String moreConsonants(String a, String b) {
        String consonants = "[^aąeęioóuyAĄEĘIOÓUY]"; //ten sam problem co w napisach
        int counter = 0;
        char[] a_ch = a.toCharArray();
        char[] b_ch = b.toCharArray();

        for (int i = 0; i < a.length(); i++) {
            if (String.valueOf(a_ch[i]).matches(consonants)) counter++;
        }
        for (int i = 0; i < b.length(); i++) {
            if (String.valueOf(b_ch[i]).matches(consonants)) counter--;
        }

        if (counter >= 0) return a;
        else return b;
    }

    static String substring(String str, int a, int b) {
        return str.substring(a, b + 1); /// po co to
    }

    static int maxOfLargerAvg(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        for (int x : a) sumA +=x;
        for (int x : b) sumB +=x;
        int[] c;
        if ((double) sumA / a.length > (double) sumB / b.length) c = a;
        else c = b;
        Arrays.sort(c);
        return (c[c.length -1]);
    }
}