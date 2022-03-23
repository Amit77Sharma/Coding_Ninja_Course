/*
 * Given an Integers N and return the number of Zeros that are present in the given using recurssion
 */
package Assignment_Recursion;
import java.util.Scanner;
public class Count_Zeros {
	
	//function for counting the number of zeros in the given number.................................
	
	static int count=0;
	public static int count_zeros(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int rem=n%10;
		if(rem==0)
		{
			count++;
		}
		count_zeros(n/10);
		return count;
	}

	// main code of this program.................................................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int num=count_zeros(n);
		System.out.println(num);
	}

}
