//Write a program for the addition of two or mor than two number.
package Basic_Programing;
import java.util.Scanner;
public class Add_to_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("the sum of 'a' and 'b' is "+c);
	}

}
