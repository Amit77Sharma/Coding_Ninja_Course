//Program to check wheather the tringle is
//print 1 --- if the triangle is Equilateral
//print	 0 ---- if the triangle is isosceles trinagle;
//print -1--- if the tringle is scalene----
package Basic_Programing;
import java.util.Scanner;
public class Check_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b && a==c) {
			System.out.println("Triangle is Equilateral ");
		}else if(a==b && a!=c) {
			System.out.println("trinagle is isoseles trinagle");
		}else {
			System.out.println("Triangle is scelene ");
		}

	}

}
