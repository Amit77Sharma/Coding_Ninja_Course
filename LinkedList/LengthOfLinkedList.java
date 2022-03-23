
//here we are going to create the linked list and going to count the length  of the linked list ....


package LinkedList;

public class LengthOfLinkedList {
	
	
	//lets count the lenght how many nodes are there ................
	
	public static int countNode(Node<String> head)
	{
		Node<String> temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		//System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
	
		//lets create the 10 node................this time we are going to create String type Node
		
		Node<String> n1=new Node<String>("Amit");
		
		Node<String> n2=new Node<String>("Sumit");
		
		Node<String> n3=new Node<String>("Anita");
		
		Node<String> n4=new Node<String>("Ajita");
		
		Node<String> n5=new Node<String>("Ajit");
		
		Node<String> n6=new Node<String>("Amar");
		
		
		// once we crete the node lets connect it ........
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		
		// After linking all the node lets count how many nodes we cretee s
		System.out.println("the lentgh of nodes are ");
		int n=countNode(n1);
		System.out.println(n);
		
		

	}

}
