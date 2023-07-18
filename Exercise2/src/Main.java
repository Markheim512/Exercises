public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(123, 234, 343));
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!(isValid(a) && isValid(b) && isValid(c))) return false;
        a = a % 10;
        b = b % 10;
        c = c % 10;
        return (a == b || b == c || c == a);
    }
        public static boolean isValid (int a) {
            if (a < 10 || 1000 < a) return false;
            return true;
        }
//    public static boolean hasSharedDigit (int a, int b) {
//        if (10 > a || a > 99) return false;
//        if (10 > b || b > 99) return false;
//        int a1 = a % 10;
//        int a2 = a / 10;
//        int b1 = b % 10;
//        int b2 = b / 10;
//        if (a1 == b1 || a2 == b1 || a1 == b2 || a2 == b2) return true;
//        return false;
//    }
//    public static int getEvenDigitSum (int n) {
//        if (n<0) return -1;
//        int sum = 0;
//        while (n != 0) {
//            if (n % 2 == 0)
//                sum += (n % 10);
//            n = n / 10;
//        }
//        return sum;
//    }
//    public static boolean isPalindrome (int n) {
//        int r = 0;
//        int m = n;
//        while (n != 0) {
//            r *= 10;
//            r += (n % 10);
//            n = n / 10;
//        }
//        return (r == m);
//    }
//    public static int sumFirstAndLastDigit (int n) {
//        if (n < 0) return -1;
//        int last = n % 10;
//        int first = 0;
//        while (n != 0) {
//            first = n;
//            n /= 10;
//        }
//        return (first + last);
//    }
}