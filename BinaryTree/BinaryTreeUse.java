package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
	
	
	public static BinaryTreeNode<Integer> TakeTreeInput(){
		System.out.println("Enter the data");
		Scanner sc=new Scanner(System.in);
		int rootdata=sc.nextInt();
		if(rootdata==-1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		BinaryTreeNode<Integer> leftchild=TakeTreeInput();
		BinaryTreeNode<Integer> rightchild=TakeTreeInput();
		root.left=leftchild;
		root.right=rightchild;
		return root;
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	static int value=0;
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		value=value+root.data;
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft=new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright=new BinaryTreeNode<Integer>(3);
		root.left=rootleft;
		root.right=rootright;
		BinaryTreeNode<Integer> twoleft=new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> threeright=new BinaryTreeNode<Integer>(5);
		rootleft.left=twoleft;
		rootright.right=threeright;
		
		printTree(root);
		printTreeDetailed(root);
		BinaryTreeNode<Integer> rootnode=TakeTreeInput();
		printTreeDetailed(rootnode);
		System.out.println(value);
	}

}
