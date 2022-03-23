package OOPS1;
import java.util.Scanner;
public class TestDateClass {

	public static void main(String[] args) throws DateException {
		
		//creating the object of the Date Class.
		
		DateClass d1=new DateClass(1,9,2002);
		System.out.println(d1);
		
		System.out.println("day is "+d1.getDay());
		System.out.println("Month is "+d1.getMonth());
		System.out.println("year is "+d1.getYear());
		d1.setDay(20);
		System.out.println(d1.getDay());
	}

}
