
//In this program we will take input from th euser and print the even number first the odd number;

package LinkedList;
import java.util.Scanner;
public class Even_after_Odd_LL {
	
	//taking input from the userr...................
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
	
	//arranging the even after odd number in linked list....
	
	public static Node<Integer> Arrange(Node<Integer> head){
		Node<Integer> odd=null;
		Node<Integer> oddhead=null;
		Node<Integer> even=null;
		Node<Integer> evenhead=null;
		Node<Integer> temp=head;
//		if(temp.data%2!=0) {
//			odd=temp;
//			oddhead=odd;
//		}else {
//			even=temp;
//			evenhead=even;
//		}
//		temp=temp.next;
		while(temp!=null) {
			if(temp.data%2!=0) {
				if(odd==null) {
					odd=temp;
					oddhead=odd;
				}else {
					odd.next=temp;
					odd=temp;
				}
			}else {
				if(even==null) {
					even=temp;
					evenhead=even;
				}else {
					even.next=temp;
					even=temp;
					
				}
			}
			temp=temp.next;
		}
		odd.next=evenhead;
		return oddhead;
	}

	
	// printing the new node.....
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeinput();
		Node<Integer> newnode=Arrange(head);
		print(newnode);
		
	}

}
