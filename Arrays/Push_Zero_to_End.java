/*
 * You have been given a number integer array/list of size N. you have been required to push all the zeros that are present in the arrays/list to the end
 *of it Also make sure to maintain the realtive order of non zero elements..... 
 */
package Arrays;
import java.util.Scanner;
public class Push_Zero_to_End {
	
	
	// By brute force to push the zero to the last of the arrays..........
	public static void push_zero_to_end(int[] arr)
	{
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		while(j<arr.length)
		{
			arr[j]=0;
			j++;
		}
		
		System.out.println("The sorted elements are ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

	// main program of java----------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		push_zero_to_end(arr);
	}

}
