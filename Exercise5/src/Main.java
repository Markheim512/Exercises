public class Main {
    public static void main(String[] args) {
        printSquareStar(33);
    }
    public static void printSquareStar (int number) {
        if (number<5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i=1; i<=number; i++) System.out.print("*");
        System.out.println();
        for (int line=2; line<number; line++){
            System.out.print("*");
            for (int position=2; position<number; position++) {
                if (position == line || position == (number - line + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i=1; i<=number; i++) System.out.print("*");
    }
}