/*
 * Program for quick sort;
 */

package Sorting;
import java.util.Scanner;
public class Quick_Sort {
	
	// function for quick sort--------------------
	public static void Quick_Sort(int[] arr,int start, int end)
	{
		if(start>=end)
		{
			return;
		}
		int pivot=arr[start];
		int index=partition(arr,pivot,start,end);
		Quick_Sort(arr,start,index-1);
		Quick_Sort(arr,index+1,end);
		
	}
	
	// partition of the array and returning the index value of pivot....................
	public static int partition(int[] arr, int pivot,int start,int end)
	{
		int count=0;
		for(int i=start+1; i<=end; i++)
		{
			if(arr[start]>arr[i])
			{
				count++;
			}
		}
		count=start+count;
		int temp=arr[start];
		arr[start]=arr[count];
		arr[count]=temp;
		int i=start;
		int j=end;
		while(i<j)
		{
			if(arr[i]<pivot)
			{
				i++;
			}
			else if(arr[j]>=pivot)
			{
				j--;
			}
			else
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return count;
	}

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
		Quick_Sort(arr,0,n-1);
		System.out.println("the sorted arrays are ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
