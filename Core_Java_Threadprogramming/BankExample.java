package onkar.Core_Java_Threadprogramming;

import java.util.Random;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            throw new InsufficientFundsException(Thread.currentThread().getName() + " tried to withdraw but Insufficient funds.");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Create multiple threads for deposit and withdrawal
        Thread[] threads = new Thread[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                try {
                    // Randomly decide whether to deposit or withdraw
                    if (random.nextBoolean()) {
                        account.deposit(random.nextDouble() * 100);
                    } else {
                        account.withdraw(random.nextDouble() * 100);
                    }
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
            });
            threads[i].start();
        }
    }
}
