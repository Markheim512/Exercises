public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger() {
        return (price+addition1Price+addition2Price+addition3Price+addition4Price);
    }

}
