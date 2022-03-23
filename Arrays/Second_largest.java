/*
 * you have been given a random integer array/list of size N.
 * you are required to find and return the second largest elements in array/list.if N<=1 or all elements 
 * are same in array then return -214783648 
 */
package Arrays;
import java.util.Scanner;
public class Second_largest {
	
	
	//function for finding the second largest elements in arrays 
	// By bruite force method..............................................
	public static void secondlargest(int[] arr)
	{
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				second=largest;
				largest=arr[i];
			}
			if(arr[i]<largest && arr[i]>second)
			{
				second=arr[i];
			}
		}
		System.out.println(second);
	}
	
	// Main method of program-........................................

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements into the array");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		secondlargest(arr);
	}

}
