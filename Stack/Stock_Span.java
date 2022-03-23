
// write a program for stock span of the programing..............

package Stack;
import java.util.Scanner;
import java.util.Stack;
public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) {
			int count=1;
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i]) {
					count++;
				}
			}
			arr1[i]=count;
		}
		
		for(int k=0; k<n; k++) {
			System.out.print(arr1[k]+" ");
		}

	}

}
