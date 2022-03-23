//Program to print all the prime numbers between 2 to N
package Basic_Programing;
import java.util.Scanner;
import java.lang.Math;
public class All_Prime_Number {
	// Here we are checking that the number is prime or not function 
	public static boolean print_All_Prime(int num)
	{
		boolean prime=true;
		int k=(int)Math.sqrt(num);
		for(int j=2; j<=k; j++)
		{
			if(num%j==0)
			{
				prime=false;
			}	
		}
		return prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number ");
		int n=sc.nextInt();
		// here we are giving each value form 2 to N.....
		for(int i=2; i<=n; i++)
		{
			if(print_All_Prime(i)) //if function is true means prime then it will print that value .... 
			{
				System.out.println(i);
			}
		}

	}

}
