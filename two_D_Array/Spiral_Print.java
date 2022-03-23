/*
 * For a given two- dimension Integer array (list of size(N*M))) print it in spiral
 * 
 *form that is you need to print in the order followed for every iteration
 */
package two_D_Array;
import java.util.Scanner;
public class Spiral_Print {
	
	// function for printing spiral of matrix 
	
	public static void spiral_print(int[][] arr, int r, int c)
	{
		System.out.println("hence the spiral are ");
		
		int total=r*c;
		int minrow=0;
		int maxrow=r-1;
		int mincol=0;
		int maxcol=c-1;
		int count=0;
		while(count<total)
		{
			for(int i=minrow,j=mincol; j<=maxcol && count<total; j++)
			{
				System.out.print(arr[i][j]+"\t");
				count++;
			}
			minrow++;
			for(int i=minrow,j=maxcol; i<=maxrow && count<total; i++)
			{
				System.out.print(arr[i][j]+"\t");
				count++;
			}
			maxcol--;
			for(int i=maxrow,j=maxcol; j>=mincol && count<total; j--)
			{
				System.out.print(arr[i][j]+"\t");
				count++;
			}
			maxrow--;
			for(int i=maxrow, j=mincol; i>=minrow && count<total; i--)
			{
				System.out.print(arr[i][j]+"\t");
				count++;
			}
			mincol++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column ");
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
		spiral_print(arr,r,c);
	}

}
