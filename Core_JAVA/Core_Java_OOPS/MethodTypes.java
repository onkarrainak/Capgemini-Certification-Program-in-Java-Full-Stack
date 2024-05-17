package onkar.Core_Java_OOPS;

public class MethodTypes {
	    int add(int a,int b)
	    {
	        return a+b;
	        
	    }
	    void addition(int a,int b) {
	        System.out.println("Additing 2 numbers: "+(a+b));
	    }
	    static String display() {
	        return "Speak something in class";
	    }
	    float area(int r) {
	        return (float) (3.14*r*r);
	    }
	    public static void main(String[] args) {
	    	 MethodTypes methods = new MethodTypes();
	         
	         int sum = methods.add(5, 7);
	         System.out.println("Sum: " + sum);
	         
	         methods.addition(3, 4);
	         
	         String message = MethodTypes.display();
	         System.out.println("Display Message: " + message);
	         
	         float circleArea = methods.area(2);
	         System.out.println("Circle Area: " + circleArea);
	    }

}
