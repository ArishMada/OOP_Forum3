package OOP_Forum3;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<Customer>();;
    private int num0fCustomer = 0;
    private final String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public boolean deleteCustomer(int index) {
        customers.remove(index);
        num0fCustomer -= 1;
        return true;
    }

    public void addCustomer(String f, String l) {
        num0fCustomer += 1;
        Customer customer = new Customer(f, l);
        customers.add(customer);
    }

    public Customer getCustomer(int index) {
            return customers.get(index);
    }

    public int getNum0fCustomer() {
        return num0fCustomer;
    }

    public String getBankName() {
        return bankName;
    }
}
