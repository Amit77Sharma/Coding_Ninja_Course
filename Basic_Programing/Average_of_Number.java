//Program form the average of three number ..........
package Basic_Programing;
import java.util.Scanner;
public class Average_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int a=sc.nextInt();
		System.out.println("Enter the second number ");
		int b=sc.nextInt();
		System.out.println("Enter the third number ");
		int c=sc.nextInt();
		int d=(a+b+c)/3;
		System.out.println("The average of A and B and C is "+d);

	}

}
