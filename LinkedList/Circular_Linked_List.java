
// here is the program for circular linked list 

package LinkedList;
import java.util.Scanner;
public class Circular_Linked_List {

	// function for taking input from the user....................
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
		tail.next=head;
		return head;
	}
	
	// printing  the node in circular linked list....
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeinput();
		print(head);

	}

}
