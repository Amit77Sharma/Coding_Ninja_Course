/*
 * Write a program that takes input from the user and print the of all number from 1 to N.
 */
package Recurssion1;
import java.util.Scanner;
public class Natural_Number {
	
	// recursive function for printing the number from 1 to n................................. 
	
	public static void print1toN(int n)
	{
		if(n==0)
		{
			return;
		}
		print1toN(n-1);
		System.out.print(n+" ");
	}
	
	//reverse recurssion of number...................................................
	
	public static void printNto1(int n)
	{
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		printNto1(n-1);
	}
	
	// main function of this program....................................................

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		print1toN(n);
		System.out.println();
		printNto1(n);
	}

}
