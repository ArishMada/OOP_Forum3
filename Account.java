package OOP_Forum3;

public class Account {
    private double balance;
    private int pin;
    private boolean frozen = false;

    public Account(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public boolean deposit(double amount) {
        if (!frozen) {
            if (amount > 0.0) {
                balance += amount;
                return true;
            } else {
                System.out.println("Failed transaction. The amount must be more than 0$");
                return false;
            }
        } else {
            System.out.println("You cannot deposit money, your account has been frozen");
            System.out.println("Please contact your bank");
            return false;
        }

    }

    public boolean withdraw(double amount) {
        if (!frozen) {
            if (amount <= balance) {
                balance -= amount;
                return true;
            } else {
                System.out.println("Failed transaction. You do not have enough funds in your account");
                return false;
            }
        } else {
            System.out.println("You cannot withdraw money, your account has been frozen");
            System.out.println("Please contact your bank");
            return false;
        }
    }
}
