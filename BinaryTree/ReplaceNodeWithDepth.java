package BinaryTree;

import java.util.Scanner;

public class ReplaceNodeWithDepth {
	
	//taking the node input .............................................................................. 
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot,int parent, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root ");
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

	// replace the node with the depth of k...........................................................
	public static void replaceNodeWithDepth(BinaryTreeNode<Integer> root,int k) {
		if(root==null) {
			return;
		}
		root.data=k;
		replaceNodeWithDepth(root.left,k+1);
		replaceNodeWithDepth(root.right,k+1);
	}
	
	//priting the updated node.........................................................................
	public static void printInorder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printInorder(root.left);
		printInorder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root=TakeInput(true,0,true);
		replaceNodeWithDepth(root,0);
		printInorder(root);
	}

}
