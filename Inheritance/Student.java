package Inheritance;

public class Student extends Person{
	
	int rollno;
	int std;
	public Student(String name,int phoneno, int age,String house,int rollno)
	{
		System.out.println(" Name "+ name);
		System.out.println("Phone "+ phoneno);
		System.out.println("age "+ age);
		System.out.println("house "+ house);
		System.out.println("rollno "+ rollno);
	}
	
	public void print()
	{
		System.out.println(" Name "+ name);
		System.out.println("Phone "+ phoneno);
		System.out.println("age "+ age);
		System.out.println("house "+ house);
		System.out.println("rollno "+ rollno);
	}
}
