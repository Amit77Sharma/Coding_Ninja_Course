package BinaryTree2;

import java.util.Scanner;

public class BuildTreeUsingInorderPreorder {
	
	
	public static BinaryTreeNode2<Integer> creatingBinaryTree(int[] preOrder,int[] inorder){
		if(preOrder.length==0) {
			return null;
		}
		int rootnode=preOrder[0];
		//searching for the rootnode in the binary tree............
		BinaryTreeNode2<Integer> root=new BinaryTreeNode2<Integer>(rootnode);
		int i=0;
		for(; i<inorder.length; i++) {
			if(rootnode==inorder[i]) {
				break;
			}
		}
		int[] preoderleft=new int[i];
		int[] inorderleft=new int[i];
		System.arraycopy(preOrder, 1, preoderleft, 0, i);
        System.arraycopy(inorder, 0, inorderleft, 0, i);
		root.left=creatingBinaryTree(preoderleft,inorderleft);
		int[] preoderright=new int[preOrder.length-i-1];
		int[] inorderright=new int[inorder.length-i-1];
		System.arraycopy(preOrder, i + 1,preoderright, 0, preOrder.length - i - 1);
        System.arraycopy(inorder, i + 1, inorderright, 0, preOrder.length - i - 1);
		root.right=creatingBinaryTree(preoderright,preoderright);
		return root;
		
	}
	
	public static void print(BinaryTreeNode2<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of node in preoder");
		int pre=sc.nextInt();
		int[] preOrder=new int[pre];
		System.out.println("Eneter the elements into preorder");
		for(int i=0; i<pre; i++) {
			preOrder[i]=sc.nextInt();
		}
		System.out.println("Enter the lenght of inoder");
		int in=sc.nextInt();
		int[] inorder=new int[in];
		for(int i=0; i<in; i++) {
			inorder[i]=sc.nextInt();
		}
		BinaryTreeNode2<Integer> newnode=creatingBinaryTree(preOrder,inorder);
		print(newnode);
	}

}
