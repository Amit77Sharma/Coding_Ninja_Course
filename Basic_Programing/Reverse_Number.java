/*
 * write a program to generate the reverse of a number N.Print the corresponding result---

 */
package Basic_Programing;
import java.util.Scanner;
public class Reverse_Number {
	
	//function for reverseing the number.--------------------
	
	public static void reverseNumber(int n) {
		int reverse=0;
		while(n>0)
		{
			int k=n%10;
			reverse=reverse*10+k;
			n=n/10;
		}
		System.out.println(reverse);
	}
	
	//main function---------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		reverseNumber(n);
	}

}
