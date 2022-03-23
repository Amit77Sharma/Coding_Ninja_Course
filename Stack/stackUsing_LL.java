package Stack;
import LinkedList.Node;
public class stackUsing_LL<T> {
	
	private Node<T> head;
	private int size;
	
	// creating constructor of linked ==================================
	public stackUsing_LL(){
		head=null;
		size=0;
	}
	
	//getting the size of the stack=================================
	public int size() {
		return size;		
	}
	
	//getting the top of the elememts ===============================
	public T top() throws stackException {
		if(head==null) {
			// throw exception
			throw new stackException();
		}
		return head.data;	
	}
	
	//checking  wheather the data is empty or not ================================
	public boolean isEmpty() {
		return size==0;
	}
	
	// adding new element into the atsck ==========================
	public void push(T element) {
		Node<T> CurrentNode=new Node<T>(element);
		CurrentNode.next=head;
		head=CurrentNode;
		size++;
	}
	
	// deleting the top of the element from the stack========================
	public T pop() throws stackException {
		if(head==null) {
			//throw exception....
			throw new stackException();
		}
		T data=head.data;
		head=head.next;
		size--;
		return data;
	}
}
