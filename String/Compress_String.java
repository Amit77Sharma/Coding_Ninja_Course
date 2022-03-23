/*
 * Write a program to do basic string compression for a chracter which consecultively repeated more than once
 * replace consecutive duplicate occuring with the count of repetation
 */
package String;
import java.util.Scanner;
public class Compress_String {
	
	//function for compressing the string........................
	
	public static void compress_string(String str)
	{
		int len = str.length();
		String st="";
		int count=1;
		int i=0;
		for(; i<len-1; i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}else
			{
				if(count>1)
				{
					st=st+str.charAt(i)+count;
					count=1;
				}
				
			}
		}
		while(i<len)
		{
			st=st+str.charAt(i);
			i++;
		}
		System.out.println(st);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stirng ");
		String str=sc.next();
		compress_string(str);
	}

}
