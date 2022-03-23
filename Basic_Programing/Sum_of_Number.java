/* Program you are given a single non negative integer N you need to find out the sum of all 
number lies between 1 to N both are inclusive*/
package Basic_Programing;
import java.util.Scanner;
public class Sum_of_Number {

	// brute force method to find the sum of N number .........
	
	public static void SumOfNumber(int n) {
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	//usiing mathematical formula to find the sum of N number 
	
	public static void mathematicform(int n)
	{
		int sum=(n*(n+1))/2;
		System.out.println(sum);
	}
	
// Main methods 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		SumOfNumber(n);
		mathematicform(n);

	}

}
