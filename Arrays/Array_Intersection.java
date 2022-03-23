/*
 * you have been given two integer arrays /list of N and M. You need to print their intersection and intersection for this
 * problem can be defined when booth array /list contains a particular value or to put it in other words when there is a common vaLUE 
 * EXIST  IN BOTH THE ARRAYS;
 */
package Arrays;
import java.util.Scanner;
public class Array_Intersection {
	
	//function for finding the array intersection....................
	public static void ArrayIntersection(int[] arr1, int[] arr2, int n, int m)
	{
		System.out.println("the intersected elements are ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr2[j]+"\t");
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter the elements ");
		for(int i=0; i<n; i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of the second arrays ");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		System.out.println("Enter the elements ");
		for(int i=0; i<m; i++)
		{
			arr2[i]=sc.nextInt();
		}
		ArrayIntersection(arr1,arr2,n,m);
	}

}
