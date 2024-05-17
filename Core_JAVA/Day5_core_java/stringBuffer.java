package onkar.Day5_core_java;

public class stringBuffer {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Onkar Rainak");
		System.out.println("capacity "+sb.capacity());
		System.out.println("length "+sb.length());
		System.out.println(sb.append(" @Kolhapur"));
		System.out.println(sb.insert(6, " Prakash "));
		System.out.println(sb.replace(23, 31, "India"));
		System.out.println("reverse "+sb.reverse());
		
		
	}

}
