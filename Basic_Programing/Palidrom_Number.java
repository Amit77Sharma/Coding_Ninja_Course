/*
 * program for checking that the number is palidrom or not in brute force methods  
 */
package Basic_Programing;
import java.util.Scanner;
public class Palidrom_Number {
	
	// methods by brute force...................
	public static boolean Check_Palidrom(int n)
	{
		boolean flage=false;
		int real=n;
		//int count=0;
		int rem=0;
		while(n>0)
		{
			int num=n%10;
			rem=num+(rem*10);
			n=n/10;
		}
		if(real==rem)
		{
			flage=true;
		}
		return flage;
	}
	
	// BY using the StringBuilder in java to check Palidrom number ....
	//public static boolean ByStringBuilder(String n)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numebr ");
		int n=sc.nextInt();
		System.out.println(Check_Palidrom(n));

	}

}
