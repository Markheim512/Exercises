import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double init) {
        this.name=name;
        transactions = new ArrayList<>();
        transactions.add(init);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
