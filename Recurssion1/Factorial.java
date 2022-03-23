/*
 * Write a proram to find the factorial of the given number with recurssion...
 */
package Recurssion1;
import java.util.Scanner;
public class Factorial {
	
	// recursssive function for finding the factorial of the number;;;
	
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int smallerout=fact(n-1);
		int f=n*smallerout;
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you wants the factorial");
		int n=sc.nextInt();
		System.out.println(fact(n));
	}

}
