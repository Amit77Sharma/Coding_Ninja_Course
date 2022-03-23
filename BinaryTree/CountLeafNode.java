package BinaryTree;

import java.util.Scanner;

public class CountLeafNode {
	
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot,int parent,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root node ");
		}else if(isLeft) {
			System.out.println("Enter the leftchild of root");
		}else {
			System.out.println("Enter the rightChild of the root");
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
	
	
	public static int NumberOfChild(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		return NumberOfChild(root.left)+NumberOfChild(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root=TakeInput(true,0,true);
		int leaf=NumberOfChild(root);
		System.out.println("the number of leaf node in a tree is");
		System.out.println(leaf);

	}

}
