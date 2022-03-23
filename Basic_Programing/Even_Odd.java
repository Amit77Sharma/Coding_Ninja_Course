//Program to identify weather the given number is odd or even.........
package Basic_Programing;
import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number ");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("the given number is Even");
		}
		else
			System.out.println("The given number is odd");
	}

}
