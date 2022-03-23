
//Program to insert the node recurssively...............................

package LinkedListRecurssion;
import java.util.Scanner;
public class Insert_recurssively {
	
	//taking data input from the user 
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
	
	public static Node<Integer> InsertNode(Node<Integer> head,int n,int index){
		Node<Integer> newnode=new Node<Integer>(n);
		if(index==0  ) {
			newnode.next=head;
			head=newnode;
			return head;	
		}
		if(head==null && index>0) {
			return head;
		}
		Node<Integer> temp=head;
		Node<Integer> smaller=InsertNode(head.next,n,index-1);
		head.next=smaller;
		return head;
	}
	
	// printintg the new linked list ..
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Node<Integer> head=takeinput();
		int n=s.nextInt();
		int index=s.nextInt();
		Node<Integer> newnode=InsertNode(head,n,index);
		print(newnode);
	}

}
