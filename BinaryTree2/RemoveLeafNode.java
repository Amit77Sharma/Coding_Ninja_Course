package BinaryTree2;

import java.util.Scanner;

public class RemoveLeafNode {
	
	
	public static BinaryTreeNode2<Integer> TakeInput(boolean isRoot,int parent,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root node ");
		}else if(isLeft) {
			System.out.println("Enter the left child of root");
		}else {
			System.out.println("Enter the right child of the root");
		}
		Scanner sc=new Scanner(System.in);
		int parentnode=sc.nextInt();
		if(parentnode==-1) {
			return null;
		}
		BinaryTreeNode2<Integer> node = new BinaryTreeNode2<Integer>(parentnode);
		BinaryTreeNode2<Integer> leftchild=TakeInput(false,parentnode,true);
		BinaryTreeNode2<Integer> rightchild=TakeInput(false,parentnode,false);
		node.left=leftchild;
		node.right=rightchild;
		return node;
	}
	
	
	public static BinaryTreeNode2<Integer> removeLeaves(BinaryTreeNode2<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			return null;
		}
		root.left=removeLeaves(root.left);
		root.right=removeLeaves(root.right);
		return root;
	}

	
	public static void PrintNode(BinaryTreeNode2<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		PrintNode(root.left);
		PrintNode(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode2<Integer> root=TakeInput(true,0,true);
		BinaryTreeNode2<Integer> newnode=removeLeaves(root);
		PrintNode(newnode);

	}

}
