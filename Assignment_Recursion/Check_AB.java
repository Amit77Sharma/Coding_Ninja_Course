/*
 * Suppose you have a string S, made up of only a's and b's Write a recursive function
 * that check if the string was generated using the following rules 
 * 1. the String start with a's.
 * 2.Each a's is followed bt nothing or an a or bb.
 * 3.Each bb is followed by nothing or a.
 * if all rules are followed by th given string retun true otherwise return false.
 */
package Assignment_Recursion;
import java.util.Scanner;
public class Check_AB {
	
	// function for checking the ab.............................
	
	public static boolean check_ab(String s)
	{
		if(s.length()==0)
		{
			return true;
		}
		if(s.charAt(0)=='a')
		{
			if(s.substring(1).length()>1 && s.substring(1,3).equals("bb"))
			{
				return check_ab(s.substring(3));
			}
			else
			{
				return check_ab(s.substring(1));
			}
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next();
		boolean c=check_ab(s);
		System.out.println(c);

	}

}
