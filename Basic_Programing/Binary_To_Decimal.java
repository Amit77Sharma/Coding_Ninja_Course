package Basic_Programing;
import java.util.Scanner;
import java.lang.Math;
public class Binary_To_Decimal {

	// function for Binary to decimal..................................
	public static void Binarytodecimal(int n)
	{
		long temp=n;
		long decimal=0;
		int base=1;
		while(temp>0)
		{
			long rem=temp%10;
			decimal=decimal+rem*base;
			base=base*2;
			temp=temp/10;
		}
		System.out.println(decimal);
	}
// Main function .................................................
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		Binarytodecimal(n);
	}

}
