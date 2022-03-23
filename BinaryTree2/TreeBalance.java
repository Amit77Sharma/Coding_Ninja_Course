package BinaryTree2;

import java.util.Scanner;

public class TreeBalance {
	
	public static BinaryTreeNode2<Integer> TakeInput(boolean isRoot,int parent, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root element");
		}else if(isLeft) {
			System.out.println("Enter the left child of root ");
		}else {
			System.out.println("Enter the right child of the root");
		}
		Scanner sc=new Scanner(System.in);
		int parentnode=sc.nextInt();
		if(parentnode==-1) {
			return null;
		}
		BinaryTreeNode2<Integer> node=new BinaryTreeNode2<Integer>(parentnode);
		BinaryTreeNode2<Integer> leftchild=TakeInput(false,parentnode,true);
		BinaryTreeNode2<Integer> rightchild=TakeInput(false,parentnode,false);
		node.left=leftchild;
		node.right=rightchild;
		return node;	
	}
	
	public static int height(BinaryTreeNode2<Integer> root) {
		if(root==null) {
			return 0;
		}
		int lefth=height(root.left);
		int rightr=height(root.right);
		return Math.max(lefth, rightr);
	}
	
	
	public static boolean treeBalance(BinaryTreeNode2<Integer> root) {
		if(root==null) {
			return true;
		}
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		if(Math.abs(rightheight-leftheight)>1) {
			return false;
		}
		boolean leftvalue=treeBalance(root.left);
		boolean rightvalue=treeBalance(root.right);
		return leftvalue && rightvalue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode2<Integer> root=TakeInput(true,0,true);
		System.out.println(treeBalance(root));
		//System.out.println(value);
	}

}
