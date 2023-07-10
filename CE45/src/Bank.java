import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) return false;
        Branch branch = new Branch(name);
        branches.add(branch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double init) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.newCustomer(customerName, init);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (Objects.equals(branch.getName(), name)) return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean print) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        System.out.println("Customer details for branch " + branchName);

        int i = 1;

        for(Customer customer : branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + i + "]");
            i++;
            if (print) {
                System.out.println("Transactions");
                int j = 1;
                for(Double transaction : customer.getTransactions()) {
                    System.out.println("[" + j + "] Amount " + transaction);
                    j++;
                }
            }
        }

        return true;
    }
}
