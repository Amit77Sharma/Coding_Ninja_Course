/*
 * Write a program that will create the queue using the 2 stack without braking the property of stack...
 * 
 */
package Queue;
import java.util.Stack;
public class QueueUsing2Stack<T> {
	
	Stack<T> s1;
	Stack<T> s2;
	
	public QueueUsing2Stack() {
		s1=new Stack<>();
		s2=new Stack<>();
	}
	
	//how know the size of the stack.............................................
	public int size(){
		return s1.size();
	}
	
	//checking that the queue is empty or not-----------------------------------
	public boolean isEmpty() {
		return s1.size()==0;
	}
	
	//inserting the element into the stack...................................
	public void enque(T data) {
		s1.push(data);
	}
	
	//deleting the element from the queue using stack.....
	public T dequeue(){
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T temp=s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return temp;
	}
}
