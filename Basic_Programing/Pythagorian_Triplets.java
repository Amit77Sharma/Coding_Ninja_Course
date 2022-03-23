/*
 * When we have three sides of triangle and we have to find that sides forms pythagoren triplets or not
 * if yes then return true else false.....
 * 
 */
package Basic_Programing;
import java.util.Scanner;
public class Pythagorian_Triplets {
	
	//function to find the pythagorean triplets---------------
	
	public static boolean pythagorean_triplets(int p, int b, int h)
	{
		boolean flage=false;
		//Step1 find the gratest number among three of them..........................
		
		int greatest = Integer.MIN_VALUE;
		if(p>b && p>h)
		{
			greatest=p;
		}else if(b>p && p>h) {
			greatest=b;
		}else {
			greatest=h;
		}
		
		// step second we have to find the pythagorean triplets------------------------
		
		int hypotenus=h*h;
		int perpendicular=p*p;
		int base=b*b; 
		if(hypotenus==(perpendicular+base))
		{
			flage=true;
		}
		return flage;
	}

	// Min function of java------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enteer the hypo, per, base ");
		int p=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println(pythagorean_triplets(p,b,h));

	}

}
