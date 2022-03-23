/*
 * you have been given an Integer array/list and a number X.
 * Find and return the total number of pair in the array/list which sum to X
 */
package Arrays;
import java.util.Scanner;
public class Pair_Sum {
	
	
	//BY brute force or the naive solution for finding the pair sum in an array.
	public static void pairsum(int[] arr,int sum)
	{
		int count = 0;// for counting the pair values can be formed 
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	//main function of java-------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size od the eelements ");
		int n=sc.nextInt();
		System.out.println("Enter the nunmbers ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		pairsum(arr,sum);

	}

}
