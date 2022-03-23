//program to traverse the tree in different way......................

package BinaryTree;

import java.util.Scanner;

public class DifferentWayTraversing {
	
	//Taking input in the form of tree................................................
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot,int parent,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root first");
		}else if(isLeft) {
			System.out.println("Enter the left child ");
		}else {
			System.out.println("Enter the right child ");
		}
		Scanner sc=new Scanner(System.in);
		int rootnode=sc.nextInt();
		if(rootnode==-1) {
			return null;
		}
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(rootnode);
		BinaryTreeNode<Integer> leftchild=TakeInput(false,rootnode,true);
		BinaryTreeNode<Integer> rightchild=TakeInput(false,rootnode,false);
		node.left=leftchild;
		node.right=rightchild;
		return node;
	}
	
	//printing the tree in preorderwise........................................
	public static void Printpreorder(BinaryTreeNode<Integer> node) {
		if(node==null) {
			return;
		}
		System.out.println(node.data);
		Printpreorder(node.left);
		Printpreorder(node.right);
	}

	//printing the tree in postorder wise.............................................
	public static void PrintPostorder(BinaryTreeNode<Integer> node) {
		if(node==null) {
			return;
		}
		PrintPostorder(node.left);
		PrintPostorder(node.right);
		System.out.println(node.data);
	}
	
	//printing the tree  in inorder wise................................
	public static void PrintInorder(BinaryTreeNode<Integer> node) {
		if(node==null) {
			return;
		}
		PrintInorder(node.left);
		System.out.println(node.data);
		PrintInorder(node.right);
	}
	
	public static void main(String[] args) {
		
		//taking input to the Binary Tree 
		
		BinaryTreeNode<Integer> node=TakeInput(true,0,true);
		System.out.println("preorder wise");
		Printpreorder(node);
		System.out.println("postorder wise");
		PrintPostorder(node);
		System.out.println("Inorder wise");
		PrintInorder(node);

	}

}
