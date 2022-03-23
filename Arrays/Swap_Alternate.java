/*
 * you have been given an arrays/list of sizeN. you need to swap every pair of alternate elements in arrays/lis.
 * you dont need to print or return anything just change the input arrays list...
 * 
 */
package Arrays;
import java.util.Scanner;
public class Swap_Alternate {
	
	// function for swap alternate-----------------------------------
	
	public static void swap_alternate(int[] arr, int n)
	{
		for(int i=0; i<(arr.length-1); i+=2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the numbers ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		swap_alternate(arr,n);
	}

}
