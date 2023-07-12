public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        rightLink = listItem;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        leftLink = listItem;
        return leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        //if (value.equals(listItem)) return 0;
        //return value.toString().compareTo(listItem.toString());
        if (listItem.getValue() == null) return 1;
        return ( ( (String)value ) .compareTo ( (String)listItem.getValue() ) );
    }
}
