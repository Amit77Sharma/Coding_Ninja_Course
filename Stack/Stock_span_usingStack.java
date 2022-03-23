
//stock span using stack with optimal solution......

package Stack;
import java.util.Scanner;
import java.util.Stack;
public class Stock_span_usingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> st=new Stack<Integer>();
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the value into the array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			st.push(i);
			
		}
		

	}

}
