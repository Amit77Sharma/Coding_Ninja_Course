/*
 * you have been given an Integer aray of size N it has been sorted and then rotated by some number K
 * in the right hand direction 
 * your task is to write a function that return the value of that means the index from which the arrays 
 * has been rotated 
 */
package Arrays;
import java.util.Scanner;
public class Check_Array_Rotation {
	
	// function for checking the arrays rotation in java-----------------
	public static void check_array_rotation(int[] arr)
	{
		for(int i=0; i<=arr.length; i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println(i+1);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sirze of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements into the arrays ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		check_array_rotation(arr);

	}

}
