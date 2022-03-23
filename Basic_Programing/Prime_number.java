//Program to check wheather the numbe ris prime or not-----
// we will do this program by two methods ---
package Basic_Programing;
import java.util.Scanner;
public class Prime_number {
	//First method-----------------------------------------------
	public static boolean isprime1(int n) {
		boolean isprime=true;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				isprime=false;
				return isprime;
			}
		}
		return isprime;
	}
	//Second method-----------------------------
	public static boolean isprime2(int n) {
		boolean isprime=true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				isprime=false;
				return isprime;
			}
		}
		return isprime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number ");
		int n=sc.nextInt();
		System.out.println(isprime1(n));
		System.out.println(isprime2(n));

	}

}
