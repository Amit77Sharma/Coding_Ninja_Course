/*
 * write a program to input an integer N and print the sum of all its given digit and sum of all odd
 * and even digit separatly
 */
package Basic_Programing;
import java.util.Scanner;
public class Sum_of_Even_odd {
	
	//function odd even------------
	
	public static void Odd_Even_Sum(int n) {
		int evenSum=0;
		int oddSum=0;
		while(n!=0)
		{
			int k=n%10;
			if(k%2==0) {
				evenSum=evenSum+k;
			}else {
				oddSum=oddSum+k;
			}
			n=n/10;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}

	// main function----------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		Odd_Even_Sum(n);
		
	}

}
