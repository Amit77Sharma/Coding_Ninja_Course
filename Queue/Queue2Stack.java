package Queue;

public class Queue2Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsing2Stack<Integer> queue = new QueueUsing2Stack<Integer>();
		int n=queue.size();
		System.out.println(n);
		queue.enque(20);
		queue.enque(10);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);
		System.out.println(queue.size());
		int d=queue.dequeue();
		System.out.println(d);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());

	}

}
