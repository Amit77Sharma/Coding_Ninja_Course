/*
 * you have been given an array/list of size where N is equals to [2M+1],
 * now in the given arrays/list m, numbers are present twice and the only one number is only once ....
 */
package Arrays;
import java.util.*;
import java.lang.*;
public class Unique_Element {
	
	// function for finding the unique elements.....
	
	public static void UniqueElements(int[] arr, int n)
	{
		Arrays.sort(arr);
		int c=0;
		for(int i=0; i<n; i++)
		{
			c=c^arr[i];
		}
		
		System.out.print(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		UniqueElements(arr, n);
	}

}
