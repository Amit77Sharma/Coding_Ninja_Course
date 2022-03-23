package BinaryTree;

import java.util.Scanner;

public class IsParentNode {
	
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot,int parent, boolean isLeft) {
		if(isRoot) {
			System.out.println("Enter the root node");
		}else if(isLeft) {
			System.out.println("Enter the leftchild node");
		}else {
			System.out.println("Enter the rightchild node");
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
	
	
	public static void isParentnode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		if(root.left!=null && root.right!=null) {
			System.out.println("is parent:"+root.data);
		}
		isParentnode(root.left);
		isParentnode(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root=TakeInput(true,0,true);
		isParentnode(root);

	}

}
