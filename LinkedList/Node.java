//let's Create the node of Generic Type So that we can create any type of node we wants ........

package LinkedList;

public class Node<T> {
	
	 public T data;
	 public Node next;
	
	public Node(T data){
		this.data=data;
		//this.next=null;
	}
	

}
