
//In this program we will look how to merge the two sorted linked list.......

package LinkedListRecurssion;
import java.util.Scanner;
public class Merge_Two_Sorted_LL {

	//taking input from the user ..........
	public static Node<Integer> takeinput(){
		Scanner sc=new Scanner(System.in);
		Node<Integer> head1=null;
		Node<Integer> tail1=null;
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> CurrentNode=new Node<Integer>(data);
			if(head1==null) {
				head1=CurrentNode;
				tail1=CurrentNode;
			}else {
				tail1.next=CurrentNode;
				tail1=CurrentNode;
			}
			data=sc.nextInt();
		}
		return head1;
	}
	// merginig the two array ........
	public static Node<Integer> merge(Node<Integer> t1,Node<Integer> t2){
		Node<Integer> head=null;
		Node<Integer> tail=null;
		if(t1==null) {
			return t2;
		}
		if(t2==null) {
			return t1;
		}
		if(t1.data<t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}else {
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		while(t1!=null && t2!=null) {
			if(t1.data<t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		if(t1!=null) {
			tail.next=t1;
		}
		if(t2!=null) {
			tail.next=t2;
		}
		return head;
	}
	
	//printing the linked lsit .....
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1=takeinput();
		Node<Integer> head2=takeinput();
		Node<Integer> newnode=merge(head1,head2);
		print(newnode);

	}

}
