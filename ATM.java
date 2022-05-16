//package Forum3;
//import java.util.Scanner;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class ATM {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<String> banks = new ArrayList<String>();;
//        Bank b1 = new Bank("BCA");
//        Bank b2 = new Bank("BNI");
//        Bank b3 = new Bank("MCB");
//        Bank b4 = new Bank("IMB");
//        Collections.addAll(banks, b1.getBankName(), b2.getBankName(), b3.getBankName(), b4.getBankName());
//
//        int ch;
//        do {
//            System.out.println("***ATM***");
//            System.out.println("1. Open an account \n2. Manage your account \n3. Delete your account \n4. Manager settings \n5.Exit");
//            System.out.println("Enter your choice: ");
//            ch = sc.nextInt();
//            String fn, ln;
//            System.out.print("Enter your first name: ");
//            fn = sc.next();
//            System.out.print(" \nEnter your first name: ");
//            ln = sc.next();
//            switch (ch) {
//                case 1:
//                    System.out.println("Choose your bank");
//                    for (int i = 0; i < banks.size(); i++) {
//                        System.out.println((i+1) + ": " + banks.get(i));
//                    }
//                    System.out.println("5: Exit");
//                    System.out.println("Enter your choice: ");
//                    int ch2;
//                    ch2 = sc.nextInt();
//                    switch (ch2){
//                        case 1:
//                            b1.addCustomer(fn, ln);
//                            break;
//                        case 2:
//                            b2.addCustomer(fn, ln);
//                            break;
//                        case 3:
//                            b3.addCustomer(fn, ln);
//                            break;
//                        case 4:
//                            b4.addCustomer(fn, ln);
//                            break;
//                        case 5:
//                            System.out.println("See you soon...");
//                            break;
//                    };
//                    break;
//                case 2:
//                    System.out.println("These are the banks supported by the ATM:");
//                    for (int i = 0; i < banks.size(); i++) {
//                        System.out.println((i+1) + ": " + banks.get(i));
//                    }
//                    System.out.println("5: Exit");
//                    System.out.println("Enter your choice: ");
//                    int ch3;
//                    ch3 = sc.nextInt();
//                    boolean found = false;
//                    switch (ch3){
//                        case 1:
//                            found = b1.getCustomers();
//                            break;
//                        case 2:
//                            b2.addCustomer("Arish", "Madataly");
//                            break;
//                        case 3:
//                            b3.addCustomer("Arish", "Madataly");
//                            break;
//                        case 4:
//                            b4.addCustomer("Arish", "Madataly");
//                            break;
//                        case 5:
//                            System.out.println("See you soon...");
//                            break;
//                    };
//                    System.out.print("Enter your name: ");
//                    String n = sc.next();
//                    boolean found = false;
//                    for (int i = 0; i < C.length; i++) {
//                        found = C[i].search(ac_no);
//                        if (found) {
//                            break;
//                        }
//                    }
//                    if (!found) {
//                        System.out.println("Search failed! Account doesn't exist..!!");
//                    }
//                    break;
//                case 3:
//                    System.out.print("Enter Account no. : ");
//                    ac_no = sc.next();
//                    found = false;
//                    for (int i = 0; i < C.length; i++) {
//                        found = C[i].search(ac_no);
//                        if (found) {
//                            C[i].deposit();
//                            break;
//                        }
//                    }
//                    if (!found) {
//                        System.out.println("Search failed! Account doesn't exist..!!");
//                    }
//                    break;
//                case 4:
//                    System.out.print("Enter Account No : ");
//                    ac_no = sc.next();
//                    found = false;
//                    for (int i = 0; i < C.length; i++) {
//                        found = C[i].search(ac_no);
//                        if (found) {
//                            C[i].withdrawal();
//                            break;
//                        }
//                    }
//                    if (!found) {
//                        System.out.println("Search failed! Account doesn't exist..!!");
//                    }
//                    break;
//                case 4:
//                    System.out.println("See you soon...");
//                    break;
//            }
//        }
//        while (ch != 5);
//    }
//}
