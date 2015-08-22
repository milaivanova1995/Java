package exercise5_Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
	
	List<TreeNode<T>> children = new ArrayList<TreeNode<T>>();
	TreeNode<T> parent = null;
    T data = null;

    public TreeNode(T data){
        this.data = data;
    }

    public TreeNode(T data, TreeNode<T> parent){
        this.data = data;
        this.parent = parent;
    }

    public List<TreeNode<T>> getChildren(){
        return children;
    }

    public void setParent(TreeNode<T> parent){
        parent.addChild(this);
        this.parent = parent;
    }

    public void addChild(T data){
    	TreeNode<T> child = new TreeNode<T>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(TreeNode<T> child){
        child.setParent(this);
        this.children.add(child);
    }

    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }

    public boolean isRoot(){
        return (this.parent == null);
    }

    public boolean isLeaf(){
        if(this.children.size() == 0) 
            return true;
        else 
            return false;
    }

    public void removeParent(){
        this.parent = null;
    }
    
} 






