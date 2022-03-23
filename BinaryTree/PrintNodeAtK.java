package BinaryTree;

import java.util.Scanner;

public class PrintNodeAtK {
	
	//print node at k position---------------------------------------------------------------------
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot,int parent,boolean isLeft) {
		if(isRoot) {
			System.out.println("Enter the root node ");
		}else if(isLeft) {
			System.out.println("Enter the leftchild of the root");
		}else {
			System.out.println("Enter the rightchild of the root");
		}
		Scanner sc=new Scanner(System.in);
		int parentnode=sc.nextInt();
		if(parentnode==-1) {
			return null;
		}
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(parentnode);
		BinaryTreeNode<Integer> leftchild=TakeInput(false,parentnode,true);
		BinaryTreeNode<Integer> rightchild=TakeInput(false,parentnode,false);
		node.left=leftchild;
		node.right=rightchild;
		return node;
	}
	
	//Print node at k position --------------------------------------------------------------
	public static void PrintNodeAtposition(BinaryTreeNode<Integer> root,int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		PrintNodeAtposition(root.left,k-1);
		PrintNodeAtposition(root.right,k-1);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root=TakeInput(true,0,true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the K position");
		int k=sc.nextInt();
		PrintNodeAtposition(root,k);
	}

}
