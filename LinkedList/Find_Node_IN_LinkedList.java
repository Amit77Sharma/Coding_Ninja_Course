
// IN theis program you will be given an linkedlist and you have to find the node in that
//linkedlist and return the data of that node...

package LinkedList;

import java.util.Scanner;

public class Find_Node_IN_LinkedList {
	
	//taking input from thhe user..
	public static Node<Integer> takeinput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
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
	
	//Finding the node in the LinkedList.....
	public static int FindNode(Node<Integer> head,int n){
		Node<Integer> temp=head;
		int count=0;
		if(head==null) {
			return -1;
		}
		while(temp!=null) {
			if(temp.data==n) {
				return count;
			}
			count++;
			temp=temp.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data into the linkedList");
		Node<Integer> newhead=takeinput();
		System.out.println("Enter the Data you want's to search");
		int n=s.nextInt();
		System.out.println(FindNode(newhead,n));
		
		

	}

}
