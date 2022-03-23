package OOPS1;
import java.util.Scanner;
public class TestRactangle {

	public static void main(String[] args) {
		//first creating the object of the ractangle class=====
		Scanner sc=new Scanner(System.in);
		Ractangle r=new Ractangle();
		System.out.print("default class value ");
		System.out.println(r.getArea());
		//calling the parameterise constructor ===============
		r=new Ractangle(20.0f,17.0f);
		System.out.println("Area of Ractangle is "+r.getArea());
		System.out.println("Ractangle class ");
		System.out.println("Parameter of rectangle is "+r.getParameter());
		System.out.println("width if rectangle is "+r.getWidth());
		System.out.println("length of rectangle is "+r.getLength());
		r.setLength(20.0f);
		System.out.println(r.getArea());

	}

}
