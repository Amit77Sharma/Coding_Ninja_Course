package OOPS1;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		//Creating the object of the Circle 
		Circle c=new Circle();
		//lets check the method that its working or not ===
		
		//lets take the value from the user.....
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious of the circle ");
		double radius=sc.nextDouble();
		c=new Circle(radius);
		
		//lets get the value of the Area=========
		System.out.println(c.getArea());
		System.out.println(c.getColor());
		
		//through this function we can change the color of the circle.....
		c.setColor("blue");
		System.out.println(c.getColor());
		

	}

}
