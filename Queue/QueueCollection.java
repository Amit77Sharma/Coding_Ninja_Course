/*
 * if we wants to use the queue then we cannot instanciate the object of the queue directly beacause queue
 * is an interface and we know we cann't instanciate the object of interface so to complete the insterface of queue
 * we implement it into the LinkedList class which inplemet the queue ineteface 
 * so, if we wants to use the queue we can use the linkeklist clss and use its menthof toimplement queue.
 */


package Queue;
import java.util.LinkedList;
public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> Queue=new LinkedList<Integer>();
		Queue.add(10);
		Queue.add(20);
		Queue.add(30);
		Queue.add(40);
		System.out.println(Queue.size());
		System.out.println(Queue.poll());// this poll function will delete the element from the first of the queue
		System.out.println(Queue.pollLast());
		System.out.println(Queue.size());
	}

}
