public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode current = this;
        do {
            System.out.println(current.val);
            current = current.next;
        } while (current != null);
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null) return null;

        ListNode first = head;
        ListNode second = null;
        ListNode third = null;

        if (first.next != null) {
            second = first.next;
            if (second.next != null) third = second.next;
        }

        first.next = null;


        while (second != null) {
            second.next = first;
            first = second;
            second = third;
            if (third != null && third.next != null) {
                third = third.next;
            } else third = null;
        }
        return (first);
    }
}
