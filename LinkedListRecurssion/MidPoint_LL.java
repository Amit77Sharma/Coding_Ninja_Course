
//program we have to find the mid point of the linked lsit in java .....

package LinkedListRecurssion;

import java.util.Scanner;

public class MidPoint_LL {

	// taking input from the user ....
	public static Node<Integer> takeinput(){
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=null;
		Node<Integer> tail=null;
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> CurrentNode=new Node<Integer>(data);
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
	
	// function for finding the mid of the linked lsit ....
	public static void Midpoint(Node<Integer> head){
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(slow.next!=null) {
			if(fast.next==null || fast.next.next==null) {
				System.out.println(slow.data);
				break;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeinput();
		Midpoint(head);
	}

}
