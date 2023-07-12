public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
        root.setPrevious(null);
        root.setNext(null);
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if (listItem == null) return false;
        if (root == null) {
            root = listItem;
            return true;
        }
        ListItem currentItem = root;
        if (listItem.compareTo(currentItem) == 0) return false;
        if (listItem.compareTo(currentItem) < 0) {
            listItem.setNext(root);
            listItem.setPrevious(null);
            root.setPrevious(listItem);
            root = listItem;
            return true;
        }
        while (currentItem.next() != null) {
            currentItem = currentItem.next();
            if (listItem.compareTo(currentItem) == 0) return false;
            if (listItem.compareTo(currentItem) < 0) {
                listItem.setPrevious(currentItem.previous());
                listItem.setNext(currentItem);
                currentItem.previous().setNext(listItem);
                currentItem.setPrevious(listItem);
                return true;
            }
        }
        currentItem.setNext(listItem);
        listItem.setPrevious(currentItem);
        listItem.setNext(null);
        return true;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if (listItem == null) return false;
        ListItem currentItem = root;
        if (listItem.compareTo(currentItem) == 0) {
            if (root.next() == null)
                root = null;
            else {
                root = root.next();
                root.setPrevious(null);
            }
            listItem.setPrevious(null); //delete?
            listItem.setNext(null); //delete?
            return true;
        }
        while (currentItem.next() != null) {
            currentItem = currentItem.next();
            if (listItem.compareTo(currentItem) == 0) {
                if (currentItem.next() != null)
                    currentItem.previous().setNext(currentItem.next());
                else currentItem.previous().setNext(null);
                listItem.setNext(null); //delete?
                listItem.setPrevious(null); //delete?
                return true;
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root==null) {
            System.out.println("The list is empty");
            return;
        }
        ListItem currentItem = root;
        System.out.println(currentItem.getValue().toString());

        while (currentItem.next() != null) {
            currentItem = currentItem.next();
            System.out.println(currentItem.getValue().toString());
        }

    }
}
