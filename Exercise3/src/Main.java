public class Main {
    public static void main(String[] args) {
        //System.out.println(getDigitCount(reverse(123456)));
        numberToWords(1234560000);
    }

    public static void numberToWords (int number) {
        if (number<0) {
            System.out.println("Invalid Value");
            return;
        }

        int r = reverse(number);
        int zeros = (getDigitCount(number) - getDigitCount(r));

        do {
            switch (r % 10) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
            }
            r /= 10;
        } while (r != 0);

        for (int i=1; i<=zeros; i++) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount (int n) {
        if (n<0) return -1;
        int count = 0;
        do {
            count++;
            n /= 10;
        }
        while (n != 0);
        return count;
    }
    public static int reverse (int n) {
        int r = 0;
        while (n != 0) {
            r *= 10;
            r += (n % 10);
            n = n / 10;
        }
        return r;
    }
}