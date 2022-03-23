package Stack;
import java.util.Stack;
public class Stack_in_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stock=new Stack<Integer>();
		stock.push(20);
		stock.push(10);
		stock.push(30);
		stock.pop();
		System.out.println(stock.size());
		stock.pop();
		stock.push(70);
		System.out.println(stock.size());
		System.out.println(stock.peek());
		int arr[]= {10,20,30,40,50};
		for(int ele:arr) {
			stock.push(ele);
		}
		for(int ele:arr) {
			System.out.print(stock.pop()+" ");
		}
		
		
	}

}
