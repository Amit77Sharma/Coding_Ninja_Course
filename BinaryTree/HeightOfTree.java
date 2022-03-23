package BinaryTree;

import java.util.Scanner;

public class HeightOfTree {
	
	//taking input into the tree....................................
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot, int parent , boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root node ");
		}else if(isLeft) {
			System.out.println("Enter the left node ");
		}else {
			System.out.println("Enter the right node ");
		}
		Scanner sc=new Scanner(System.in);
		int parentnode=sc.nextInt();
		if(parentnode== -1) {
			return null;
		}
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(parentnode);
		BinaryTreeNode<Integer> leftchild=TakeInput(false,parentnode,true);
		BinaryTreeNode<Integer> rightchild=TakeInput(false,parentnode,false);
		node.left=leftchild;
		node.right=rightchild;
		return node;
	}
	
	//finding the height of the tree................
	public static int HeightofTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int height1=HeightofTree(root.left);
		int height2=HeightofTree(root.right);
		if(height1>height2) {
			return height1+1;
		}else {
			return height2+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program for calculating the height of the tree...
		
		BinaryTreeNode<Integer> root = TakeInput(true,0,true);
		int height=HeightofTree(root);
		System.out.println(height);

	}

}
