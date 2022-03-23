package Abstractkeyword;

public abstract class Car extends Vechicle {
	
	public void printcar()
	{
		System.out.println("this is the car class called function");
	}
	public boolean isMotarised()
	{
		return true;
	}
	
	//lets create another abstract class to get the name of the company 
	public abstract String getCompany();
	
}
