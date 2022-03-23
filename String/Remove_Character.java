/*
 * For a given string str and a character x write a function to remove all the occurence of X from the string.
 */
package String;
import java.util.Scanner;
public class Remove_Character {
	
	//function for removing the occurence of chacracter.........
	
	public static void remove_character(String str,char c)
	{
		int len = str.length();
		String st="";
		for(int i=0; i<len; i++)
		{
			if(str.charAt(i)!=c)
			{
				st=st+str.charAt(i);	
			}
		}
		System.out.println(st);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		System.out.println("Enter the character you wnats to remove");
		char c=sc.next().charAt(0);
		remove_character(str,c);
		

	}

}
