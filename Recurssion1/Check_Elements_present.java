/*
 * Write a program to check wheather the elements present in the elements aor not
 * through recurssion................................
 */
package Recurssion1;
import java.util.Scanner;
public class Check_Elements_present {
	
	// recurssive function for searching the elements......
	public static boolean search_number(int[] arr,int x)
	{
		if(arr.length<=0)
		{
			return false;
		}
		if(arr.length==1)
		{
			if(arr[0]!=x)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		int[] smaller = new int[arr.length-1];
		for(int i=1; i<arr.length; i++)
		{
			smaller[i-1]=arr[i];
		}
		if(arr[0]==x)
		{
			return true;
		}
		boolean result=search_number(smaller,x);
		return result;
		
	}

	// main function of this program--------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of thr array");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you wants to search");
		int x=sc.nextInt();
		//function for checking that the number is present or not..
		System.out.println(search_number(arr,x));
	}

}
