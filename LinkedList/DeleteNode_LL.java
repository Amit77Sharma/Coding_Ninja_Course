
//You have been given a linked list of integers. Your task is to write a function
//that deletes a node from a given position, 'POS'.

package LinkedList;

import java.util.Scanner;

public class DeleteNode_LL {
	
	//lets create function for taking input form the user....
	public static Node<Integer> takeinput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	//lets create the function for Deleting the node.....
	public static Node<Integer> DeleteNN(Node<Integer> head,int pos){
		Node<Integer> temp=head;
		Node<Integer> prev=head;
		int count=0;
		while(count<pos-1) {
			prev=temp;
			temp=temp.next;
			count++;
		}
		prev.next=temp.next;
		return head;
	}
	
	//Printing the linked list..................
	
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//lets take input from the user.....................
		System.out.println("Enter the Linked List");
		Node<Integer> head=takeinput();
		System.out.println("Enter the position you wants to delete");
		int n=s.nextInt();
		Node<Integer> newhead=DeleteNN(head,n);
		System.out.println("The new List are ");
		print(newhead);
		

	}

}
