/*
 * you have been given an empty arrays and its size N. The only input taken 
 * from the user will be N and You need not to worry about the array. your task is to populate the arrays 
 * using the Integer values in the order 1 to N(both inclusive) in the order..
 * 1,3,5,.......4,2;
 */
package Arrays;
import java.util.Scanner;
public class Populate_Array {
	
	// function for populating the arrays.........................
	public static void populate_array(int n) {
		int[] arr=new int[n];
		int left=0; 
		int right=n-1; 
		int count=1;
		while(left<=right)
		{
			if(count%2==1)
			{
				arr[left]=count;
				count+=1;
				left++;
			}
			else
			{
				arr[right]=count;
				count+=1;
				right--;	
			}
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	// main function program of java ---------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		populate_array(n);
	}

}
