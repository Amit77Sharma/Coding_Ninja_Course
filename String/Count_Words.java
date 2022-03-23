/*
 * For a given input string (str). find and return the total no of words present in it.
 * it is assumed that two words will have only a single space between Also, there wouldn't
 * be any leading and trailing spaces in the given input string 
 */
package String;
import java.util.Scanner;
public class Count_Words {
	
	// function for counting the words in the string ................................................
	
	public static int count_words(String str)
	{
		int len=str.length();
		int count=0;
		if(len==0)
		{
			return 0;
		}
		for(int i=0; i<len; i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		
		return count+1;
	}

	// mian function of this program.......................................................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		//function for checking that the string has words 
		System.out.println(count_words(str));
	}

}
