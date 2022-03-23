/*
 * Write a program to count the number of digit contains in the number....
 */
package Recurssion1;
import java.util.Scanner;
public class Count_digit {
	
	// recurssive function for calculating the digits in the number....
	
	public static int count_digit(int n)
	{
		int count=1;
		if(n==0)
		{
			return 0;
		}
		int smaller=count+count_digit(n/10);
		return smaller;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(count_digit(n));

	}

}
