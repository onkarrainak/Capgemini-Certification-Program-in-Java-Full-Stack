package onkar.Core_Java_Threadprogramming;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

public class BankExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank!");
        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        System.out.println("Enter 'd' for deposit or 'w' for withdrawal: ");
        char transactionType = scanner.next().charAt(0);
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        if (transactionType == 'd') {
            Thread t1 = new Thread(() -> account.deposit(amount));
            t1.start();
        } else if (transactionType == 'w') {
            Thread t2 = new Thread(() -> account.withdraw(amount));
            t2.start();
        } else {
            System.out.println("Invalid transaction type.");
        }

        scanner.close();
    }
}
