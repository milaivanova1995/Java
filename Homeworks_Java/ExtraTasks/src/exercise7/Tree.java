package exercise7;

import java.util.LinkedList;
import java.util.List;

public class Tree {
	
	protected int data;
	Tree parent;
	List<Tree> children = new LinkedList<Tree>();
	
	public Tree(int data) {
		this.data = data;
	}
	
	public Tree addChild(int data) {
		Tree child = new Tree(data);
		child.parent = this;
		this.children.add(child);
		return child;
	}
	
	public void bfs(Tree node) {
		if (node.children.size() == 0) {
			return;
		}
		if (node.parent == null) {
			System.out.print(node.data + " ");
		}
		
		for (int i = 0; i < node.children.size(); i++) {
			System.out.print(node.children.get(i).data + " ");
		}
		
		for (int i = 0; i < node.children.size(); i++) {
			bfs(node.children.get(i));
		}
	}

}
