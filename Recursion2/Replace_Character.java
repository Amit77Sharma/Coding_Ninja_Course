/*
 * Write a program to replace a original Character into the new chracter.....
 */
package Recursion2;
import java.util.Scanner;
public class Replace_Character {
	
	// recursive funcion for replacing the character------------------
	public static String Replace_Character(String s, char c1, char c2)
	{
		if(s.length()==0)
		{
			return s;
		}
		String newstring=Replace_Character(s.substring(1),c1,c2);
		if(s.charAt(0)==c1)
		{
			return c2+newstring;
		}
		else
		{
			return s.charAt(0)+newstring;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		System.out.println("Enter the character you wnats to replace with");
		char c1=sc.next().charAt(0);
		System.out.println("replace with ");
		char c2=sc.next().charAt(0);
		System.out.println(Replace_Character(s,c1,c2));

	}

}
