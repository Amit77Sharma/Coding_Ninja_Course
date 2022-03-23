// this program can increment the every element of linked list

package LinkedList;

public class IncrementEveryElement {
	
	
	//lets create the function incrementingevery element....
	
	public static void increment(Node<Integer> head)
	{
		Node<Integer> temp=head;
		
		while(temp!=null)
		{
			temp.data++;// here we care incrementing the every element of linoed list...
			System.out.println(temp.data);// and printing the value of the linked lists
			temp=temp.next;
		}
		
	}

	public static void main(String[] args) {
		
		//lets create the node first..............
		
		Node<Integer> n1=new Node<>(10);
		
		Node<Integer> n2=new Node<>(20);
		
		Node<Integer> n3=new Node<>(30);
		
		Node<Integer> n4=new Node<>(40);
		
		Node<Integer> n5=new Node<>(50);
		
		// After creating the node lets linke it with their address
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		
		//lets we wants to increment the every element of the linked list.....
		
		increment(n1);
		

	}

}
