/*
 * Write a program to print all the factors of a number other than ! and the number itself 
 */
package Basic_Programing;
import java.util.Scanner;
public class Factors {
	//function for finding the factores ------------
	
	public static void findfactors(int n) {
		int i=2; 
		while(i<n)
		{
			if(n%i==0) {
				System.out.print(i+"\t");
			}
			i++;
		}
	}
	
	// main function ---------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		findfactors(n);

	}

}
