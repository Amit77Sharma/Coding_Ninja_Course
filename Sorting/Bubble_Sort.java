/*
 * Write a program to sort the array using the Bubble Sort....
 */
package Sorting;
import java.util.Scanner;
public class Bubble_Sort {
	
	
	// function for sorting the array using the Bubble Sort 
	public static void Bubble_Sort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	
	// Main function fo this program--------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the arrays ");
		int n=sc.nextInt();
		System.out.println("Enter the number ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		Bubble_Sort(arr);
		System.out.println("the sorted arrays are ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
