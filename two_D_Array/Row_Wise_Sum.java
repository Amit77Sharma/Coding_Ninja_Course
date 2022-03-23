/*
 *For a given two Dimensional Integer array/list of size (N*M). 
 *find and print the sum of each of row elements int a single saperated  by a single space 
 */
package two_D_Array;
import java.util.Scanner;
public class Row_Wise_Sum {
	
	// function for printitng the row wise sum
	public static void row_wise_sum(int[][] arr, int n, int m)
	{
		for(int i=0;i<n; i++)
		{
			int sum=0;
			for(int j=0; j<m; j++)
			{
				sum=sum+arr[i][j];
			}
			System.out.print(sum+"\t");
		}
	}
	
	// main function of row wise sum--------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimension of the 2d matrix");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter the elements ");
		int[][] arr=new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		row_wise_sum(arr,n,m);
	}

}
