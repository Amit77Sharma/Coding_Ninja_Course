/*
 * Write a recurssive function for searchinf the elemenst into the array;;;---------------
 */
package Searching;
import java.util.Scanner;
public class Linear_search {
	
	//recurssive function for searching the elements --------------
	
	public static boolean linear_search(int[] arr,int x)
	{
		if(arr.length<=0)
		{
			return false;
		}
		if(arr[0]==x)
		{
			return true;
		}
		int[] smaller=new int[arr.length-1];
		for(int i=1; i<arr.length; i++)
		{
			smaller[i-1]=arr[i];
		}
		boolean small=linear_search(smaller,x);
		return small;
	}
	
	// if we wants to return the index of that elements the -----------------
	
	public static int linear_search(int[] arr, int x,int startindex)
	{
		if(arr.length<=0)
		{
			return -1;
		}
		if(startindex==arr.length)
		{
			return -1;
		}
		if(arr[startindex]==x)
		{
			return startindex;
		}
		int f=linear_search(arr,x,startindex+1);
		return f;
	}

	// main code this program ----------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements you wanst to search");
		int x=sc.nextInt();
		boolean found=linear_search(arr,x);
		System.out.println(found);
		int num=linear_search(arr,x,0);
		System.out.println(num);

	}

}
