package BinaryTree;

import java.util.Scanner;

public class NodeWithLargestData {
	
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot,int parent, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root element");
		}else if(isLeft) {
			System.out.println("Enter the left element");
		}else {
			System.out.println("Enter the right element");
		}
		Scanner sc=new Scanner(System.in);
		int parentnode=sc.nextInt();
		if(parentnode==-1) {
			return null;
		}
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(parentnode);
		BinaryTreeNode<Integer> leftChild=TakeInput(false,parentnode,true);
		BinaryTreeNode<Integer> rightChild=TakeInput(false,parentnode,false);
		node.left=leftChild;
		node.right=rightChild;
		return node;
	}
	
	public static int Nodelargest(BinaryTreeNode<Integer> root){
		if(root==null) {
			return -1;
		}
		int leftlargest=Nodelargest(root.left);
		int rightlargest=Nodelargest(root.right);
		return Math.max(root.data,Math.max(leftlargest,rightlargest));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=TakeInput(true,0,true);
		System.out.println("largest node");
		int data=Nodelargest(root);
		System.out.println(data);

	}

}
