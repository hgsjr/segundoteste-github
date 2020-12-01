package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        Account account;

        while (true) {

            System.out.print("Is there an initial deposit (y/n)? ");
            char answer = sc.next().toLowerCase().charAt(0);

            if (answer == 'y') {

                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                account = new Account(accountNumber, holder, initialDeposit);
                break;

            } else if (answer == 'n') {

                account = new Account(accountNumber, holder);
                break;

            } else {

                System.out.println("Wrong answer, please try again.\n");

            }

        }

        System.out.println("Account data:\n" + account + "\n");

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:\n" + account + "\n");

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:\n" + account + "\n");

    }

}
