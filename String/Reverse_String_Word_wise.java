/*
 * Reverse the given string word wise that is the last word in given string should come at first place
 * second last word in the 2nd place and so on individual words should remain as it is.
 */
package String;
import java.util.Scanner;
public class Reverse_String_Word_wise {

	// function for reversing the string word wise-----------------------------
	public static void  word_wise(String str)
	{
		int len = str.length();
		String str1="";
		int start=0;
		int end=0;
		int i=0;
		for(; i<len; i++)
		{
			if(str.charAt(i)==' ')
			{
				end=i-1;
				for(int j=end; j>=start; j--)
				{
					System.out.print(str.charAt(j));
				}
			}
			start=end+1;
		}
		end=i-1;
		for(int k=end; k>=start; k--)
		{
			System.out.print(str.charAt(k));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		word_wise(str);
	}

}
