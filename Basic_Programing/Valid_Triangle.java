/*You are given 3 number. Each represents the length of a line and you have to identify 
 the se lines can form a valid triangle or not 
 */
package Basic_Programing;
import java.util.Scanner;
public class Valid_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//To prove a valid traingle we have to use the pythagoren triplets rules 
		if(a+b>c) {
			System.out.println("triangle is valid");
		}else if(b+c>a) {
			System.out.println("triangle is valid");
		}else if(c+a>b) {
			System.out.println("tringle is valid ");
		}else {
			System.out.println("Triangle is invalid ");
		}
		

	}

}
