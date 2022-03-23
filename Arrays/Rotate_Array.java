/*
 * You have been given a number integer arrays/list of size N.write a function that rotes the given array/list
 * by D dimension......
 */
package Arrays;
import java.util.Scanner;
public class Rotate_Array {
	
	// By bruite force method to rotate an array..............
	
	public static void Swap(int[] arr, int start, int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	public static void reverse(int[] arr, int start, int end)
	{
		while(start<end)
		{
			Swap(arr,start,end);
			start+=1;
			end-=1;
		}
	}
	
	public static void rotate_array(int[] arr,int r)
	{
		if(arr.length==0)
		{
			return;
		}
		if(r>=arr.length && arr.length!=0)
		{
			r%=arr.length;
		}
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-r-1);
		reverse(arr,arr.length-r,arr.length-1);
	}
	public static void newarray(int[] arr)
	{
		for(int ele:arr)
		{
			System.out.print(ele+"\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elemenets ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to from it from");
		int r=sc.nextInt();
		rotate_array(arr,r);
		System.out.println("So the rotated array are ");
		newarray(arr);
	}

}
