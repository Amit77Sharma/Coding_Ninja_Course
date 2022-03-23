package BinaryTree;

import java.util.Scanner;

public class NumberOfNodeTree {
	
	public static int count=0;
	public static BinaryTreeNode<Integer> TakeTreeInput(boolean isRoot,int parent, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root ");
		}else {
			if(isLeft) {
				System.out.println("Enter the left child "+parent);
			}else {
				System.out.println("Enter the right child "+parent);
			}
		}
		Scanner sc=new Scanner(System.in);
		int rootnode=sc.nextInt();
		if(rootnode==-1) {
			return null;
		}
		BinaryTreeNode<Integer> newnode=new BinaryTreeNode<Integer>(rootnode);
		BinaryTreeNode<Integer> leftchild=TakeTreeInput(false,rootnode,true);
		BinaryTreeNode<Integer> rightchild=TakeTreeInput(false,rootnode,false);
		newnode.left=leftchild;
		newnode.right=rightchild;
		return newnode;
	}
	
	public static void CalculateNoNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		count++;
		CalculateNoNode(root.left);
		CalculateNoNode(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=TakeTreeInput(true,0,true);
		
		System.out.println("Calculating the no of nodes int tree");
		CalculateNoNode(root);
		System.out.println(count);

	}

}
