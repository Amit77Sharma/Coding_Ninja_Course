/*
 * A child is running up a stair case with N steps and can jump either 1 atep, or 2 step
 * or 3 step at a time implement a method to convert how may possible ways child acn run up to the stair 
 * you need to return the o of possible ways to.
 */
package Assignment_Recursion;
import java.util.Scanner;
public class Stair_Case {
	
	// function to find the no of possible ways
	
	public static int stair_case(int n)
	{
		if(n<0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
		return stair_case(n-1)+stair_case(n-2)+stair_case(n-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of stairs");
		int n = sc.nextInt();
		int num=stair_case(n);
		System.out.println(num);
		

	}

}
