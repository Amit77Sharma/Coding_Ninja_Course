/*
 * write a program that calculate or print the fibonacci number 
 */
package Recurssion1;
import java.util.Scanner;
public class Fibonacci {
	
	//recurssive function for calculating the nth fibonacii number---------------------------------------
	
	public static int fibo(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		int first=fibo(n-1);
		int second=fibo(n-2);
		int out=first+second;
		//System.out.println(out);
		return out;
		
	}
	
	//main function fo this program ----------------------------------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(fibo(n));

	}

}
