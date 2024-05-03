package onkar.Core_Java_OOPS;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("908812", 1000.0, "Onkar Rainak", "Onkar@.com", "1234567890");

        System.out.println("Account Details:");
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Customer Name: " + myAccount.getCustomerName());
        System.out.println("Email: " + myAccount.getEmail());
        System.out.println("Phone Number: " + myAccount.getPhoneNumber());
        System.out.println("Balance: " + myAccount.getBalance());

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(2000.0);
    }

	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit of " + amount + " made. New balance is " + balance);
		} else {
			System.out.println("Invalid amount for deposit.");
		}
	}

	public void withdraw(double amount) {
		if (balance >= amount && amount > 0) {
			balance -= amount;
			System.out.println("Withdrawal of " + amount + " processed. Remaining balance is " + balance);
		} else {
			System.out.println("Insufficient funds for withdrawal or invalid amount.");
		}
	}
}
