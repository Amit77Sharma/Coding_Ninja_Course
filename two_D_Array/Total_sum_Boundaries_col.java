/*
 * For a given two dimensional square matrix of size (N*N) find the total sum of elements on both the diagoal
 * elements at al the four boundaries.
 */
package two_D_Array;
import java.util.Scanner;
public class Total_sum_Boundaries_col {
	
	// lets get calculate the digonal first 
	public static int First_Digonal(int[][] arr,int r,int c)
	{
		int i=0;
		int j=0;
		int sum=0;
		while(i<r && j<c)
		{
			sum=sum+arr[i][j];
			i++;
			j++;
		}
		return sum;
	}
	
	// lets get calculate the second digonal 
	
	public static int Second_Digonal(int[][] arr, int r,int c)
	{
		int i=0;
		int j=c-1;
		int sum=0;
		while(i<r && j>0)
		{
			sum=sum+arr[i][j];
			i++;
			j--;
		}
		return sum;
	}
	
	// calculating the boundaries of al the matrix .............
	
	public static int Boundaries(int[][] arr, int r, int c)
	{
		int sum=0;
		for(int i=1; i<r-1; i++)
		{
			sum=sum+arr[0][i];
			sum=
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimension of the matrix ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter the eleements ");
		int[][] arr=new int[r][c];
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

	}

}
