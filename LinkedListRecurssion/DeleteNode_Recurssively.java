
//program for deleting the node recurssively...........................

package LinkedListRecurssion;
import java.util.Scanner;
public class DeleteNode_Recurssively {
	
	//function for taking input from the user ..........
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
			}
			else
			{
				tail.next=CurrentNode;
				tail=CurrentNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	
	//function for deleting the node recurssively.......
	
	public static Node<Integer> delete(Node<Integer> head, int pos){
		if(head==null) {
			return head;
		}
		if(pos==0) {
			Node<Integer> ahed=head.next;
			return ahed;
		}
		Node<Integer> temp=head;
		Node<Integer> smaller=delete(head.next,pos-1);
		temp.next=smaller;
		return temp;
	}
	
	// printing the ramainiing node/........
	
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
		//int n=s.nextInt();
		int pos=s.nextInt();
		Node<Integer> newnode=delete(head,pos);
		print(newnode);
	}

}
