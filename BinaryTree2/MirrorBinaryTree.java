package BinaryTree2;
import java.util.Scanner;
public class MirrorBinaryTree {
	
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

	
	public static BinaryTreeNode2<Integer> mirrorTree(BinaryTreeNode2<Integer> root){
		if(root==null) {
			return null;
		}
		BinaryTreeNode2<Integer> newleft=mirrorTree(root.right);
		BinaryTreeNode2<Integer> newright=mirrorTree(root.left);
		root.left=newleft;
		root.right=newright;
		return root;
	}
	
	
	public static void PrintTree(BinaryTreeNode2<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		PrintTree(root.right);
		PrintTree(root.left);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode2<Integer> root=TakeInput(true,0,true);
		BinaryTreeNode2<Integer> newroot=mirrorTree(root);
		PrintTree(newroot);

	}

}
