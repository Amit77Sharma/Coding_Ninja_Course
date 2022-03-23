/*
 * Program for Writting the sum of N number from recursion
 */
package Recurssion1;
import java.util.Scanner;
public class Sum_of_NArray {
	
	//recurssive function for calculating the sum fo an array
	
	public static int sum(int[] arr)
	{
		if(arr.length<=0)
		{
			return 0;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		int[] smaller=new int[arr.length-1];
		for(int i=1; i<arr.length; i++)
		{
			smaller[i-1]=arr[i];
		}
		System.out.println(arr[0]);
		int nsum=sum(smaller)+ arr[0];
		return nsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(sum(arr));

	}

}
