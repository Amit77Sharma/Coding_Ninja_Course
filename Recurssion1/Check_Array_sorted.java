/*
 * write a program that check that the given array is sorted or not 
 */
package Recurssion1;
import java.util.Scanner;
public class Check_Array_sorted {
	
	//recurssive function for checking that the given array is sorted or not-----------------------
	
	public static boolean check_sorted(int[] arr)
	{
		if(arr.length==1)
		{
			return true;
		}
		if(arr[0]>arr[1])
		{
			return false;
		}
		int[] smaller=new int[arr.length-1];
		for(int i=1; i<arr.length; i++)
		{
			smaller[i-1]=arr[i];
		}
		
		boolean issorted=check_sorted(smaller);
		return issorted;
	}

	//main function of this program ......................................................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.print("Enter the elements into the arrays");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(check_sorted(arr));

	}

}
