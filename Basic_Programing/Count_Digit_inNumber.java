/*
 * We are given a number and you have to count the number of digits conatined in that number....
 */
package Basic_Programing;
import java.util.Scanner;
public class Count_Digit_inNumber {
	
	// Function to count the Digit in number ..
	public static int countDigit(int n)
	{
		int rem=0;
		while(n>0)
		{
			rem++;
			n=n/10;
		}
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(countDigit(n));

	}

}
