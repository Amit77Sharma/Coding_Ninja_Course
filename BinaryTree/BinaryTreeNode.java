
//Here i am creating the Binary tree with generic type ... 
package BinaryTree;

public class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data=data;
	}

}
