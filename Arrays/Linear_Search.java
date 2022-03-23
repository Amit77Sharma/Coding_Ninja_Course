/*
 * you have been given a random Integer arrays/list of size N, and a INteger X, you need to search for the integer X in th egiven arrays/list using
 *Linear search;
 */
package Arrays;
import java.util.Scanner;
public class Linear_Search {

	// function for finding the value/ key into the arrays...................
	
	public static boolean Linear_Search(int[] arr, int key) {
		boolean flage=false;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				flage=true;
				break;
			}
		}
		return flage;
		
	}
	
	//Main function of java ............................
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		int[] arr= new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements you wanted to search");
		int key=sc.nextInt();
		System.out.println(Linear_Search(arr,key));

	}

}
