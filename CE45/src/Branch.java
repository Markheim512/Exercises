import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double init) {
        if (findCustomer(name) != null) return false;
        Customer customer = new Customer(name, init);
        customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer == null) return false;
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (Objects.equals(customer.getName(), name)) return customer;
        }
        return null;
    }
}
