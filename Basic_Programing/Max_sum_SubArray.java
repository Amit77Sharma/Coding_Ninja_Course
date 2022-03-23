package Basic_Programing;
import java.util.Scanner;
public class Max_sum_SubArray {
	//this function will compute the maximum sub array max sum in O(n^3)
	public static void MaxSumSubArray(int[] arr)
	{
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{	
				int sum=0;
				for(int k=i; k<=j; k++)
				{
					sum=sum+arr[k];
				}
				if(sum>max)
				{
					max=sum;
				}
				
			}
		}
		System.out.println(max);
		
	}
	
	//this function will compute the max sum od sub array in O(n^2).
	
	public static void MaxSumSubArray1(int[] arr)
	{
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			int sum=0;
			for(int j=i; j<n; j++)
			{
				sum=sum+arr[j];
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		System.out.println(max);
	}
	
	//finding the max sum sub array problem with kadane's Algorithm...
	// there is the one condition in this algorithm that if the value of the elements stored in this all are 
	//negative then this will not work at least one value should be positive in it 
	// if we found the sum id negative the assign th sum is equal to zero////
	
	public static void Kadane_Algorithms(int[] arr)
	{
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0; i<n; i++)
		{
			sum=sum+arr[i];
			if(sum<0)
			{
				sum=0;
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
		
	}

	// this is the main program................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		MaxSumSubArray(arr);
		MaxSumSubArray1(arr);
		Kadane_Algorithms(arr);

	}

}
