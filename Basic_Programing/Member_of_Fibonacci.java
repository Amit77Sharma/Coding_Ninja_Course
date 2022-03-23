/*you are given a single non negative Integer N. you need to find out 
whether N is a part of fibonacci sequenec or not*/

package Basic_Programing;
import java.util.Scanner;
public class Member_of_Fibonacci {
	public static boolean Member_Fibonacci(int n)
	{
		boolean present=false;
		int f1=0;
		int f2=1;
		if(n==f1) {
			present=true;
		}
		if(n==f2) {
			present=true;
		}
		for(int i=2; i<n; i++)
		{
			int f3=f1+f2;
			if(f3==n)
			{
				present=true;
			}
			f1=f2;
			f2=f3;
		}
		return present;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numebr ");
		int n=sc.nextInt();
		if(Member_Fibonacci(n)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
