//Program to convert the fahrenheit_to_celsius;
package Basic_Programing;
import java.util.Scanner;
public class Fahrenheit_to_celsius {
	
	//function 
	
	public static void converter(int n) {
		// Here we will apply the formula to convert the fahrengeit to celsious 
		int celsius=(((n-32)*5)/9);
		System.out.println(celsius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("convert this fehrenheit to celcius ");
		int n=sc.nextInt();
		converter(n);
	}

}
