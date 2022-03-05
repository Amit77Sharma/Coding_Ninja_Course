
//Write a program through Recurssion that print the sum of all Natural number 

package Level1Recurssion;

import java.util.Scanner;

public class PrintSumOf_N_Number {
	
	//function for calculating the sum of N number ....
	public static int SumOfNumber(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+SumOfNumber(n-1);
	}

	//Main function.....................................
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int sum=SumOfNumber(n);
		System.out.println(sum);
		
	}

}
