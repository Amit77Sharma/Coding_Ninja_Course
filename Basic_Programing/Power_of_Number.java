/*
 * Write a program to find the power X to the power N. Take X and N from the user
 */

package Basic_Programing;
import java.util.Scanner;
public class Power_of_Number {
	// function for calculating the power-------------
	
	public static void power(int x, int p) {
		int n=1;
		int i=1;
		while(i<=p)
		{
			n=n*x;
			i++;
		}
		System.out.println(n);
	}
	
	// main function----------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		System.out.println("Enter the power ");
		int p=sc.nextInt();
		power(x,p);
	}

}
