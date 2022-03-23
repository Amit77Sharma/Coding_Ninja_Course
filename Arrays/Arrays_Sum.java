/*
 * Given an array of length N, you need to find and return the sum of all the elements of the arrays/list;
 */
package Arrays;
import java.util.Scanner;
public class Arrays_Sum {
	
	// function for finding the sum of the arrays,,,,;;;;;;;;;
	
	public static void arrays_sum(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	// main function of java-------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of length of arrays");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		arrays_sum(arr);
	}

}
