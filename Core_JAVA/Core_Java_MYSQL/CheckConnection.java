package onkar.Core_Java_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckConnection {
    public static void main(String[] args) throws  SQLException, ClassNotFoundException  {
        Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
        Statement stmt;
        String url = "jdbc:mysql://localhost:3306/company";
        Connection con = DriverManager.getConnection(url, "root", "Onkar");// establish connection
        //System.out.println(con);
        System.out.println("Database dbemp connection suceesfully establish");
        
        stmt=con.createStatement();//creating object for Statement
//        String s="insert into employee values(7,'Pooja',28,'pooja@gmail.com',40000,'Mumbai')";
//        String s="update employee set emp_email ='akash@gmail.com' where emp_id=6";
//        String s="delete from employee where emp_id = 5";
//        stmt.executeUpdate(s);
        System.out.println("Execute Query");
        ResultSet rs = stmt.executeQuery("select * from employee");
        System.out.println("Get employee records:");
        while (rs.next()) {
                System.out.println("Employee ID:"+rs.getInt(1));
                System.out.println("Employee name:"+rs.getString(2));
                System.out.println("Employee age:"+rs.getInt(3));
                System.out.println("Employee Email:"+rs.getString(4));
                System.out.println("Employee salary :"+rs.getString(5));
                System.out.println("Employee city :"+rs.getString(6));
                System.out.println();
        }
        rs.close();
    }
}