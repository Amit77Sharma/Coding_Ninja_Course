/*
 * Check_Ap
 * you are given N integer value and you have to identify that the given number form an AP or not ....
 */
package Basic_Programing;
import java.util.Scanner;
public class Check_AP {

	/// function for checking AP -------------------------------------
	public static boolean check_AP(int[] number, int n)
	{
		boolean flage=true;
		int firstNumber=number[0];
		int secondNumber=number[1];
		int difference=secondNumber-firstNumber;
		for(int i=0; i<n-1; i++)
		{
			if(number[i+1]-number[i]!=difference)
			{
				flage=false;
			}
		}
		return flage;
	}
	
	//-------main------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entehr the total size of N");
		int n=sc.nextInt();
		System.out.println("Enter the number ");
		int[] number= new int[n];
		for(int i=0; i<n; i++)
		{
			number[i]=sc.nextInt();
		}
		System.out.println(check_AP(number,n));
	}

}
