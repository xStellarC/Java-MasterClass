import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;

    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {

        Customer existingCustomer = findCustomer(customerName);
        if (findCustomer(customerName) != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (this.customers.get(i).getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
