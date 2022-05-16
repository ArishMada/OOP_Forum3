package Forum3;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;


public class test2 {

    public void OpenAccount() {

    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        int manager_code = 2548;

        Scanner sc = new Scanner(System.in);

        ArrayList<String> banks = new ArrayList<>();
        Bank b1 = new Bank("BCA");
        Bank b2 = new Bank("BNI");
        Bank b3 = new Bank("MCB");
        Collections.addAll(banks, b1.getBankName(), b2.getBankName(), b3.getBankName());

        int ch;
        do {
            System.out.println("***ATM***");
            System.out.println("1. Customer \n2. Manager \n3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int ch1;
                    do {
                        System.out.println("Hello, please choose an actions from the options below");
                        System.out.println("1. Open an account \n2. Manage your account \n3. Delete your account \n4.Exit");
                        System.out.print("Enter your choice: ");
                        ch1 = sc.nextInt();
                        int ch2;
                        boolean found;
                        switch (ch1) {
                            case 1:
                                System.out.println("Choose your bank");
                                for (int i = 0; i < banks.size(); i++) {
                                    System.out.println((i + 1) + ": " + banks.get(i));
                                }
                                System.out.println("4: Exit");
                                System.out.print("Enter your choice: ");
                                ch2 = sc.nextInt();
                                String fn, ln;
                                int pin, pin_confirmed;
                                found = false;
                                System.out.print("Enter your first name: ");
                                fn = sc.next();
                                System.out.print("Enter your last name: ");
                                ln = sc.next();
                                switch (ch2) {
                                    case 1:
                                        for (int i = 0; i < b1.getNum0fCustomer(); i++) {
                                            if (b1.getCustomer(i).getFirstName().equals(capitalize(fn)) && b1.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.println("This account already exist");
                                            }
                                        }
                                        if (!found) {
                                            System.out.print("Enter your 4 digits pin: ");
                                            pin = sc.nextInt();
                                            while (pin < 1000 || pin > 9999) {
                                                System.out.print("The pin is not 4 digits, please reenter the pin: ");
                                                pin = sc.nextInt();
                                            }
                                            System.out.print("Confirm your pin: ");
                                            pin_confirmed = sc.nextInt();
                                            while (pin != pin_confirmed) {
                                                System.out.print("The two pins you entered are different, please reenter the pin: ");
                                                pin = sc.nextInt();
                                                while (pin < 1000 || pin > 9999) {
                                                    System.out.print("The pin is not 4 digits, please reenter the pin: ");
                                                    pin = sc.nextInt();
                                                }
                                                System.out.print("Confirm your pin: ");
                                                pin_confirmed = sc.nextInt();
                                            }
                                            b1.addCustomer(fn, ln);
                                            b1.getCustomer(b1.getNum0fCustomer() - 1).setAccount(new Account(0.00, pin));
                                        }
                                        break;
                                    case 2:
                                        for (int i = 0; i < b2.getNum0fCustomer(); i++) {
                                            if (b2.getCustomer(i).getFirstName().equals(capitalize(fn)) && b2.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.println("This account already exist");
                                            }
                                        }
                                        if (!found) {
                                            System.out.print("Enter your 4 digits pin: ");
                                            pin = sc.nextInt();
                                            while (pin < 1000 || pin > 9999) {
                                                System.out.print("The pin is not 4 digits, please reenter the pin: ");
                                                pin = sc.nextInt();
                                            }
                                            System.out.print("Confirm your pin: ");
                                            pin_confirmed = sc.nextInt();
                                            while (pin != pin_confirmed) {
                                                System.out.print("The two pins you entered are different, please reenter the pin: ");
                                                pin = sc.nextInt();
                                                while (pin < 1000 || pin > 9999) {
                                                    System.out.print("The pin is not 4 digits, please reenter the pin: ");
                                                    pin = sc.nextInt();
                                                }
                                                System.out.print("Confirm your pin: ");
                                                pin_confirmed = sc.nextInt();
                                            }
                                            b2.addCustomer(fn, ln);
                                            b2.getCustomer(b2.getNum0fCustomer() - 1).setAccount(new Account(0.00, pin));
                                        }
                                        break;
                                    case 3:
                                        for (int i = 0; i < b3.getNum0fCustomer(); i++) {
                                            if (b3.getCustomer(i).getFirstName().equals(capitalize(fn)) && b3.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.println("This account already exist");
                                            }
                                        }
                                        if (!found) {
                                            System.out.print("Enter your 4 digits pin: ");
                                            pin = sc.nextInt();
                                            while (pin < 1000 || pin > 9999) {
                                                System.out.print("The pin is not 4 digits, please reenter the pin: ");
                                                pin = sc.nextInt();
                                            }
                                            System.out.print("Confirm your pin: ");
                                            pin_confirmed = sc.nextInt();
                                            while (pin != pin_confirmed) {
                                                System.out.print("The two pins you entered are different, please reenter the pin: ");
                                                pin = sc.nextInt();
                                                while (pin < 1000 || pin > 9999) {
                                                    System.out.print("The pin is not 4 digits, please reenter the pin: ");
                                                    pin = sc.nextInt();
                                                }
                                                System.out.print("Confirm your pin: ");
                                                pin_confirmed = sc.nextInt();
                                            }
                                            b3.addCustomer(fn, ln);
                                            b3.getCustomer(b3.getNum0fCustomer() - 1).setAccount(new Account(0.00, pin));
                                        }
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Unexpected value: " + ch2);
                                }
                                break;
                            case 2:
                                System.out.println("Choose your bank");
                                for (int i = 0; i < banks.size(); i++) {
                                    System.out.println((i + 1) + ": " + banks.get(i));
                                }
                                System.out.println("4: Exit");
                                System.out.print("Enter your choice: ");
                                ch2 = sc.nextInt();
                                int the_pin;
                                System.out.print("Enter your first name: ");
                                fn = sc.next();
                                System.out.print("Enter your last name: ");
                                ln = sc.next();
                                found = false;
                                switch (ch2) {
                                    case 1:
                                        for (int i = 0; i < b1.getNum0fCustomer(); i++) {
                                            if (b1.getCustomer(i).getFirstName().equals(capitalize(fn)) && b1.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.print("Enter your 4 digits pin: ");
                                                the_pin = sc.nextInt();
                                                int y = 2;
                                                while (y > 0 && b1.getCustomer(i).getAccount().getPin() != the_pin) {
                                                    y--;
                                                    System.out.print("The pin is incorrect, please reenter (" + (y+1) + " attempts remaining)");
                                                    the_pin = sc.nextInt();
                                                }
                                                if (y == 0) {
                                                    System.out.println("You entered the wrong pin 3 times");
                                                }
                                                if (b1.getCustomer(i).getAccount().getPin() == the_pin) {
                                                    int ch3;
                                                    System.out.println("Your balance is: " + b1.getCustomer(i).getAccount().getBalance() + "$");
                                                    System.out.println("1. Deposit \n2. Withdraw \n3. Exit");
                                                    System.out.println("Enter your choice: ");
                                                    ch3 = sc.nextInt();
                                                    double amount;
                                                    switch (ch3) {
                                                        case 1:
                                                            System.out.println("Enter the amount you want to deposit: ");
                                                            amount = sc.nextDouble();
                                                            if (b1.getCustomer(i).getAccount().deposit(amount)) {
                                                                System.out.println("You have successfully deposited " + amount + "$ into your account");
                                                                System.out.println("Your new balance is " + b1.getCustomer(i).getAccount().getBalance() + "$");
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("Enter the amount you want to withdraw: ");
                                                            amount = sc.nextDouble();
                                                            if (b1.getCustomer(i).getAccount().withdraw(amount)) {
                                                                System.out.println("You have successfully withdrew \" + amount + \"$ into your account");
                                                                System.out.println("Your new balance is " + b1.getCustomer(i).getAccount().getBalance() + "$");
                                                            }
                                                            break;
                                                        case 3:
                                                            break;
                                                        default:
                                                            throw new IllegalStateException("Unexpected value: " + ch3);
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Account does not exist");
                                        }
                                        break;
                                    case 2:
                                        for (int i = 0; i < b2.getNum0fCustomer(); i++) {
                                            if (b2.getCustomer(i).getFirstName().equals(capitalize(fn)) && b2.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.print("Enter your 4 digits pin: ");
                                                the_pin = sc.nextInt();
                                                int y = 2;
                                                while (y > 0 && b2.getCustomer(i).getAccount().getPin() != the_pin) {
                                                    y--;
                                                    System.out.print("The pin is incorrect, please reenter (" + (y+1) + " attempts remaining)");
                                                    the_pin = sc.nextInt();
                                                }
                                                if (y == 0) {
                                                    System.out.println("You entered the wrong pin 3 times");
                                                }
                                                if (b2.getCustomer(i).getAccount().getPin() == the_pin) {
                                                    int ch3;
                                                    System.out.println("Your balance is: " + b2.getCustomer(i).getAccount().getBalance() + "$");
                                                    System.out.println("1. Deposit \n2. Withdraw \n3. Exit");
                                                    System.out.println("Enter your choice: ");
                                                    ch3 = sc.nextInt();
                                                    double amount;
                                                    switch (ch3) {
                                                        case 1:
                                                            System.out.println("Enter the amount you want to deposit: ");
                                                            amount = sc.nextDouble();
                                                            if (b2.getCustomer(i).getAccount().deposit(amount)) {
                                                                System.out.println("You have successfully deposited " + amount + "$ into your account");
                                                                System.out.println("Your new balance is " + b2.getCustomer(i).getAccount().getBalance() + "$");
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("Enter the amount you want to withdraw: ");
                                                            amount = sc.nextDouble();
                                                            if (b2.getCustomer(i).getAccount().withdraw(amount)) {
                                                                System.out.println("You have successfully withdrew \" + amount + \"$ into your account");
                                                                System.out.println("Your new balance is " + b2.getCustomer(i).getAccount().getBalance() + "$");
                                                            }
                                                            break;
                                                        case 3:
                                                            break;
                                                        default:
                                                            throw new IllegalStateException("Unexpected value: " + ch3);
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Account does not exist");
                                        }
                                        break;
                                    case 3:
                                        for (int i = 0; i < b3.getNum0fCustomer(); i++) {
                                            if (b3.getCustomer(i).getFirstName().equals(capitalize(fn)) && b3.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.print("Enter your 4 digits pin: ");
                                                the_pin = sc.nextInt();
                                                int y = 2;
                                                while (y > 0 && b3.getCustomer(i).getAccount().getPin() != the_pin) {
                                                    y--;
                                                    System.out.print("The pin is incorrect, please reenter (" + (y+1) + " attempts remaining)");
                                                    the_pin = sc.nextInt();
                                                }
                                                if (y == 0) {
                                                    System.out.println("You entered the wrong pin 3 times");
                                                }
                                                if (b3.getCustomer(i).getAccount().getPin() == the_pin) {
                                                    int ch3;
                                                    System.out.println("Your balance is: " + b3.getCustomer(i).getAccount().getBalance() + "$");
                                                    System.out.println("1. Deposit \n2. Withdraw \n3. Exit");
                                                    System.out.println("Enter your choice: ");
                                                    ch3 = sc.nextInt();
                                                    double amount;
                                                    switch (ch3) {
                                                        case 1:
                                                            System.out.println("Enter the amount you want to deposit: ");
                                                            amount = sc.nextDouble();
                                                            if (b3.getCustomer(i).getAccount().deposit(amount)) {
                                                                System.out.println("You have successfully deposited " + amount + "$ into your account");
                                                                System.out.println("Your new balance is " + b3.getCustomer(i).getAccount().getBalance() + "$");
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("Enter the amount you want to withdraw: ");
                                                            amount = sc.nextDouble();
                                                            if (b3.getCustomer(i).getAccount().withdraw(amount)) {
                                                                System.out.println("You have successfully withdrew \" + amount + \"$ into your account");
                                                                System.out.println("Your new balance is " + b3.getCustomer(i).getAccount().getBalance() + "$");
                                                            }
                                                            break;
                                                        case 3:
                                                            break;
                                                        default:
                                                            throw new IllegalStateException("Unexpected value: " + ch3);
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Account does not exist");
                                        }
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Unexpected value: " + ch2);;
                                }
                                break;
                            case 3:
                                System.out.println("Choose your bank");
                                for (int i = 0; i < banks.size(); i++) {
                                    System.out.println((i + 1) + ": " + banks.get(i));
                                }
                                System.out.println("4: Exit");
                                System.out.print("Enter your choice: ");
                                ch2 = sc.nextInt();
                                System.out.print("Enter your first name: ");
                                fn = sc.next();
                                System.out.print("Enter your last name: ");
                                ln = sc.next();
                                found = false;
                                switch (ch2) {
                                    case 1:
                                        for (int i = 0; i < b1.getNum0fCustomer(); i++) {
                                            if (b1.getCustomer(i).getFirstName().equals(capitalize(fn)) && b1.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.print("Enter your 4 digits pin: ");
                                                the_pin = sc.nextInt();
                                                int y = 2;
                                                while (y > 0 && b1.getCustomer(i).getAccount().getPin() != the_pin) {
                                                    y--;
                                                    System.out.print("The pin is incorrect, please reenter (" + (y+1) + " attempts remaining)");
                                                    the_pin = sc.nextInt();
                                                }
                                                if (y == 0) {
                                                    System.out.println("You entered the wrong pin 3 times");
                                                }
                                                if (b1.getCustomer(i).getAccount().getPin() == the_pin) {
                                                    String choice;
                                                    System.out.print("Are you sure you want to delete your account? (Yes/No): ");
                                                    choice = sc.next();
                                                    if (capitalize(choice).equals("Yes")) {
                                                        if (b1.getCustomer(i).getAccount().getBalance() != 0) {
                                                            System.out.println("Your balance is " + b1.getCustomer(i).getAccount().getBalance() + "$" + "\nWould you like to withdraw all? (Yes/No): ");
                                                            choice = sc.next();
                                                            if (capitalize(choice).equals("Yes")) {
                                                                if (b1.getCustomer(i).getAccount().withdraw(b1.getCustomer(i).getAccount().getBalance())){
                                                                    System.out.println("You have successfully withdrew all your funds, your account will now be closed");
                                                                    if (b1.deleteCustomer(i)) {
                                                                        System.out.println("Account successfully closed");
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("Your account will now be closed");
                                                                if (b1.deleteCustomer(i)) {
                                                                    System.out.println("Account successfully closed");
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            if (b1.deleteCustomer(i)) {
                                                                System.out.println("Account successfully closed");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Account does not exist");
                                        }
                                        break;
                                    case 2:
                                        for (int i = 0; i < b2.getNum0fCustomer(); i++) {
                                            if (b2.getCustomer(i).getFirstName().equals(capitalize(fn)) && b2.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.print("Enter your 4 digits pin: ");
                                                the_pin = sc.nextInt();
                                                int y = 2;
                                                while (y > 0 && b2.getCustomer(i).getAccount().getPin() != the_pin) {
                                                    y--;
                                                    System.out.print("The pin is incorrect, please reenter (" + (y+1) + " attempts remaining)");
                                                    the_pin = sc.nextInt();
                                                }
                                                if (y == 0) {
                                                    System.out.println("You entered the wrong pin 3 times");
                                                }
                                                if (b2.getCustomer(i).getAccount().getPin() == the_pin) {
                                                    String choice;
                                                    System.out.print("Are you sure you want to delete your account? (Yes/No): ");
                                                    choice = sc.next();
                                                    if (capitalize(choice).equals("Yes")) {
                                                        if (b2.getCustomer(i).getAccount().getBalance() != 0) {
                                                            System.out.println("Your balance is " + b2.getCustomer(i).getAccount().getBalance() + "$" + "\nWould you like to withdraw all? (Yes/No): ");
                                                            choice = sc.next();
                                                            if (capitalize(choice).equals("Yes")) {
                                                                if (b2.getCustomer(i).getAccount().withdraw(b2.getCustomer(i).getAccount().getBalance())){
                                                                    System.out.println("You have successfully withdrew all your funds, your account will now be closed");
                                                                    if (b2.deleteCustomer(i)) {
                                                                        System.out.println("Account successfully closed");
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("Your account will now be closed");
                                                                if (b2.deleteCustomer(i)) {
                                                                    System.out.println("Account successfully closed");
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            if (b2.deleteCustomer(i)) {
                                                                System.out.println("Account successfully closed");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Account does not exist");
                                        }
                                        break;
                                    case 3:
                                        for (int i = 0; i < b3.getNum0fCustomer(); i++) {
                                            if (b3.getCustomer(i).getFirstName().equals(capitalize(fn)) && b3.getCustomer(i).getLastName().equals(capitalize(ln))) {
                                                found = true;
                                                System.out.print("Enter your 4 digits pin: ");
                                                the_pin = sc.nextInt();
                                                int y = 2;
                                                while (y > 0 && b3.getCustomer(i).getAccount().getPin() != the_pin) {
                                                    y--;
                                                    System.out.print("The pin is incorrect, please reenter (" + (y+1) + " attempts remaining)");
                                                    the_pin = sc.nextInt();
                                                }
                                                if (y == 0) {
                                                    System.out.println("You entered the wrong pin 3 times");
                                                }
                                                if (b3.getCustomer(i).getAccount().getPin() == the_pin) {
                                                    String choice;
                                                    System.out.print("Are you sure you want to delete your account? (Yes/No): ");
                                                    choice = sc.next();
                                                    if (capitalize(choice).equals("Yes")) {
                                                        if (b3.getCustomer(i).getAccount().getBalance() != 0) {
                                                            System.out.println("Your balance is " + b3.getCustomer(i).getAccount().getBalance() + "$" + "\nWould you like to withdraw all? (Yes/No): ");
                                                            choice = sc.next();
                                                            if (capitalize(choice).equals("Yes")) {
                                                                if (b3.getCustomer(i).getAccount().withdraw(b3.getCustomer(i).getAccount().getBalance())){
                                                                    System.out.println("You have successfully withdrew all your funds, your account will now be closed");
                                                                    if (b3.deleteCustomer(i)) {
                                                                        System.out.println("Account successfully closed");
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("Your account will now be closed");
                                                                if (b3.deleteCustomer(i)) {
                                                                    System.out.println("Account successfully closed");
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            if (b3.deleteCustomer(i)) {
                                                                System.out.println("Account successfully closed");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Account does not exist");
                                        }
                                        break;
                                }
                        }
                    }
                    while (ch1 != 4);
                case 2:
                    System.out.println("Heeey");
                    break;
                case 3:
                    System.out.println("Hope you were satisfied, see you soon!");
                    break;
                default:
                    System.out.println("Unexpected value: " + ch);
            }
        }
        while (ch != 3);
    }
}
