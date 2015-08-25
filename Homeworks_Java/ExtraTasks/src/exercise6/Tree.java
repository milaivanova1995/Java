package exercise6;

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
		this.parent = child.parent;
		this.children.add(child);
		return child;
	}
	
	public void dfs(Tree node) {			
		if (node.children.size() != 0) {
			for (int i = 0; i < node.children.size(); i++) {
				dfs(node.children.get(i));
			}
		} else if (node.children.size() == 0) {
			System.out.print(node.data + " ");
			return;
		}
		
		System.out.print(node.data + " ");
	}
}
