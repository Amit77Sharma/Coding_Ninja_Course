package Inheritance;

public class Car extends Vechicle{
	
	//let say's car has its property like...
//	String name;
//	int price;			// so insted of writting the code again and again we have created the 
//	int maxSpeed;		// vechile class to use it code....
	private int noDoors; // her car have its own property .....
	
	
	// to use the property of vechile we have to inherit the vechicle clas into the car class by extends keyword 
	// her oncle we inherit the class we can use its property simply...
	public int getValue()
	{
		return noDoors;
	}
	
	public void setNoDoor(int noDoors)
	{
		this.noDoors=noDoors;
	}
//	public void printCar()
//	{
//		System.out.println("name "+ getName() +" "+" price "+ price + "noDoors" + noDoors);
//	}
	
	//lets see what happen when we create the print method in car as we know that there is alreay exist the print 
	// method which is in vechile we are overridding the property lets see what happen 
	
	public void print()// if we call this print function into the main class whats will happen
	{
		super.print();// as we have seen that when ever we are calling the print() it willexecute the car class
		// print() when when we have to use the vechhicle class print() function we have to use the super keyword 
		// to access that....
		System.out.println("name "+ getName() +" "+" price "+ price +" Speed "+ maxSpeed + " noDoors " + getValue());
	}
}
