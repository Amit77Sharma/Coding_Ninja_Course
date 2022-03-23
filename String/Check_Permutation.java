/*
 * For a given two string str1 and str2 check whether they are permuattion of each other or not..
 * This type of question is also called Anagram................... 
 */
package String;
import java.util.*;
import java.lang.*;
public class Check_Permutation {
	
	// function for checking permuation of two string 
	
	public static void check_permuation(String str1,String str2)
	{
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2)
		{
			System.out.println("false");
		}
		else
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int i=0;
			while(i<len1)
			{
				if(ch1[i]!=ch2[i])
				{
					System.out.println("false");
				}
			}	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two string str1 and str2 ");
		String str1=sc.next();
		String str2=sc.next();
		check_permuation(str1,str2);
		

	}

}
