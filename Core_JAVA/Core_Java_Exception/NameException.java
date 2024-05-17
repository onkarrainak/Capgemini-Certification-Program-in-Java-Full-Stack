package onkar.Core_Java_Exception;

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class NameException {
    public String checkName(String firstName, String lastName) throws MyException {
        if (firstName.isBlank()) {
            throw new MyException("First name cannot be blank.");
        } else if (lastName.isBlank()) {
        	throw new MyException("last name cannot be blank.");
		} {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NameException source = new NameException();

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        try {
            String fullName = source.checkName(firstName, lastName);
            System.out.println("Full Name: " + fullName);
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
