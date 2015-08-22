package exercise5_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	protected int value, depth;
	protected BinaryTree left, right;
	
	public BinaryTree() {}
	
	public BinaryTree(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getDepth() {
		depth = 0;
		depth(this, 0);
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		if (contains(this, left)) {
			throw new IllegalArgumentException("The left tree node already exists!");
		}
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		if (contains(this, right)) {
			throw new IllegalArgumentException("The right tree node already exists!");
		}
		this.right = right;
	}

	public boolean isLeaf() {
		return left == null && right == null;
	}
	
	public boolean contains(BinaryTree root, BinaryTree subtree) {
		if (root == null || subtree == null) {
			return false;
		}
		if (subtree == root) {
			return true;
		}
		return contains(root.getLeft(), subtree) || contains(root.getRight(), subtree);
	}
	
	private void depth(BinaryTree node, int temp) {
		if (node.getLeft() == null && node.getRight() == null) {
			return;
		} else if (node.getLeft() != null && node.getRight() == null) {
			if (temp >= depth) {
				temp++;
				depth++;
			}
			depth(node.getLeft(), temp);
		} else if (node.getRight() != null && node.getLeft() == null) {
			if (temp >= depth) {
				temp++;
				depth++;
			}
			depth(node.getRight(), temp);
		} else {
			if (temp >= depth) {
				temp++;
				depth++;
			}
			depth(node.getLeft(), temp);
			depth(node.getRight(), temp);
		}
	}
	
	public void levelOrderPrint(BinaryTree root) {
	    Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
	    System.out.print("\t");
	    BinaryTree mark = new BinaryTree(0);
	    
	    if (root != null) {
	    	queue.add(root);
	    	queue.add(mark);
	    }
	    
	    while (!queue.isEmpty()) {
	    	BinaryTree temp = queue.poll();
	    	System.out.print("\t\t");
	        if(temp != mark) {
	            System.out.print(temp.value);
	        } else {
	        	 if(queue.isEmpty()){
	                 return;
	             }
	        	 queue.add(mark);
	        	 System.out.println();
	        }
	       
	        if(temp.left != null){
	        	queue.add(temp.left);
	        }
	        if(temp.right != null){
	        	queue.add(temp.right);
	        }
	    }
	}
}
