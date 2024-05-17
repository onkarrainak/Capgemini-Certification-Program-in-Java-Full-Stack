package onkar.Core_Java_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) throws NumberFormatException, IOException {
	        //Scanner sc=new Scanner(System.in);
	        InputStreamReader isr=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(isr);
	        System.out.println("Enter value of a: ");
	        int a=Integer.parseInt(br.readLine());
	        System.out.println("Value of a: "+a);
	        System.out.println("Enter Name: ");
	        String nm=br.readLine();
	        System.out.println("Name: "+nm);
	        System.out.println("Enter long: ");
	        long num = Long.parseLong(br.readLine());
	        System.out.println("Long: "+num);
	        System.out.println("Enter double: ");
	        double num2 = Double.parseDouble(br.readLine());
	        System.out.println("Double: "+num2);
	        System.out.println("Enter float: ");
	        float num3 = Float.parseFloat(br.readLine());
	        System.out.println("Float: "+num3);
	}

}
