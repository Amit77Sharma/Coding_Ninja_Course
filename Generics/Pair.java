package Generics;

public class Pair<T> {

	private T rollno;
	private T price;
	
	
	public Pair(T rollno,T price)
	{
		this.rollno=rollno;
		this.price=price;
	}
	
	
	public T getFirst()//Indirect Access of the variable of rollno 
	{
		return rollno;
	}
	
	public void setFirst(T rollno)// Indirect way to set the vaule of the roolno
	{
		this.rollno=rollno;
	}
	
	public T getSecond()
	{
		return price;
	}
	
	public void setSecond()
	{
		this.price=price;
	}

}
