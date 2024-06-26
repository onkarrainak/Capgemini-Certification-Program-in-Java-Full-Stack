package onkar.Core_Java_BasicJDBCExample;

import java.util.Scanner;

public class MenuDrivenJdbcProgram {
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/school";
    private static final String username = "root";
    private static final String password = "Onkar";

	Scanner scanner = new Scanner(System.in);
	int choice;

	do
	{
		System.out.println("\n*** Employee Management System ***");
		System.out.println("1. Add New Employee");
		System.out.println("2. Display All Employees");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
		choice = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		switch (choice) {
		case 1:
			addEmployee(scanner);
			break;
		case 2:
			displayAllEmployees();
			break;
		case 3:
			System.out.println("Exiting program. Goodbye!");
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
		}
	}while(choice!=3);

	scanner.close();
}

}
