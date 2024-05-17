package onkar.Day7_Core_Java;

import java.util.Arrays;

//Java Program to demonstrate the use of StringBuffer class.  
public class BufferTest 
{
	public static void main(String[] args){  
		StringBuffer buffer=new StringBuffer("hello");  
		buffer.append(" Onkar");  
		System.out.println(buffer);  
		
		
		String s1 = "ONKAR RAINAK";
        char str1[] = new char[11];
        s1.getChars(0, 11, str1, 0);
        System.out.println("getChars method: " + Arrays.toString(str1));
        System.out.println(s1.toCharArray());
        
        
        
        
        String str2 = "";
        String str3 = "Om";
        System.out.println("Length:" + str2.length());
        System.out.println("is String is empty: " + str2.isEmpty());
        System.out.println("Length:" + str3.length());
        System.out.println("is String is blank: " + str3.isBlank());
	}

}