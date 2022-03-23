
// Take input in Linked list using while loop ....

package LinkedList;

import java.util.Scanner;

public class LL_Take_Input {
	
	
	//function for taking input from the user ....
	
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		
		int number =sc.nextInt();
		
		Node<Integer> head=null;
		
		while(number!=-1)
		{
			Node<Integer> CurrentNode= new Node<>(number);
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
			number = sc.nextInt();
		}
		return head;
		
	}

	
	//Optimized code for taking input into the linked list .........
	
	public static Node<Integer> takeoptimiseInput()
	{
		Scanner sc=new Scanner(System.in);
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
	
	// lets print the linked list .....
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	// Main funtion program .......
	
	public static void main(String[] args) {
			
		Node<Integer> node=takeinput();
		Node<Integer> node1=takeoptimiseInput();
		print(node);
		print(node1);
		
	}

}
