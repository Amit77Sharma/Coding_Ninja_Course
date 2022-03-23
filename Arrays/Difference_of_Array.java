/*
 * you have given the two Arrays of size N and M of different size and you have
 * to find the difference of two arrays.
 */
package Arrays;
import java.util.Scanner;
public class Difference_of_Array {
	
	// function for finding the difference of two array.........................
	
	public static void difference_of_array(int[] arr,int[] arr1)
	{
		int carry=0;
		int len=arr.length-1;
		int len1=arr1.length-1;
		int z=len>len1?len:len1;
		int[] diff=new int[z];
		int k=diff.length-1;
		while(k>0)
		{
			int d=0;
			if(arr[len]+d>arr1[len1])
			{
				d=arr[len]+carry-arr1[len1];
				carry=0;
			}else
			{
				d=arr[len]+carry+10-arr1[len1];
				carry=-1;
			}
			diff[k]=d;
			k--;
			len--;
			len1--;
		}
		
		int ind=0;
		while(ind<diff.length)
		{
			if(diff[ind]!=0)
			{
				break;
			}
			ind++;
		}
		while(ind<diff.length)
		{
			System.out.println(diff[ind]+"\t");
			ind++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the number of elemnest ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of the second Arrays ");
		int m=sc.nextInt();
		System.out.println("Enter the eleements ");
		int[] arr1=new int[m];
		for(int i=0; i<m; i++)
		{
			arr1[i]=sc.nextInt();
		}
		difference_of_array(arr,arr1);

	}

}
