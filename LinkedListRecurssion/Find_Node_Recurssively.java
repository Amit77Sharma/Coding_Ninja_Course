
//Program to find the node of a linked list recurssively..........................

package LinkedListRecurssion;

import java.util.Scanner;

public class Find_Node_Recurssively {
	
	//function for taking input from the user....
	
	public static Node<Integer> takeinput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1) {
			Node<Integer> CurrentNode=new Node<Integer>(data);
			if(head==null) {
				head=CurrentNode;
				tail=CurrentNode;
			}else {
				tail.next=CurrentNode;
				tail=CurrentNode;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	//finding the node recurssively......
	
	public static boolean FindNode(Node<Integer> head,int n){
		if(head==null) {
			return false;
		}
		if(head.data==n) {
			return true;
		}
		return FindNode(head.next,n);
	}
	
	//printing the nodes ................
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=takeinput();
		int n=sc.nextInt();
		System.out.println(FindNode(head,n));
	}

}
