/*
 * for a given input string(str). write a function to print all the positive substring..............
 */
package String;
import java.util.Scanner;
public class All_Substring {
	
	//function for finding all the substring---------------
	public static void possible_substring(String str)
	{
		int len=str.length();
		String str1="";
		for(int i=0; i<len; i++)
		{
			str1="";
			for(int j=i; j<len; j++)
			{
				str1=str1+str.charAt(j);
				System.out.println(str1);
			}
		}
	}
	
	//main function of this program---------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String ");
		String str=sc.next();
		System.out.println("All possible substring are ");
		possible_substring(str);
	}

}
