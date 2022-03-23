// Program to print all the fibonacci numbers from 0 to N.....
package Basic_Programing;
import java.util.Scanner;
public class Fibonacci_Number {
	
	// This is the fibonacci functon.........................
	
	public static void Fibonacci_series(int n)
	{
		int f1=0;
		int f2=1;
		System.out.print(f1+"\t");
		System.out.print(f2+"\t");
		for(int i=2; i<n; i++)
		{
			int f3=f1+f2;
			System.out.print(f3+"\t");
			f1=f2;
			f2=f3;
		}
	}
	// here this is the main program...................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numebr ");
		int n=sc.nextInt();
		Fibonacci_series(n);
	}

}
