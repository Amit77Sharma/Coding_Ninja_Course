// Program to print the sum of all Even number between the Numbers------
package Basic_Programing;
import java.util.Scanner;
public class Sum_Of_Even {
	public static void SumOfEven(int n) {
		int sum=0;
		for(int i=2; i<=n; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		SumOfEven(n);

	}

}
