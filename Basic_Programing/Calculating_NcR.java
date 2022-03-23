/*
 * Program for claculating the cobinatorics of the given values in java.....
 */
package Basic_Programing;
import java.util.Scanner;
public class Calculating_NcR {
	
	// Function for calculating the factorial in java 
	public static double factorial(int n)
	{
		double fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	//main program of java-----------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number ");
		int n=sc.nextInt();
		int r=sc.nextInt();
		double ans=(factorial(n)/((factorial(r)*factorial(n-r))));
		System.out.println(ans);
	}

}
