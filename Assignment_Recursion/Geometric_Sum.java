/*
 * Given K,  Find the Geometric sum i.e.
 * 1 + 1/2 + 1/4 + 1/8 + ..........+ 1/2^k
 * 
 * using recurssion;
 */
package Assignment_Recursion;
import java.util.Scanner;
public class Geometric_Sum {
	
	//Recursive function for finding the Geometric Progression
	public static double Geomatric_Progression(int k)
	{
		if(k==0)
		{
			return 1;
		}
		double sum=(1/(Math.pow(2,k)))+Geomatric_Progression(k-1);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		double gp=Geomatric_Progression(n);
		System.out.println(gp);
	}

}
