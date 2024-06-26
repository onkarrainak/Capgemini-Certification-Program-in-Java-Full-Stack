package onkar.Core_Java_BasicJDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Employee {
	private int id;
	private String name;
	private String position;

	public Employee(int id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	// toString method to print employee details
	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", position='" + position + '\'' + '}';
	}

	private static void displayAllEmployees() {
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			Statement statement = connection.createStatement();

			String selectQuery = "SELECT id, name, position FROM employees";
			ResultSet resultSet = statement.executeQuery(selectQuery);

			System.out.println("\nEmployee Details:");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String position = resultSet.getString("position");

				System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
			}

			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}