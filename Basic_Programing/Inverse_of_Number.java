/*
 * Write a program for the inverse of the number......................
 */
package Basic_Programing;
//import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Inverse_of_Number {
	
	// function for inversing the number in java-----
	public static int inverseNumber(int n) {
		int count=0;
		int ne=n;
		while(ne>0)
		{
			ne=ne/10;
			count++;
		}
		int i=1;
		int reverse=0;
		while(count>0)
		{
			int rem=n%10;
			n=n/10;
			int obtained=(int)Math.pow(10,rem-1);
			reverse=i*obtained+reverse;
			i++;
			count--;
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int reverse=inverseNumber(n);
		System.out.println(reverse);
		

	}

}
