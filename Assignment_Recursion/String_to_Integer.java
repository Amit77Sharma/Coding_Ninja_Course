/*
 * write a recurssive function to convert a given string into the numbers it represent 
 * that is input will be a nummeric string that contains only numbers you need to convert
 * the string into corresponding integer and return the answere 
 */
package Assignment_Recursion;
import java.util.Scanner;
public class String_to_Integer {

	//function for converting the string into the integers------
	public static int string_to_integer(String s)
	{
		int n=Integer.parseInt(s);
		return n;
	}
	
	// main function i=of this code 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you wnats to convert it into integers");
		String s=sc.next();
		int number=string_to_integer(s);
		System.out.println(number);
	}

}
