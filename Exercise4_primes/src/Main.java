public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(18185));
    }

    public static int getLargestPrime (int number) {
        //if (number<=0) return -1;
        int n = number;
        while (n>=2) {
            if (number % n == 0) {
                //if n is prime return n, else continue
                boolean isPrime = true;
                for (int i=2; i<=n/2; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) return n;
            }
            n--;
        }
        return -1;
    }

    public static int getLargestPrime2 (int number) {
        if (number<=0) return -1;
        int n = number/2;
        while (n>=2) {
            if (number % n == 0 && isPrime(n)) return n;
            n--;
        }
        return -1;
    }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}