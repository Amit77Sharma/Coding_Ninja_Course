
//program for finding the node recurssively..............................................

package LinkedList;
import java.util.Scanner;
public class Finding_Last_Node {
	
	// taking Input into the LinkedList...................
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
	// finding the last Node into the linked list....
	public static void findlastnode(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			if(temp.next==null) {
				System.out.println(temp.data);
			}
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Node<Integer> head=takeinput();
		findlastnode(head);
	}

}
