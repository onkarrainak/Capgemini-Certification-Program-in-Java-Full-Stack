package onkar.Core_Java_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuDrivenJDBC {

	private static final String URL = "jdbc:mysql://localhost:3306/school";
	private static final String USER = "root";
	private static final String PASSWORD = "Onkar";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Search");
			System.out.println("5. Count");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				insertRecord(scanner);
				break;
			case 2:
				deleteRecord(scanner);
				break;
			case 3:
				updateRecord(scanner);
				break;
			case 4:
				searchRecord(scanner);
				break;
			case 5:
				countRecords(scanner);
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 6);

		scanner.close();
	}

	private static void insertRecord(Scanner scanner) {
		System.out.print("Enter rollno: ");
		int rollno = scanner.nextInt();
		System.out.print("Enter name: ");
		String name = scanner.next();
		System.out.println("Workplace:");
		String Workplace = scanner.next();

		String sql = "INSERT INTO student (rollno ,name, Workplace) VALUES (?, ? ,?)";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, rollno);
			pstmt.setString(2, name);
			pstmt.setString(3, Workplace);
			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new record was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void deleteRecord(Scanner scanner) {
		System.out.print("Enter student rollno to delete: ");
		int rollno = scanner.nextInt();

		String sql = "DELETE FROM student WHERE rollno = ?";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, rollno);
			int rowsDeleted = pstmt.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A record was deleted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateRecord(Scanner scanner) {
		System.out.print("Enter student ID to update: ");
		int rollno = scanner.nextInt();
		scanner.nextLine(); // Consume newline
//		System.out.print("Enter new name: ");
//		String newName = scanner.nextLine();
		System.out.print("Enter new Workplace: ");
		String Workplace = scanner.next();

		String sql = "UPDATE student SET Workplace = ? WHERE rollno = ?";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, rollno);
//			pstmt.setString(2, newName);
			pstmt.setString(2, Workplace);
			int rowsUpdated = pstmt.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("A record was updated successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void searchRecord(Scanner scanner) {
		System.out.print("Enter student rollno to search: ");
		int rollno = scanner.nextInt();

		String sql = "SELECT * FROM student WHERE rollno = ?";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, rollno);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println();
				System.out.println("student rollno: " + rs.getInt("rollno"));
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Workplace: " + rs.getString("Workplace"));
				System.out.println();
			} else {
				System.out.println("No record found with rollno: " + rollno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void  countRecords(Scanner scanner) {
		String sql = "SELECT COUNT(*) AS total FROM student";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int count = rs.getInt("total");
				System.out.println("Total number of records: " + count);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
