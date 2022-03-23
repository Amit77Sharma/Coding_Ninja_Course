//Program to print the table of any given number ......form 1 to N.
package Basic_Programing;
import java.util.Scanner;
public class Table_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			int c=a*i;
			System.out.println(c);
		}

	}

}
