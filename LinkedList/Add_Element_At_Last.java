
//This program is to add the last element at the last of the linked list ..

package LinkedList;

import java.util.Scanner;

public class Add_Element_At_Last {
	
	//lets create the function to take input from the user......
	
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		Node<Integer> head=null;
		while(number !=-1)
		{
			Node<Integer> CurrentNode=new Node<Integer>(number);
			
			if(head==null)
			{
				head=CurrentNode;
			}
			else
			{
				Node<Integer> tail=head;
				while(tail.next!=null)
				{
					tail=tail.next;
				}
				tail.next=CurrentNode;
			}
			number=sc.nextInt();
		}
		return head;
	}

	
	// creating the node to put the element at last.....
	
	public static Node<Integer> insertNodeAtLast(Node<Integer> node,Node<Integer> in)
	{
		Node<Integer> temp=node;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=in;
		in.next=null;
		return node;
	}
	
	
	// printing the all the nodes of the linked list ....
	
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	//main function...................
	
	public static void main(String[] args) {
		
		//lets first create the linked list of some size....
		System.out.println("Enter the number of element ");
		Node<Integer> node=takeinput();
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		Node<Integer> in=new Node<Integer>(num);
		Node<Integer> ob=insertNodeAtLast(node,in);
		print(ob);

	}

}
