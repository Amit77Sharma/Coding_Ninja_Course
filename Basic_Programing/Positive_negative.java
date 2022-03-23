//program to check weather the given number is positive or negative......

package Basic_Programing;
import java.util.Scanner;
public class Positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nuber ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("The number is positive");
		}else if(a<0) {
			System.out.println("The number is negative ");
		}else {
			System.out.println("the number is Zero");
		}

	}

}
