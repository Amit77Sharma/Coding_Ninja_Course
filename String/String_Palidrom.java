/*
 * Given a string determine if it is a palidrom considering only my alphabetic characters.
 */
package String;
import java.util.Scanner;
public class String_Palidrom {
	
	//function to identifaying that the given string is palidrom or not --------------------------------
	
	public static void string_palidrom(String str)
	{
		int len=str.length();
		String str1="";
		for(int i=len-1; i>=0; i--)
		{
			str1=str1+str.charAt(i);
		}
		
		if(str.equals(str1))
		{
			System.out.println("String is palidrom ");
		}
		else
		{
			System.out.println("String is not palidrom ");
		}
	}

	// mian function of this program -------------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		string_palidrom(str);

	}

}
