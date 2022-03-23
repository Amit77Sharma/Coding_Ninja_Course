package Basic_java;
	/******************************************************************************

    Online Java Compiler.
Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
// public static void pushZerosAtEnd(int[] arr) {
// 	//Your code goes here
//     int len=arr.length;
//     for(int i=0; i<len-1; i++)
//     {
//         int k=0;
//         for(int j=0; j<len-2; j++)
//         {
//             if(arr[j]==0)
//             {
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//                 k--;
//             }
//         }
//     }
public static void rotate(int[] arr, int d) {
			//Your code goes here
			int len=arr.length-1;
			int i=0;
			int m=d-1;
			while(i<m)
				{
					int temp=arr[i];
					arr[i]=arr[m];
					arr[m]=temp;
					i++;
					m--;
				}
			int k=d;
			while(k<len)
				{
					int temp=arr[k];
					arr[k]=arr[len];
					arr[len]=temp;
					k++;
					len--;
				}
			for(int j=arr.length-1; j>=0; j--)
			{
				System.out.print(arr[j]+" ");
			}

}
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Hello World");
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0; i<n; i++)
			{
			arr[i]=sc.nextInt();
			}
			int d=sc.nextInt();
			rotate(arr,d);

	}
}

