/*
 * For a given string str find and return the highest occuring character
 */
package String;
import java.util.Scanner;
public class Highest_Occuring_Character {
	
	//function for finding the highest occuring character...........................................
	
	public static void highest_occuring(String str)
	{
		int[] ascii=new int[256];
		int len=str.length();
		for(int i=0; i<len; i++)
		{
			ascii[str.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		for(int j=0; j<len; j++)
		{
			if(max<ascii[str.charAt(j)])
			{
				max=ascii[str.charAt(j)];
				result=str.charAt(j);
			}
		}
		System.out.println(result);
	}

	// main function of this program ----------------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.next();
		highest_occuring(str);
	}

}
