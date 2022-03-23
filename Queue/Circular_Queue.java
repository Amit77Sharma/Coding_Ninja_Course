package Queue;

public class Circular_Queue {
	
	private int[] data;
	private int Front;
	private int Rear;
	private int size;
	
	public Circular_Queue() {
		data=new int[5];
		Rear=-1;
		Front=-1;
	}
	
	//it will return the size of the queue----------------------
	public int size() {
		return size;
	}
	
	//this will return either size of queue is empty or not......
	public boolean isEmpty() {
		return size==0;
		
	}
	
	//this will return the front elemnet of the queue..................
	public int front() throws QueueException {
		if(size==0) {
			throw new QueueException();
		}else {
			int temp=data[Front];
			return temp;
		}
	}
	
	//this will return the rear of the queue............................
	public int rear() throws QueueException {
		if(Rear!=-1) {
			int temp=data[Rear];
			return temp;
		}else {
			throw new QueueException();
		}
	}
	
	//this will insert the element into the queue..........................
	public void enqueue(int ele) {
		if(size==0) {
			Front++;
			Rear++;
			data[Front]=ele;
			size++;
		}else {
			Rear++;
			if(Rear==data.length) {
				Rear=0;
			}
			data[Rear]=ele;
			size++;
		}
		
	}
	
	//this will delete the element into the queue.........................
	public int dequeue() throws QueueException {
		if(Front!=-1) {
			int temp=data[Front];
			Front++;
			size--;
			return temp;
		}else {
			throw new QueueException();
		}
		
	}

}
