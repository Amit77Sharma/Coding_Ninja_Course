/*
 * Write a program in java to check wheather the string is palidrom or not.......
 */

package Basic_Programing;
import java.util.Scanner;
public class Palidrom_string {
	// Bybrute force in java 
	public static boolean checkPalidromString(String s) {
		boolean flage=false;
		int len=s.length();
		String ne="";
		for(int i=len-1; i>=0; i--)
		{
			ne=ne+s.charAt(i);
		}
		if(ne.equals(s))
		{
			flage=true;
		}
			
		return flage;
	}
	// By using string Builder in java......
	
	public static boolean ByStringBuilder(String s)
	{
		boolean flage=false;
		StringBuilder ns=new StringBuilder(s);
		String newstr=ns.reverse().toString();
		if(newstr.equals(s))
		{
			flage=true;
		}
		return flage;
	}
	
	// main method of java .............................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		System.out.println(checkPalidromString(s));
		System.out.println(ByStringBuilder(s));

	}

}
