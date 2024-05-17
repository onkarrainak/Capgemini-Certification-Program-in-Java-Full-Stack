package onkar.Core_Java_Exception;

public class RunTypeException {
	 int a[]= {2,3,4};
     System.out.println("Length of my array: "+a.length);
     System.out.println("Array Element:"+a[2]);
     int c=20/5;
     System.out.println("Element C:"+c);    
     String s="123";
     int ss=Integer.parseInt(s);
     System.out.println("Value of ss: "+ss);
//     String s1="abc";
//     int sss=Integer.parseInt(s1);//abc can not convert into number
//     System.out.println("Value of ss: "+sss);
//     int a1[] = null; 
//     System.out.println("The length of the array arr is: " + a1.length);
     String st1="   ";
     System.out.println("The length of the array arr is: " + st1.length());
//     String st2=null;
//     System.out.println("The length of the array arr is: " + st2.length());
     int[] array = new int[-5];
     System.out.println("Array length: " + array.length);
 }
 catch(ArrayIndexOutOfBoundsException e) {
     System.out.println(e);
 }
 catch(ArithmeticException e1) {
     System.out.println(e1);
 }


}
