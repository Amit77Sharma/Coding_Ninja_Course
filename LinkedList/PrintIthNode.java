
//This program will give you the vaule of the ith node you wnats to access......

package LinkedList;

import java.util.Scanner;

import java.util.LinkedList;

public class PrintIthNode {
	
	
	//lets create the function to get the ndex element........
	
	public static void getElement(Node<String> head, int index)
	{
		int count=1;
		Node<String> temp=head;
		while(temp!=null)
		{
			if(count==index)
			{
				System.out.println(temp.data);
				break;
			}
			count++;
			temp=temp.next;
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//lets create the node of 10 elements ...
		
		Node<String> n1=new Node<String>("Amit");
		
		Node<String> n2=new Node<String>("Ajit");
		
		Node<String> n3=new Node<String>("Anit");
		
		Node<String> n4=new Node<String>("Aamir");
		
		Node<String> n5=new Node<String>("sumit");
		
		Node<String> n6=new Node<String>("sujit");
		
		Node<String> n7=new Node<String>("inderjeet");
		
		Node<String> n8=new Node<String>("parrot");
		
		Node<String> n9=new Node<String>("carrot");
		
		Node<String> n10=new Node<String>("sarrot");
		
		// after creating the node lets connect all the nodes ....
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		n10.next=null;
		
		//After connecting all the nodes lets get the value of the index we wants to acess...
		System.out.println("Enter the index number ");
		int i=sc.nextInt();
		getElement(n1,i);

	}

}
