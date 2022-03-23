/*
 * Calulating the permuation in java of given number
 * 
 */
package Basic_Programing;
import java.util.Scanner;
public class Calculating_NpR {
	
	// Calculating the factorial of the given number--......................
	
	public static double factorial(int n)
	{
		double fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	// main function ....................................

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int r=sc.nextInt();
		double ans=(factorial(n)/factorial(n-r));
		System.out.println(ans);

	}

}
