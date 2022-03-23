package BinaryTree;

import java.util.Scanner;

public class SumOfNode {
	
	public static int value=0;
	public static BinaryTreeNode<Integer> TakeInputBetter(boolean isroot, int parent, boolean isLeft) {
		if(isroot) {
			System.out.println("Enter the root");
		}else {
			if(isLeft) {
				System.out.println("Enter the left child of"+parent);
			}else {
				System.out.println("Enter the right child of"+parent);
			}
		}
		Scanner sc=new Scanner(System.in);
		int parentnode=sc.nextInt();
		if(parentnode==-1) {
			return null;
		}
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(parentnode);
		BinaryTreeNode<Integer> leftchild=TakeInputBetter(false,parentnode,true);
		BinaryTreeNode<Integer> rightchild=TakeInputBetter(false,parentnode,false);
		node.left=leftchild;
		node.right=rightchild;
		return node;
	}
	
	public static void printTreeNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+":");
		value=value+root.data;
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeNode(root.left);
		printTreeNode(root.right);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root=TakeInputBetter(true,0,true);
		System.out.println("printing the values stored in tree ");
		printTreeNode(root);
		
		System.out.println("calculating the sum of all the nodes of the tree");
		System.out.println(value);

	}

}
