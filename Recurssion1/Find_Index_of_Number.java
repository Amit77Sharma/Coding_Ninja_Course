/*
 * you are given an array of Integer and you have to find the elements and return the index of the number present 
 * in array.
 */
package Recurssion1;
import java.util.Scanner;
public class Find_Index_of_Number {
	
	//recurssive function for checking the number and finding the index of that.
	
	public static int check_Index(int[] arr, int x)
	{
		return checkindex(arr,x,1);
	}
	public static int checkindex(int[] arr,int x,int startindex)
	{
		if(arr.length==0)
		{
			return -1;
		}
		if(arr[0]==x)
		{
			return 1;
		}
		if(startindex==arr.length)
		{
			return -1;
		}
		if(arr[startindex]==x)
		{
			return startindex+1;
		}
		return checkindex(arr,x,startindex+1);
	}
	
	// main function of this code-------------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Arrays ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements into the arrays ");
		int[] arr=new int[n];
		for(int i=0; i<n;  i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements you wants to search");
		int x=sc.nextInt();
		//function for checking the number------
		System.out.println(check_Index(arr,x));

	}

}
