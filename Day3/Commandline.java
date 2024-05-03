public class Commandline
{  
public static void main(String args[])  
{  
    //String fname=args[0];
    //String lname=args[1];
    //String fullName=fname+"  "+lname;
    //System.out.println("Full name: " +fullName); 
int x = Integer.parseInt(args[0]);   //it convert string into integer
int y = Integer.parseInt(args[1]); 
int z = Integer.parseInt(args[2]);
int sum = x + y +z;  
System.out.println("The sum of x and y is: " +sum);  
}  
}