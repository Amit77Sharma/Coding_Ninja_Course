/*
 * You are given an string and you have to reverse the string.
 */
package String;
import java.util.Scanner;
public class Reverse_String {
	
	//function for reversing the string -------------------------------------------------
	public static void reverse_str(String str)
	{
		int len=str.length();
		System.out.println("Reverse string is ");
		for(int i=len-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	// main function of java---------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		reverse_str(str);

	}

}
