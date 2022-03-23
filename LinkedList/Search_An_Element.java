
// program to search the element in the linkmed list.....By takin input from the user....

package LinkedList;

import java.util.Scanner;

public class Search_An_Element {
	
	//function for taking input from the user until it takes -1 as value
	
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		
		int number = sc.nextInt();
		
		Node<Integer> head=null;
		while(number!=-1)
		{
			Node<Integer> currentNode=new Node<Integer>(number);
			if(head==null)
			{
				head=currentNode;
			}
			else
			{
				Node<Integer> tail=head;
				while(tail.next!=null)
				{
					tail=tail.next;
				}
				tail.next=currentNode;
			}
			number=sc.nextInt();
		}
		return head;
	}
	
	// function for searching the elemnt ....in th linked list....
	
	public static boolean searchElement(Node<Integer> head, int se)
	{
		boolean flag=false;
		Node<Integer> temp=head;
		while(temp!=null)
		{
			if(se==temp.data)
			{
				flag=true;
				return flag;
			}
			temp=temp.next;
		}
		return flag;
		
	}
	
	//main Function of java 
	public static void main(String[] args) {
		
		//lets take input from the user......
		System.out.println("enter thje data");
		
		Node<Integer> node=takeinput();
		
		System.out.println("Enter the data you wants to searh");
		
		Scanner s=new Scanner(System.in);
		
		int se=s.nextInt();
		
		boolean value=searchElement(node,se);
		
		System.out.println(value);

	}

}
