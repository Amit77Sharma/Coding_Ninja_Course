
//Now the question here is we wants to know which car is motarised or non motarised 
package Abstractkeyword;

public abstract class Vechicle {
	
	String name;
	String Color;
	int price;
	int maxSpeed;
	
	
	public void print()
	{
		System.out.println("Color "+ Color + "Price "+ price + "maxSpeed "+ maxSpeed);
	}
	
	public abstract boolean isMotarised();
	public abstract String getCompany();

}
