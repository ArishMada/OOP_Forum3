package Forum3;

public class Customer {
    private final String firstName;
    private final String lastName;
    private Account account;
    private int numOfAccount;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setNumOfAccount(int numOfAccount) {
        this.numOfAccount = numOfAccount;
    }

    public void setAccount(Account account) {
        if (numOfAccount == 0) {
            this.account = account;
        } else {
            System.out.println("This customer already has an account");
        }
    }
}
