package onkar.Core_Java_OOPS;

 
 //creating a class named City 
public class City {
	//declaring class variables 
	public String name;
	public long population;
	
	
	//defining the method of the class
	public void display() {
		System.out.println("Name of the City " + name);
		System.out.println("Population of the " + name + " " + population);
		
	}
	
	public static void main(String args[]) {
		//declaring the objects of the class City
		//Instantiating the objects of the class using the new
		City metro1 = new City();
		City metro2 = new City();
		
		metro1.name = "Mumbai";
		metro1.population = 105032000;
		
		metro2.name = "Pune";
		metro2.population = 91162165;
		
		metro1.display(); //display() method is being invoked for the object metro1
		metro2.display(); //display() method is being invoked for the object metro2
		
		
	}

}
