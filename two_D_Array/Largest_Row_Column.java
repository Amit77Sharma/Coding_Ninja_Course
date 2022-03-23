/*
 * For a given two dimenesional Integer array of size (N*M) you need to find out which row or column has the 
 * largest sum of all elememnts in row/column.
 */
package two_D_Array;
import java.util.Scanner;
public class Largest_Row_Column {
	// function for calculating the largest row or column sum
	public static void largest_row_column(int[][] arr,int r,int c)
	{
		//Initially calculating max sum row 
		int rowsum=Integer.MIN_VALUE;
		for(int i=0; i<r; i++)
		{
			int row=0;
			for(int j=0; j<c; j++)
			{
				row=row+arr[i][j];
			}
			if(row>rowsum)
			{
				rowsum=row;
			}
		}
		
		int colsum=Integer.MIN_VALUE;
		for(int i=0; i<c; i++)
		{
			int col=0;
			for(int j=0; j<r; j++)
			{
				col=col+arr[i][j];	
			}
			if(col>colsum)
			{
				colsum=col;
			}
		}
		
		// now calculating the max rowsum or colsum;
		System.out.println("The maximum col or row sum is ");
		if(colsum>=rowsum)
		{
			System.out.println(colsum);
		}
		else
		{
			System.out.println(rowsum);
		}	
	}
	
	// main function of this program-----------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row and column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter the elements ");
		int[][] arr=new int[r][c];
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		largest_row_column(arr,r,c);
	}

}
