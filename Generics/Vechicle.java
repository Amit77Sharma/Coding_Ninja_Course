package Generics;

public class Vechicle {
	int max;
	int price;
	
	public Vechicle(int max,int price) {
		this.max=max;
		this.price=price;
	}
	
	public void print()
	{
		System.out.println(max+" "+price);
	}

}
