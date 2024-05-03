class MyFirstProgram1
{
	static void display()
	{
		System.out.println("Onkar Rainak"); //method body
	}

	String name(String n)
	{
		return "good morning " + n;
	}

	int sum(int a,int b)
	{
    		return a+b;
	}
	
	public static void main(String args[])
	{
		display();
		
		MyFirstProgram1 na = new MyFirstProgram1();
		System.out.println(na.name("onkar"));
		System.out.println("Addition :"+na.sum(20,50));
		
	}	
	
	


	
}