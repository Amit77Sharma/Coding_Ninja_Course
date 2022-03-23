package LinkedList;

import java.util.ArrayList;

public class CreatingLinkedList {
	
	// printing the linkeed list function definition....
	public static void print(Node<Integer> head) {
		
		System.out.println("the linked list is ");
		Node<Integer> temp=head;
	
		// we can iterate it through for loop also .....
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}

	public static void main(String[] args) {	
		// lets create th node by creating the object of the node...
		
		//Which type of node you wants to create....
		
//		Node<Integer> n1=new Node<>(10);// bycreating this we will be able to define only one node ..
//		System.out.println(n1.data);// by this we can able to get the data from the linked list.
//		System.out.println(n1.next);// By this we can able to acess the nextnode address...
		
		//lets crete the multiple node of Integer type....
			Node<Integer> n2=new Node<>(10);
		
			Node<Integer> n3=new Node<>(20);
			
			Node<Integer> n4=new Node<>(30);
			
			Node<Integer> n5=new Node<>(40);
			
			Node<Integer> n6=new Node<>(50);
			n2.next=n3;
			n3.next=n4;
			n4.next=n5;
			n5.next=n6;
			n6.next=null;
			System.out.println(n2.next);
			System.out.println(n3);
			System.out.println(n3.next);
			System.out.println(n4);
			System.out.println(n4.next);
			System.out.println(n5);
			System.out.println(n5.next);
			System.out.println(n6);
			System.out.println(n6.next);
			//printing the linked list ....
			print(n2);
		
	}

}
