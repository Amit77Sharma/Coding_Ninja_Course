/*
 * program to find the factorial of any number ------------
 */
package Basic_Programing;
import java.util.Scanner;
public class Factorial {
	
	public static void factorial(int n)
	{
		int fact=1;
		for(int i=n; i>0; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	//--------using recursive function in java-----------
//	public static int factorialrev(int n)
//	{
//		int i=1;
//		int fact=1;
//		while(i<=n)
//		{
//			fact=fact*factorailrev(i);
//		}
//		return fact;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is amit";
		String a="hellow";
		s=a;
		System.out.println(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer ");
		int n=sc.nextInt();
		factorial(n);
//		System.out.println(factorialrev(n));

	}

}
