// program to  find the largest number between three number.............

package Basic_Programing;
import java.util.Scanner;;
public class Largest_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println("a is Grater "+a);
		}else if(b>c && b>a){
			System.out.println("b is greater "+b);
		}else {
			System.out.println("c is greater "+c);
		}

	}

}
