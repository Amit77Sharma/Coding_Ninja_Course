package Queue;
import java.util.Scanner;
public class Circular_Queue_Using {

	public static void main(String[] args) throws QueueException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Circular_Queue circular=new Circular_Queue();
		circular.enqueue(10);
		circular.enqueue(20);
		circular.enqueue(30);
		circular.enqueue(50);
		circular.enqueue(80);
		System.out.println(circular.size());
		circular.dequeue();
		circular.enqueue(70);
		circular.enqueue(100);
		circular.enqueue(50);
		System.out.println(circular.front());
		System.out.println(circular.rear());
		
		
	}

}
