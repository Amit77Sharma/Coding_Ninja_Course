// program to print the all Even number between 1 to N...
package Basic_Programing;
import java.util.Scanner;
public class Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numebr");
		int n=sc.nextInt();
		System.out.println("the even number lies between 1 to N are ");
		int i=1;
		while(i<=n)
		{
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
