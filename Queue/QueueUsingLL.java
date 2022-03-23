package Queue;
import LinkedList.Node;
public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	//Queue Constructor=================================
	public QueueUsingLL() {
		front=null;
		rear=null;
		size=0;
	}
	
	//getting the size of the queue------------------
	public int size() {
		return size;
	}
	
	// checking wheather the queue is empty or not.....-----------------
	public boolean isEmpty() {
		return size==0;
	}
	
	//this will return the front data of the queue-----
	public T front() throws QueueIsEmpty {
		if(size==0) {
			throw new QueueIsEmpty();
		}
		return front.data;
	}
	
	//it will give the value of rear of the node============================
	public T rear()  throws QueueIsEmpty {
		if(size==0) {
			throw new QueueIsEmpty();
		}
		T data=rear.data;
		return data;
	}
	
	// this wiil add the data into the queue-----------------------
	public void enqueue(T ele) {
		Node<T> FirstNode=new Node<T>(ele);
		if(size==0) {
			front=FirstNode;
			rear=FirstNode;
		}else {
			rear.next=FirstNode;
			rear=FirstNode;
		}
		size++;
	}
	
	// this will delete the data from the queue and return the value from the queue...............
	public T dequeue() throws QueueIsEmpty {
		if(size==0) {
			throw new QueueIsEmpty();
		}
		T data=front.data;
		front=front.next;
		size--;
		return data;
	}
}
