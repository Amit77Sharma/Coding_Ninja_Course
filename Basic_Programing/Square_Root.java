/*
 * program to find the square root of any integer value in java in brute force method ...
 * 
 */
package Basic_Programing;
import java.util.Scanner; 
import java.lang.Math;
public class Square_Root {
	
	/// BY using the inbuilt function in java........
	
	public static void squareroot(int number)
	{
		double n=Math.sqrt(number);
		System.out.println(n);
	}
	
	
	// By using the own function in java .....
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numebr ");
		int number = sc.nextInt();
		squareroot(number);
		

	}

}
