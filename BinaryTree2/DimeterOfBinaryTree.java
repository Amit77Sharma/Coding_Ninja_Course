package BinaryTree2;

import java.util.Scanner;

public class DimeterOfBinaryTree {
	
	public static BinaryTreeNode2<Integer> TakeInput(boolean isRoot,int parent,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root node of the tree");
		}else if(isLeft) {
			System.out.println("Enter the leftchild of root");
		}else {
			System.out.println("Enter the rightchild od root");
		}
		
		Scanner sc=new Scanner(System.in);
		int parentnode=sc.nextInt();
		if(parentnode==-1) {
			return null;
		}
		BinaryTreeNode2<Integer> node=new BinaryTreeNode2<Integer>(parentnode);
		BinaryTreeNode2<Integer> leftchild=TakeInput(false, parentnode, true);
		BinaryTreeNode2<Integer> rightchild=TakeInput(false,parentnode,false);
		node.left=leftchild;
		node.right=rightchild;
		return node;
	}
	
	public static int depth(BinaryTreeNode2<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftheight=depth(root.left);
		int rightheight=depth(root.right);
		return 1+Math.max(leftheight, rightheight);
	}
	
	
	public static int DiameterOfTree(BinaryTreeNode2<Integer> root) {
		if(root==null) {
			return 0;
		}
		int heightleft=depth(root.left);
		int heightright=depth(root.right);
		return Math.max(heightleft+heightright+1,Math.max(DiameterOfTree(root.left), DiameterOfTree(root.right)));
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode2<Integer> root=TakeInput(true,0,true);
		int h=DiameterOfTree(root);
		System.out.println(h);

	}

}
