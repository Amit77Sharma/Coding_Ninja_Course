/*
 * For a given String str remove all the consecutive duplicate characters ........
 */
package String;
import java.util.Scanner;
public class Remove_Consecutive_Elements {
	
	// function for removing the consecutive elements;;;................................
	
	public static void remove_consecutive(String str)
	{
		int len = str.length();
		if(len==0)
		{
			System.out.println("no string");
		}
		String st="";
		int i=0;
		for(; i<len-1; i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				st=st+str.charAt(i);
			}
		}
		while(i<len)
		{
			st=st+str.charAt(i);
			i++;
		}
		System.out.println(st);
	}

	//main function of this program,.............................................................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String  str=sc.next();
		remove_consecutive(str);
	}

}
