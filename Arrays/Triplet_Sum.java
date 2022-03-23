/*
 * You have been given a random integer arrays/list and a number X.
 * find and return the number of triplets in array/list.which is sum to x.
 */
package Arrays;
import java.util.Scanner; 
public class Triplet_Sum {
	
	// By brute/Naive method to solve the problem of triplets sum..........
	
	public static void triplet_Sum(int[] arr,int sum)
	{
		int count=0;//for counting how many triplets can be formed...............
		for(int i=0; i<arr.length-2; i++)
		{
			for(int j=i+1; j<arr.length-1; j++)
			{
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	

	
	//main method of program-------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the number of elements in the array ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		triplet_Sum(arr,sum);

	}

}
