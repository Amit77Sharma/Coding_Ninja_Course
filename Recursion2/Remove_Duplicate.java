/*
 * Given an string s, remove Consecutive Duplicates from it recursively--------------
 */
package Recursion2;
import java.util.Scanner;
public class Remove_Duplicate {
	
	// function for removing duplicate
	
	public static String remove_duplicate(String s)
	{
		if(s.length()<=1)
		{
			return s;
		}
		if(s.charAt(0)==s.charAt(1))
		{
			return remove_duplicate(s.substring(1));
		}
		else
		{
			return s.charAt(0)+remove_duplicate(s.substring(1));
		}
	}

	// main function of this program ...............
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		String newstr=remove_duplicate(s);
		System.out.println(newstr);
	}
}
