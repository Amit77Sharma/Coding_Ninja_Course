
//Program to insert a node at the certain position in linked list.............

package LinkedList;

import java.util.Scanner;

public class InsertNodeAtPosition {
	
	
	//to take input from the user ...........
	
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(num!=-1)
		{
			Node<Integer> CurrentNode=new Node<Integer>(num);
			if(head==null)
			{
				head=CurrentNode;
				tail=CurrentNode;
			}else {
				tail.next=CurrentNode;
				tail=CurrentNode;
			}
			num=sc.nextInt();
		}
		return head;
		
	}
	
	//function to add the element at certain position in linked list,........
	
	public static Node<Integer> insertAtposition(int n,int index,Node<Integer> head)
	{
		
		Node<Integer> newnode=new Node<Integer>(n);
		Node<Integer> prev=head;
		Node<Integer> noofnode=head;
		int count=0;
		while(noofnode!=null)
		{
			count++;
			noofnode=noofnode.next;
		}
		if(prev==null && index>0)
		{
			return head;
		}
		if(prev!=null && index==0)
		{
			newnode.next=head;
			head=newnode;
		}else {
			while(count<index-1 && prev!=null)
			{
				count++;
				prev=prev.next;
			}
			if(prev!=null)
			{
				newnode.next=prev.next;
				prev.next=newnode;
			}
		}
		return head;
	}

	// printing the nodes ....
	
	public static void print(Node<Integer> head)
	{
		System.out.println("the number are ");
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		//lets take the input from the user to create the linked list .....
		Node<Integer> node=takeinput();
		
		//After taking input create anode which we wants to insert into the certain position ...
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elemnet and its index");
		int n=s.nextInt();
		int index=s.nextInt();
		Node<Integer> obtained=insertAtposition(n,index,node);
		print(obtained);
		
		

	}

}
