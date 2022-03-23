
// Eliminate the Consecutive Duplicate element from the Linked List.

package LinkedList;
import java.util.Scanner;
public class Eliminate_Duplicate_Element {
	
	//lets take input from the user.....
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
	
	// function for Removing the Duplicate Element....
	
	public static Node<Integer> EliminateDuplicate(Node<Integer> head){
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			return head;
		}
		Node<Integer> prev=head;
		Node<Integer> tail=head;
		Node<Integer> CurrentNode=head.next;
		while(CurrentNode!=null) {
			if(CurrentNode.data==tail.data) {
				CurrentNode=CurrentNode.next;
			}else
			{
				tail.next=CurrentNode;
				tail=CurrentNode;
			}
		}
		tail.next=null;
		return prev;
	}
	
	//printing the nodes of the linkeed list...
	public static void print(Node<Integer> head2) {
		while(head2!=null) {
			System.out.println(head2.data);
			head2=head2.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lets take input from the user first.....
		Node<Integer> newhead=takeinput();
		//Eliminating the Duplicate....
		Node<Integer> head2=EliminateDuplicate(newhead);
		//printing the new nodes....
		print(head2);
		
		

	}

}
