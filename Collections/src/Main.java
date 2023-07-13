import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String dog = "puppy";
        String dog2 = dog;
        String dog3 = "puppy";
        List<String> list = new ArrayList<>();
        list.add(dog);
        list.add(dog2);
        list.add(dog3);
        for(String string : list) {
            System.out.println(string);
        }
        System.out.println();

        list.remove("puppy");
        list.remove("puppy");
        list.remove("puppy");

        for(String string : list) {
            System.out.println(string);
        }
        System.out.println();
    }
}