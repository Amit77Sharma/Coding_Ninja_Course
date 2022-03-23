/*
 * you have been given an array of N size in which you have to find the span of an Arrays 
 * which means find the smallest element and find the largest elements of an arrry and then find the 
 * difference between them becomes the span of the array...........
 */
package Arrays;
import java.util.Scanner;
public class Span_of_Array {
	
	// function for finding the span of the array.....................
	
	public static void span_of_Array(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		//find the differenec of min and max 
		int d=max-min;
		System.out.println("The span of the Array is ");
		System.out.println(d);
	}
	
	//Main function of this program......................................................

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements into the arrays ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		span_of_Array(arr);

	}

}
