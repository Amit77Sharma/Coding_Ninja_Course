package Inheritance;

public class Vechicle {
	
	//so here what is the use of Vechicle class as we can see that 
	// the property of car as well as bicycle has some same property so instead of writting the property again and 
	//again we can write onlce and inherit its property to the car and bicycle....
	
	private String name;// if we make the data private then it cann't be inherited by the child class also.
	int price;
	public int maxSpeed;
	
	public void print()
	{
		System.out.println("name "+ name +" "+" price "+ price);
	}
	public void setName(String name)// so here to access the property of name or to set the property of name 
	// we created indirect way to set the name to the vechicle ....
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

}
