/*
 * Write a program to find the sum of N natural number through recurssion
 */
package Recurssion1;
import java.util.Scanner;
public class Sum {
	
	//recursive function for calculating the sum of N number 
	
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int smallerout=sum(n-1);
		int out=n+smallerout;
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you wants to find the sum");
		int n=sc.nextInt();
		System.out.println(n);
		int ne=sum(n);
		System.out.println(ne);

	}

}
