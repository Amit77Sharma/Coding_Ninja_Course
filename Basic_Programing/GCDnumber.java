// you have given two number and you have to find the greatest common divisor of these two number .
package Basic_Programing;
import java.util.Scanner;
public class GCDnumber {
	public static void GCD(int a, int b) {
		int  smaller=Math.min(a, b);
		int gcd=1;
		for(int i=2; i<=smaller; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr two number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		GCD(a,b);

	}

}
