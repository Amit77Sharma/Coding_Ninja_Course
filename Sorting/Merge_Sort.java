/*
 * Write a program to sort the array using merge sort through recursion.....
 */
package Sorting;
import java.util.Scanner;
public class Merge_Sort {
	
	// reursive function for sorting the array through merge sort-----------------------
	
	public static void merge_sort(int[] arr)
	{
		if(arr.length<=1)
		{
			return;
		}
		int[] s1=new int[arr.length/2];
		int[] s2=new int[arr.length-arr.length/2];
		for(int i=0; i<arr.length/2; i++)
		{
			s1[i]=arr[i];
		}
		for(int i=arr.length/2; i<arr.length; i++)
		{
			s2[i-arr.length/2]=arr[i];
		}
		merge_sort(s1);
		merge_sort(s2);
		merge(s1,s2,arr);
	}
	// function for merging the two array-------------------------------------------------------
	
	public static void merge(int[] s1,int[] s2, int[] arr)
	{
		int i=0,j=0;
		int k=0;
		while(i<s1.length && j<s2.length)
		{
			if(s1[i]<=s2[j])
			{
				arr[i]=s1[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=s2[j];
				j++;
				k++;
			}
		}
		while(i<s1.length)
		{
			arr[k]=s1[i];
			i++;
			k++;
		}
		while(j<s2.length)
		{
			arr[k]=s2[j];
			j++;
			k++;
		}
	}

	// main code of this program ...............................................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		System.out.println("Enter the elements into the array");
		int[] arr=new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		merge_sort(arr);
	}

}
