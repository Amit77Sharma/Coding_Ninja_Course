/*
 * We have given 100 bulbs. Initially they are off and we have to give the input to the bulbs from 1 to 100.
 * if we give the input 2 then the multiple of 2 are get touggled initially.
 * so find that at 100 input how many bulbs are on.......................
 */
package Basic_Programing;
import java.util.Scanner;
public class Banjamin_Bulb {
	
	// function for finding the banjamin bulb.................
	
	public static void Banjamin_Bulb(int n) {
//		int[] arr=new int[n];
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<10; j++)
//			{
//				arr[i++] =i*j;
//			
//			}
//		}
//		int count=0;
//		for(int i=0; i<n; i++)
//		{
//			if(arr[i]%2!=0)
//			{
//				count++;
//			}
//		}
		for(int i=1; i*i<=n; i++)
		{
			System.out.println(i*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		Banjamin_Bulb(n);

	}

}
