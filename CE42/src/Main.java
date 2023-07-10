import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    MobilePhone phone = new MobilePhone("123");

    phone.printContacts();

    phone.addNewContact(Contact.createContact("Janusz", "234"));
    phone.addNewContact(Contact.createContact("Kasia", "456"));
    phone.addNewContact(Contact.createContact("Janusz", "234"));

    phone.printContacts();
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        if (array.length == 1) return min;
        for (int i=1; i<array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }


}