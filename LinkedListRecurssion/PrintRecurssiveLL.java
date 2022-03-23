package LinkedListRecurssion;
import java.util.Scanner;
import java.util.LinkedList;
public class PrintRecurssiveLL {
	
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		Node<Integer> head=null,tail=null;
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

	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	//lets print the nodes of data recurssively........
	
	public static void printRec(Node<Integer> head1) {
		if(head1==null) {
			return;
		}
		System.out.print(head1.data+" ");
		printRec(head1.next);
	}
	
	//What if we interchange the print in recurssion...
	//it will print the linked list into the reverse order....
	public static void printInterRec(Node<Integer> head2) {
		if(head2==null) {
			return;
		}
		printInterRec(head2.next);
		System.out.print(head2.data+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking input from the user...............................
		Node<Integer> newhead=takeinput();
		print(newhead);
		System.out.println();
		printRec(newhead);
		System.out.println();
		printInterRec(newhead);

	}

}
