/*
 * For a given two dimensional integer array/list of size(N*M). print the array /list like in a sine wave order
 * i.e print the first column top to bottom and next column
 */
package two_D_Array;
import java.util.Scanner;
public class Like_Wave {
	
	// function defintion of wave_print..................
	
	public static void wave_print(int[][] arr, int r,int c)
	{
		System.out.println("here the waves are ");
		
		for(int i=0; i<c; i++)
		{
			if(i%2==0)
			{
				for(int j=0; j<r; j++)
				{
					System.out.print(arr[j][i]+"\t");
				}
			}
			else
			{
				for(int j=r-1; j>=0; j--)
				{
					System.out.print(arr[j][i]+"\t");
				}
			}
		}
	}

	// main function of this program--------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column of the matrix ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter the elemnets into the matrix ");
		int[][] arr=new int[r][c];
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		// function for printing like the wave are -------------------------
		wave_print(arr,r,c);
	}

}
