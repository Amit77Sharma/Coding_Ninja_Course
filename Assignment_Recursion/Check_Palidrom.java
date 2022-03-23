/*
 * Check whether a given String S is a Palidrom using recurssion 
 * return true or false.....
 */
package Assignment_Recursion;
import java.util.Scanner;
public class Check_Palidrom {
	
	//recursive function for checking the string palidrom....
	public static boolean check_palidrom(String s, int start, int end)
	{
		if(start==end)
		{
			return true;
		}
		if(s.length()<=1)
		{
			return true;
		}
		if(s.charAt(start)==s.charAt(end))
		{
			return check_palidrom(s,start+1,end-1);
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		boolean ne=check_palidrom(s,0,s.length()-1);
		System.out.println(ne);

	}

}
