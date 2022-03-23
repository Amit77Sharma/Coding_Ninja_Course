/*
 * Write a program for calculating the power of any number using recurssion;
 */
package Recurssion1;
import java.util.Scanner;
public class Power {
	
	// reecursive function for calculating the power of any number.....
	
	public static int power(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		int out=x*power(x,n-1);
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number and its exponence to calculate the power");
		int x=sc.nextInt();
		int n=sc.nextInt();
		int ne=power(x,n);
		System.out.println(ne);

	}

}
