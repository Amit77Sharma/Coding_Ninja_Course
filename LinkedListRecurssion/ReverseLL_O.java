
//In this program we will be looking forward for revrsing the linked list in O(N) time complexity..

package LinkedListRecurssion;
import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	DoubleNode(){
		
	}
	DoubleNode(Node<Integer> head, Node<Integer> tail){
		this.head=head;
		this.tail=tail;
	}
}

public class ReverseLL_O {

	//taking input from the user .....
	public static Node<Integer> takeinput(){
		java.util.Scanner sc=new Scanner(System.in);
		Node<Integer> head=null;
		Node<Integer> tail=null;
		int data=sc.nextInt();
		while(data!=-1){
			Node<Integer> CurrentNode=new Node<Integer>(data);
			if(head==null) {
				head=CurrentNode;
				tail=CurrentNode;
			}else {
				tail.next=CurrentNode;
				tail=tail.next;
			}
			data=sc.nextInt();
		}
		return head;
	}
	
	
	// function for reversing the list ....
	public static DoubleNode ReverseBetter(Node<Integer> head) {
		DoubleNode ans;
		if(head==null || head.next==null) {
			ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		DoubleNode smaller=ReverseBetter(head.next);
		smaller.tail.next=head;
		head.next=null;
		ans=new DoubleNode();
		ans.head=smaller.head;
		ans.tail=head;
		return ans;	
	}
	
	//printingthe root of the node /....
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Node<Integer> head=takeinput();
		DoubleNode neans=ReverseBetter(head);
		Node<Integer> root=neans.head;
		print(root);

	}

}
