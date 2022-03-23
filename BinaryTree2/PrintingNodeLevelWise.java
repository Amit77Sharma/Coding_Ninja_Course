package BinaryTree2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PrintingNodeLevelWise {
	
	
	public static BinaryTreeNode2<Integer> TakeInputLevel(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the root node");
		int parent=sc.nextInt();
		if(parent==-1) {
			return null;
		}
		BinaryTreeNode2<Integer> root=new BinaryTreeNode2<Integer>(parent);
		Queue<BinaryTreeNode2<Integer>> q=new LinkedList<BinaryTreeNode2<Integer>>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode2<Integer> node=q.poll();
			System.out.println("Enter the left chile of "+node.data);
			int leftchild=sc.nextInt();
			if(leftchild!=-1) {
				BinaryTreeNode2<Integer> leftroot=new BinaryTreeNode2<Integer>(leftchild);
				node.left=leftroot;
				q.add(leftroot);
			}
			System.out.println("Enter the right child of the node"+node.data);
			int rightchild=sc.nextInt();
			if(rightchild!=-1) {
				BinaryTreeNode2<Integer> rightroot=new BinaryTreeNode2<Integer>(rightchild);
				node.right=rightroot;
				q.add(rightroot);
			}
		}
		return root;
	}
	
	public static void printintglevelwise(BinaryTreeNode2<Integer> root) {
		Queue<BinaryTreeNode2<Integer>> q=new LinkedList<BinaryTreeNode2<Integer>>();
		if(root==null) {
			return;
		}
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode2<Integer> firstnode=q.poll();
			System.out.print(firstnode.data+":");
			if(firstnode.left!=null) {
				q.add(firstnode.left);
			}
			if(firstnode.right!=null) {
				q.add(firstnode.right);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//Taking input level wise in tree.......................
		BinaryTreeNode2<Integer> root=TakeInputLevel();
		printintglevelwise(root);

	}

}
