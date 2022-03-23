package LinkedListRecurssion;

import java.util.Scanner;

public class ReverseLL_Recurssion {
	
	// taking input from the user ....
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=null;
		Node<Integer> tail=null;
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> CurrentNode = new Node<Integer>(data);
			if(head==null) {
				head=CurrentNode;
				tail=CurrentNode;
			}else {
				tail.next=CurrentNode;
				tail=CurrentNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	//printing the node recurssively...
	public static Node<Integer> printrec(Node<Integer> head) {
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> RR=printrec(head.next);
		Node<Integer> temp=RR;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return RR;
	}
	//printintg the lined list ....
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static void main(String args[]) {
		Node<Integer> head=takeinput();
		Node<Integer> newnode=printrec(head);
		print(newnode);
	}

}
