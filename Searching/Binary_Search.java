/*
 * Program for binary search-------------------------------------
 * One thing we should keep in mind that the binary search always works on the sorted arrays......
 */
package Searching;
import java.util.Scanner;
public class Binary_Search {
	
	//recurssive function for checking that the elements is present or not------------
	
	public static int binary_search(int[] arr,int end,int start, int x)
	{
		if(arr.length<=0)
		{
			return -1;
		}
		if(start<=end)
		{
			int mid=((end-start)/2)+start;
			if(x==arr[mid])
			{
				return mid;
			}
			else if(x>arr[mid])
			{
				return binary_search(arr,end,mid+1,x);
			}
			else
			{
				return binary_search(arr,mid-1,start,x);
			}
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int n=sc.nextInt();
		System.out.println("Enter the elements into the arrays");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements you wants to search");
		int x=sc.nextInt();
		int found=binary_search(arr,n,1,x);
		System.out.println(found);

	}

}
