/*
 * Program to calculate the sum of two Array.........................
 */
package Arrays;
import java.lang.Math;
import java.util.Scanner;
public class Sum_of_Two_Array {
	
	// function for calculating the sum of two arrays....................
	
	public static void sum_of_array(int[] arr,int[] arr1)
	{
		int carry=0;
		int len1=arr.length;
		int len2=arr1.length;
		int len3=Math.max(len1, len2);
		int[] arr2=new int[len3];
		int z=len3-1;
		int i=len1-1,j=len2-1;
		while(z>0)
		{
			int d=carry;
			if(i>0)
			{
				d=d+arr[i];
				
			}
			if(j>0)
			{
				d=d+arr1[j];
			}
			carry=d/10;
			d=d%10;
			arr2[z]=d;
			i--;
			j--;
			z--;	
		}
		if(carry!=0)
		{
			System.out.print(carry);
		}
		newarray(arr2);
		
	}
	public static void newarray(int[] arr2)
	{
		for(int element:arr2)
		{
			System.out.print(element+"\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of second Array");
		int m=sc.nextInt();
		System.out.println("Enter the elements into the arrays ");
		int[] arr1=new int[m];
		for(int i=0; i<m; i++)
		{
			arr1[i]=sc.nextInt();
		}
		sum_of_array(arr,arr1);
	}

}
