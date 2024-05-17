package onkar.Core_Java_OOPS;

import java.util.Scanner;

public class Emp {

    int emp_id;
	String emp_name;
	double salary;
	String designation;
	
	
	public Emp(int emp_id, String emp_name,Double salary, String designation) 
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.designation = designation;
	}
	
	
	
	public void displayProduct()
	{
		System.out.println(" ----------------------- ");
		System.out.println(emp_id+ " " + emp_name+ " " + salary + " " +designation + " ");
		System.out.println(" ----------------------- ");
	}
	
	public static Emp[] createArrayofObject() 
	{
	
		Scanner s = new Scanner(System.in);
		
		Emp[] p= new Emp[2];
		
		int emp_id;
		String emp_name;
		double salary;
		String designation;
		
		for(int i=0;i<2;i++)
		{
			
		System.out.println("enter Employee id ");
		emp_id = s.nextInt();
		System.out.println("enter Employee Name ");
		emp_name = s.next();
		System.out.println("enter Employee salary ");
		salary = s.nextDouble();
		System.out.println("enter designation");
		designation = s.next();
				 
		 p[i] = new Emp(emp_id,emp_name,salary, designation);
		 
		 
		}
		
		return p;
	}
		
		
	public static void main(String[] args) 
	{
		
		
		Emp[] p =createArrayofObject();
		
		for(int i = 0;i<2;i++)
		{
			p[i].displayProduct();
		}
		
			
	}
    
}
