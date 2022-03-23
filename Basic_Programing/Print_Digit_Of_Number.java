/*
 * We are given anumber and we have to print the digit of the number from left to right.
 */
package Basic_Programing;
import java.util.*;
import java.lang.*;
public class Print_Digit_Of_Number {

	// function for printing the digits of the number..................................... 
	
	public static void print_digits(int n)
	{
		int nw=n;
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			count++;
			System.out.print(rem);
			n=n/10;
		}
		System.out.println();
		// printing the values form left to right;.....................
		while(count>=1)
		{
			int rem=nw/(int)Math.pow(10,count-1);
			System.out.print(rem);
			nw=nw%(int)Math.pow(10,count-1);
			count--;
		}
	}
	
	// main methods of java.................................................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		print_digits(n);

	}

}
