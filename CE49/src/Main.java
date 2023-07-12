import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //String two = "2";
        ArrayList<Node> nodes = new ArrayList<>();

        nodes.add(new Node("9"));
        nodes.add(new Node("2"));
        nodes.add(new Node("8"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));
        nodes.add(new Node("1"));
        nodes.add(new Node("6"));
        nodes.add(new Node("7"));
        nodes.add(new Node("5"));





        SearchTree tree = new SearchTree(nodes.get(6));

//        tree.addItem(nodes.get(0));

        for(Node node : nodes) {
            System.out.print(tree.addItem(node));
            System.out.println(": added node, value:" + node.getValue());
        }
        System.out.println();

        System.out.println("Root: " + tree.getRoot().getValue());

        System.out.println();

        for(Node node : nodes) {
            System.out.println("Node value: " + node.getValue());

            if (node.previous() != null)
                System.out.println("to the left: " + node.previous().getValue());
            else System.out.println("to the left: null");

            if (node.next() != null)
                System.out.println("to the right: " + node.next().getValue());
            else System.out.println("to the right: null");

            System.out.println();
        }

        System.out.println("Attempting to remove node " + nodes.get(6).getValue());
        System.out.println("success? " + tree.removeItem(nodes.get(6)));
        System.out.println();

        for(Node node : nodes) {
            System.out.println("Node value: " + node.getValue());

            if (node.previous() != null)
                System.out.println("to the left: " + node.previous().getValue());
            else System.out.println("to the left: null");

            if (node.next() != null)
                System.out.println("to the right: " + node.next().getValue());
            else System.out.println("to the right: null");

            System.out.println();
        }
    }
}