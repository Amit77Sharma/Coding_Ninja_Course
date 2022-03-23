/*
 * Write a program that returns the last index of the elements present into the arrays
 * 
 */
package Recurssion1;
import java.util.Scanner;
public class Find_Last_Index {
	
	//recurssive function for finding the last index....................................
	public static int lastIndex(int[] arr, int x)
	{
		if(arr.length==0)
		{
			return -1;
		}
		int[] smaller =new int[arr.length-1];
		for(int i=1; i<arr.length; i++)
		{
			smaller[i-1]=arr[i];
		}
		int k=lastIndex(smaller,x);
		if(k!=-1)
		{
			return k+1;
		}else
		{
			if(arr[0]==x)
			{
				return 0;
			}else
			{
				return -1;
			}
		}
	}
	
	// recurssive function of checking from 0th indexing and going to last index......
	public static int firstIndex(int[] arr,int x, int startindex)
	{
		if(startindex==arr.length)
		{
			return -1;
		}
		int k=firstIndex(arr,x,startindex+1);
		if(k!=-1)
		{
			return k;
		}
		else
		{
			if(arr[startindex]==x)
			{
				return startindex;
			}
			else
				return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrays ");
		int n=sc.nextInt();
		System.out.println("Enter the elements into the arrays ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you wants to find ");
		int x=sc.nextInt();
		System.out.println(lastIndex(arr,x));
		System.out.println(firstIndex(arr,x,0));
	}

}
