// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4, e);
//        ListNode c = new ListNode(3, d);
//        ListNode b = new ListNode(2, c);
//        ListNode a = new ListNode(1, b);


        d.print();

        System.out.println("----------------------");

        ListNode rev = ListNode.reverseList(d);

        d.print();

        System.out.println("----------------------");

        rev.print();



    }
}