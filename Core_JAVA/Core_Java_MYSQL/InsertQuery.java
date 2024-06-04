package onkar.Core_Java_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertQuery {
	public static void main(String[] args) throws  SQLException, ClassNotFoundException  {
        Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
        Statement stmt;
        String url = "jdbc:mysql://localhost:3306/school";
        Connection con = DriverManager.getConnection(url, "root", "Onkar");// establish connection
        //System.out.println(con);
        System.out.println("Database dbemp connection suceesfully establish");
        Scanner sc = new Scanner(System.in);
        
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
        System.out.println("Enter Student data");
        System.out.println("Id");
        int id = sc.nextInt();
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Workplace");
        String Workplace = sc.next();
        
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, Workplace);
        ps.executeUpdate();
        System.out.println("Recored inserted");
	}

}
