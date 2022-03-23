package BinaryTree2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class TakingInputLevel {
	
	public static BinaryTreeNode2<Integer> TakeInputLevelWise(boolean isRoot){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the root node");
		int parent=sc.nextInt();
		if(parent == -1) {
			return null;
		}
		BinaryTreeNode2<Integer> node=new BinaryTreeNode2<Integer>(parent);
		Queue<BinaryTreeNode2<Integer>> q=new LinkedList<BinaryTreeNode2<Integer>>();
		q.add(node);
		while(!q.isEmpty()) {
			BinaryTreeNode2<Integer> firstnode=q.poll();
			System.out.println("Enter the left node of "+firstnode.data);
			int leftnode=sc.nextInt();
			if(leftnode!=-1) {
				BinaryTreeNode2<Integer> leftchild=new BinaryTreeNode2<Integer>(leftnode);
				firstnode.left=leftchild;
				q.add(leftchild);
			}
			System.out.println("Enter the right child of "+firstnode.data);
			int rightnode=sc.nextInt();
			if(rightnode!=-1) {
				BinaryTreeNode2<Integer> rightchild=new BinaryTreeNode2<Integer>(rightnode);
				firstnode.right=rightchild;
				q.add(rightchild);
			}
		}
		return node;
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
		BinaryTreeNode2<Integer> root=TakeInputLevelWise(true);
		print(root);
		

	}

}
