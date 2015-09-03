package exercise8;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("unused")
public class Tree {

	protected int value;
	protected Tree left, right;

	public Tree() {
	}

	public Tree(int value) {
		this.value = value;
	}

	// public Tree(int value, Tree left) {
	// this.value = value;
	// this.left = left;
	// }
	//
	// public Tree(Tree right, int value) {
	// this.value = value;
	// this.right = right;
	// }
	//
	// public int getValue() {
	// return value;
	// }
	//
	// public void setValue(int value) {
	// this.value = value;
	// }
	//
	// public Tree getLeft() {
	// return left;
	// }
	//
	// public void setLeft(Tree left) {
	// this.left = left;
	// }
	//
	// public Tree getRight() {
	// return right;
	// }
	//
	// public void setRight(Tree right) {
	// this.right = right;
	// }

	public void add(Tree root, Tree node) {
		if (node.value < root.value) {
			if (root.left == null) {
				root.left = node;
			} else {
				add(root.left, node);
			}
		} else if (node.value > root.value) {
			if (root.right == null) {
				root.right = node;
			} else {
				add(root.right, node);
			}
		}
	}

//	public void levelOrderPrint(Tree root) {
//		Queue<Tree> queue = new LinkedList<Tree>();
//		System.out.print("\t");
//		Tree mark = new Tree(0);
//
//		if (root != null) {
//			queue.add(root);
//			queue.add(mark);
//		}
//
//		while (!queue.isEmpty()) {
//			Tree temp = queue.poll();
//			System.out.print("\t\t");
//			if (temp != mark) {
//				System.out.print(temp.value);
//			} else {
//				if (queue.isEmpty()) {
//					return;
//				}
//				queue.add(mark);
//				System.out.println();
//			}
//
//			if (temp.left != null) {
//				queue.add(temp.left);
//			}
//			if (temp.right != null) {
//				queue.add(temp.right);
//			}
//		}
//	}

	public void print(Tree node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		print(node.left);
		print(node.right);
	}

}
