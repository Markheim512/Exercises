public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
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
        ListItem lowerItem = null;
        boolean wentNext = true;

        while (currentItem != null) {
            lowerItem = currentItem;
            if (listItem.compareTo(currentItem) < 0) {
                currentItem = currentItem.previous();
                wentNext = false;
            } else if (listItem.compareTo(currentItem) > 0) {
                currentItem = currentItem.next();
                wentNext = true;
            } else return false;
        }
        currentItem = listItem;
        if (wentNext) lowerItem.setNext(listItem);
        else lowerItem.setPrevious(listItem);
        currentItem.setPrevious(null); //delete?
        currentItem.setNext(null); //delete?
        return true;
    }

    private void performRemoval(ListItem child, ListItem parent) {
        child.setNext(parent.next());
        child.setPrevious(parent.previous());
        parent = child;
        child = null;
    }

//    @Override
//    public boolean removeItem(ListItem listItem) {
//        if (listItem == null) return false;
//        if (root == null) return false;
//
//        ListItem currentItem = root;
//        ListItem lowerItem = null;
//        ListItem parent;
//        ListItem child;
//        boolean wentNext;
//        boolean flag = false;
//
//        //  REMOVING ROOT
//
//        if (listItem.compareTo(root) == 0) {
//            if (currentItem.next() == null && currentItem.previous() == null) {
//                root = null;
//            }
//            else if (currentItem.next() == null) {
//                parent = currentItem;
//                currentItem = currentItem.previous();
//                while (currentItem.next() != null) {
//                    lowerItem = currentItem;
//                    currentItem = currentItem.next();
//                }
//                child = currentItem;
//                if (lowerItem != null)
//                    lowerItem.setNext(currentItem.previous());
//                root = child;
//                performRemoval(child, parent);
//            }
//            else {
//                parent = currentItem;
//                currentItem = currentItem.next();
//                while (currentItem.previous() != null) {
//                    lowerItem = currentItem;
//                    currentItem = currentItem.previous();
//                }
//                child = currentItem;
//                if (lowerItem != null)
//                    lowerItem.setPrevious(currentItem.next());
//                root = child;
//                performRemoval(child, parent);
//            }
//            return true;
//        }
//        else if (listItem.compareTo(root) < 0) {
//            currentItem = root.previous();
//            wentNext = false;
//        }
//        else {
//            currentItem = root.next();
//            wentNext = true;
//        }
//        lowerItem = root;
//
//        //  REMOVING SOMETHING OTHER THAN ROOT
//
//        while (currentItem != null) {
//            if (listItem.compareTo(currentItem) < 0) {
//                lowerItem = currentItem;
//                currentItem = currentItem.previous();
//                wentNext = false;
//            }
//            else if (listItem.compareTo(currentItem) > 0) {
//                lowerItem = currentItem;
//                currentItem = currentItem.next();
//                wentNext = true;
//
//            }
//            else if (listItem.compareTo(currentItem) == 0) {                                            //found the item to be removed
//                if (currentItem.next() == null && currentItem.previous() == null) {
//                    if (wentNext) lowerItem.setNext(null);
//                    else lowerItem.setPrevious(null);
//                }
//                else if (currentItem.next() == null) {
//                    parent = currentItem;
//                    lowerItem = currentItem;
//                    currentItem = currentItem.previous();
//                    while (currentItem.next() != null) {
//                        lowerItem = currentItem;
//                        currentItem = currentItem.next();
//                    }
//                    child = currentItem;
//                    lowerItem.setNext(currentItem.previous());
//                    performRemoval(child, parent);
//                }
//                else {
//                    parent = currentItem;
//                    lowerItem = currentItem;
//                    currentItem = currentItem.next();
//                    System.out.println("a");
//                    System.out.println(currentItem.getValue());
//                    System.out.println(lowerItem.getValue());
//                    while (currentItem.previous() != null) {
//                        flag = true;
//                        lowerItem = currentItem;
//                        currentItem = currentItem.previous();
//                        System.out.println("b");
//                    }
//                    child = currentItem;
//                    System.out.println("c");
//                    System.out.println(currentItem.getValue());
//
//                    System.out.println(lowerItem.getValue());
//
//                    if (flag) lowerItem.setPrevious(currentItem.next());
//                    else lowerItem.setNext(currentItem.next());
//                    System.out.println("d");
//                    System.out.println(currentItem.getValue());
//
//                    System.out.println(lowerItem.getValue());
//
//                    performRemoval(child, parent);
//                }
//                return true;
//            }
//        }
//        return false; //item not found
//    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if (listItem == null) return false;
        //if (root == null) return false;

        ListItem current = root;
        boolean wentLeft = true;
        boolean AisRoot;
        ListItem A;
        ListItem B;
        ListItem C = root;
        ListItem D;
        int cL = 0;
        int cR = 0;
        int max;
        boolean maxIsLeft;

        while(current != null) {
            if (listItem.compareTo(current) < 0) {
                wentLeft = true;
                C = current;
                current = current.previous();
            } else if (listItem.compareTo(current) > 0) {
                wentLeft = false;
                C = current;
                current = current.next();
            } else if (listItem.compareTo(current) == 0) {
                A = current;
                AisRoot = A == root;


                if (A.previous() != null) {
                    cL++;
                    current = A.previous();
                    while (current.next() != null) {
                        cL++;
                        current = current.next();
                    }
                }
                if (A.next() != null) {
                    cR++;
                    current = A.next();
                    while (current.previous() != null) {
                        cR++;
                        current = current.previous();
                    }
                }
                max = Math.max(cL, cR);
                maxIsLeft = max == cL;


                if (max == 0) {
//                    System.out.println("test0");

                    if (AisRoot) root = null;
                    else if (wentLeft) C.setPrevious(null);
                    else C.setNext(null);
                }
                else if (max == 1) {
//                    System.out.println("test1");
                    if (wentLeft) {
//                        System.out.println("test went left");

                        if (maxIsLeft) {
                            C.setPrevious(A.previous());
                            A.previous().setNext(A.next());
                        }
                        else {
                            C.setPrevious(A.next());
                            A.next().setPrevious(A.previous());
                        }
                    }
                    else {
//                        System.out.println("test went right");

                        if (maxIsLeft) {
//                            System.out.println("test mex is left");

                            C.setNext(A.previous());
                            A.previous().setNext(A.next());
                        }
                        else {
//                            System.out.println("test max is right");
//                            System.out.println("Setting right link of " + C.getValue() + " to " + A.next().getValue());
                            C.setNext(A.next());
                            A.next().setPrevious(A.previous());
                        }
                    }
                } else if (max >=2) {
//                    System.out.println("test2");
                    if(maxIsLeft) {
                        current = A.previous();
                        for (int i=1; i <= max - 2; i++) {
                            current = A.next();
                        }
                        D = current;
                        System.out.println("D is" + D.getValue());
                        B = D.next();
                        System.out.println("B is" + B.getValue());
                        D.setNext(null);
                        A.setValue(B.getValue());
                    }
                    else {
                        current = A.next();
                        for (int i=1; i <= max - 2; i++) {
                            current = A.previous();
                        }
                        D = current;
                        B = D.previous();
                        D.setPrevious(null);
                        A.setValue(B.getValue());
                    }

                }

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
