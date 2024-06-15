package com.hibernatejpacrud;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	 private static final JpaCrud jpaCrud = new JpaCrud();
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Find Product by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                	insertRecord(scanner);
                    break;
                case 2:
                    viewAllUsers();
                    break;
                case 3:
                    updateUser(scanner);
                    break;
                case 4:
                    deleteUser(scanner);
                    break;
                case 5:
                	findRecordById(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

	
	private static void insertRecord(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        String price = scanner.nextLine();
        Products product = new Products(name,price);
        jpaCrud.insertRecord(product);
        System.out.println("User created successfully.");
    }

    private static void viewAllUsers() {
        List<Products> product = jpaCrud.fetchAllRecords();
    }
    
    private static void deleteUser(Scanner scanner) {
    	System.out.print("Enter product ID to delete: ");
        int id = scanner.nextInt();
    	jpaCrud.deleteRecordById(id);
	}

	private static void updateUser(Scanner scanner) {
		System.out.print("Enter product ID to update: ");
		jpaCrud.updateRecordById(14,"IPhone 13 plus","65000");
        int id = scanner.nextInt();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter new price: ");
        String price = scanner.next();
		jpaCrud.updateRecordById(id,name,price);
		
	}
	
	private static void findRecordById(Scanner scanner) {
		System.out.print("Enter product ID to find: ");
        int id = scanner.nextInt();
		jpaCrud.findRecordById(id);
		
	}

}



//public static void main( String[] args )
//{
//    System.out.println( "Hello World!" );
////    Products p1 = new Products("IPhone 15 plus", "89000");
////    JpaCrud jpacrud1 = new JpaCrud();
////    jpacrud1.insertRecord(p1);
////    
////    Products p2 = new Products("IPhone 15 pro", "129000");
////    JpaCrud jpacrud2 = new JpaCrud();
////    jpacrud2.insertRecord(p2);
////    
////    Products p = new Products("IPhone 15", "79000");
////    JpaCrud jpacrud = new JpaCrud();
////    jpacrud.insertRecord(p);
//    
//    JpaCrud jpacCrud = new JpaCrud();
////    jpacCrud.deleteRecordById(8);
////    jpacCrud.findRecordById(2);
//    jpacCrud.updateRecordById(5,"IPhone 13 plus","55000");
//    
//    JpaCrud allProduct = new JpaCrud();
//    allProduct.fetchAllRecords();
//    
//}