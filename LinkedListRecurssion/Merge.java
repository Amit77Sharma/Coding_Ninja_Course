
// this program is Merge sort .....

package LinkedListRecurssion;
import java.util.Scanner;
public class Merge {
	
	//merging the two linkd lsit ...
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
	//taking input from the user ......
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
	
	//Divide the linked lsit .........
	public static Node<Integer> mid(Node<Integer> head){
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(slow!=null) {
			if(fast.next==null || fast.next.next==null) {
				return slow;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	// sorting the linked lsit ........
	public static Node<Integer> mergesort(Node<Integer> head) {
		if(head==null) {
			return null;
		}
		Node<Integer> midhead=mid(head);
		Node<Integer> part2=midhead.next;
		Node<Integer> newnode2=mergesort(part2);
		midhead.next=null;
		Node<Integer> newnode=mergesort(head);
		Node<Integer> newnode3=merge(newnode,newnode2);	
		return newnode3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeinput();
		Node<Integer> mergehead=mergesort(head);
		print(mergehead);
	}

}
