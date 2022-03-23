/*
 * You have been given an Integer array/list of size N that contains only Integer 0 and 1. write a function to sort this arrays/list think a 
 *solution which scans the arrays/list only once & don't require use of an extra space. 
 */
package Arrays;
import java.util.Scanner;
public class Sort_0_1 {
	
	//By brute force methods we can apply the .....................
	public static void sort_0_1(int[] arr)
	{
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		
		// printing the values of the arrays----------------
		System.out.println("the sorted arrays are ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays ");
		int n=sc.nextInt();
		System.out.println("Enter the only 0 and 1 in array");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		sort_0_1(arr);

	}

}
