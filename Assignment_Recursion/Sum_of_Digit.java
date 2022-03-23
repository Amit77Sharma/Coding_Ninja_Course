/*
 * Write a recursive function that return the sum of digits of a given integer;;;
 */
package Assignment_Recursion;
import java.util.Scanner;
public class Sum_of_Digit {
	
	//recursive function for finding the sum of digit;
	
	public static int sumofdigit(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int ne=n%10;
		int sum=ne+sumofdigit(n/10);
		return sum;
	}

	//Main function of this Program------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int sum=sumofdigit(n);
		System.out.println(sum);

	}

}
