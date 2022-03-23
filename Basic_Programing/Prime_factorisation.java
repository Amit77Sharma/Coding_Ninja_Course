/*
 * Program to find the prime factorisation of the given number----------------
 */
package Basic_Programing;
import java.util.Scanner;
public class Prime_factorisation {
	//prime factorisation function in java--------------
	public static void primefactorisation(int n) {
		
		for(int i=2; i*i<=n; i++)
		{
			while(n%i==0)
			{
				n=n/i;
				System.out.print(i+" ");
			}
		}
		if(n!=1)
		{
			System.out.print(n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		primefactorisation(n);
	}

}
