/*
 * Given a string, compute recursive a new String where all X chars has been removed-----------
 */
package Recursion2;
import java.util.Scanner;
public class Remove_Character {
	
	// function for removing the charcacter----------------------------------------
	
	public static String Remove_character(String s,char c1)
	{
		if(s.length()==0)
		{
			return s;
		}
		String newstring=Remove_character(s.substring(1),c1);
		if(s.charAt(0)==c1)
		{
			return ""+newstring;
		}
		else
		{
			return s.charAt(0)+newstring;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next();
		System.out.println("Enter the chasrcater you wnats to remove ");
		char c1=sc.next().charAt(0);
		System.out.println(Remove_character(s,c1));

	}

}
