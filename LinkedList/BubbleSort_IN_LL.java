
//program to sort the linked lsit using Bubble sort algorithm

package LinkedList;
import java.util.Scanner;
public class BubbleSort_IN_LL {
	
	//Swing two nodes in linked list==============
	public static void swap(Node<Integer> node1, Node<Integer> Node2){
		
	}

	//talinkg input from the user......
	public static Node<Integer> takeinput(){
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=null,tail=null;
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> CurrentNode=new CurrentNode<Integer>(data);
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
	
	//letss count the no of node linked list has ...
	
	public static int countnode(Node<Integer> head) {
		int count=0;
		Node<Integer> temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	// using Bubble sort sortin the linked list.....
	
	public static Node<Integer> BubbleSort(Node<Integer> head,int count){
		Node<Integer> t1=head;
		Node<Integer> t2=head.next;
		for(int i=0; i<count-1; i++) {
			for(int j=1; j<count; j++) {
					swap(head,head.next);//its not working correctly ..............
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	}

}
