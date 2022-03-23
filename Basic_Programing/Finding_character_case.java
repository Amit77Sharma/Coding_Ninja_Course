/* 
Write a program that takes a character as input and print either 1 ,0 or -1 according to the
following rules 
1, if character is an upper case (A-Z)
0, if character is an lower case(a-z)
-1, if character is not the alphabet
*/
package Basic_Programing;
import java.util.Scanner;
public class Finding_character_case {
	
	// function to check character ----------------
	
	public static void checkcharacter(char c)
	{
		if(c>='A'&& c<='Z')
		{
			System.out.println("1");
		}else if(c>='a' && c<='z') {
			System.out.println("0");
		}else {
			System.out.println("-1");
		}
	}
	// Main program in java--------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charcater");
		char c=sc.next().charAt(0);
		checkcharacter(c);
	}

}
