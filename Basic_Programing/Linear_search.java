// Program to find the largest element in the array-------
package Basic_Programing;
import java.util.Scanner;
public class Linear_search {
	public static void linearSearch(int n,int[] arr) {
		System.out.println("Largest elements are ");
		int largest=Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n=sc.nextInt();
		System.out.println("Enetr the elements");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		linearSearch(n,arr);
	}

}
