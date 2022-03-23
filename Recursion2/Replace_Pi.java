/*
 * Given a string and you have to remove the chacra ter if we get pi and replace it with 3.14
 * 
 */
package Recursion2;
import java.util.Scanner;
public class Replace_Pi {
	
	//function for replacing the value Pi in the given string--------------
	
	public static String replace_pi(String s)
	{
		if(s.length()<=1)
		{
			return s;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i')
		{
			return "3.14"+replace_pi(s.substring(2));
		}
		else
		{
			return s.charAt(0)+replace_pi(s.substring(1));
		}
	}

	
	// main function ------------------------------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next();
		String newstr=replace_pi(s);
		System.out.println(newstr);
	}

}
