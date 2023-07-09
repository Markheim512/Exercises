public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "beef", 19.10, "Sesame bun");
        super.addHamburgerAddition1("Chips" , 0d);
        super.addHamburgerAddition2("Drink", 0d);
    }
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    public void addHamburgerAddition2(String name, double price) {
        addHamburgerAddition1("", 0);
    }
    public void addHamburgerAddition3(String name, double price) {
        addHamburgerAddition1("", 0);
    }
    public void addHamburgerAddition4(String name, double price) {
        addHamburgerAddition1("", 0);
    }

}
