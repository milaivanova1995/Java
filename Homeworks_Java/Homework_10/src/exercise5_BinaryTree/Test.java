package exercise5_BinaryTree;

public class Test {

	public static void main(String[] args) {
		
		BinaryTree root = new BinaryTree(0);
		BinaryTree node1 = new BinaryTree(1);
		BinaryTree node2 = new BinaryTree(2);
		BinaryTree node3 = new BinaryTree(3);
		BinaryTree node4 = new BinaryTree(4);
		BinaryTree node5 = new BinaryTree(5);
		BinaryTree node6 = new BinaryTree(6);
		
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node2.setRight(node4);
		node3.setLeft(node5);
		node4.setRight(node6);
		
		System.out.println("The depth is: " + root.getDepth());
		System.out.println("Binary Tree: ");
		root.levelOrderPrint(root);
	}



}
