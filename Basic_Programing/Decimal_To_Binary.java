/*
 * program for the conversion of decimal to binary in java----------------------
 * 
 * */

package Basic_Programing;
import java.util.Scanner;
public class Decimal_To_Binary {

	public static void DecimalToBinary(int number)
	{
		int[] binary=new int[1000];
		int i=0;
		while(number>0)
		{
			binary[i++]=number%2;
			number=number/2;
		}
		for(int j=i-1; j>=0; j--)
		{
			System.out.print(binary[j]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number ");
		int number=sc.nextInt();
		DecimalToBinary(number);
	}

}
