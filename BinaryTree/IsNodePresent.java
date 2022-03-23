
//program to check wheather the node is present or not.......................
package BinaryTree;
import java.util.Scanner;
public class IsNodePresent {
	
	public static BinaryTreeNode<Integer> TakeInput(boolean isRoot,int parent,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root node");
		}else if(isLeft) {
			System.out.println("Enter the leftchild of the node");
		}else {
			System.out.println("Enter the rightchild of the node ");
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

	public static void isNodepresent(BinaryTreeNode<Integer> root,int value) {
		if(root==null) {
			return;
		}
		if(root.data==value) {
			System.out.println("Node is present");
			return;
		}
		isNodepresent(root.left,value);
		isNodepresent(root.right,value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=TakeInput(true,0,true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value you wnats to check in tree");
		int value=sc.nextInt();
		isNodepresent(root,value);

	}

}
