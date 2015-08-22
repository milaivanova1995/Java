package exercise5_Tree;

import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		String data = null, choice = null;
		
		TreeNode<String> root = new TreeNode<String>(data); 
		TreeNode<String> childNode = null;
		TreeNode<String> grandchildNode = null;
		
		System.out.print("Would you like to add children of the root? y/n: ");
		choice = input.nextLine();
		if (choice.contains("y")) {
			childNode = new TreeNode<String>(data, root);
		} else if (choice.contains("n")) {
			System.out.println("Root depth: " + depth(root));
			return;
		}
			
			
			
			System.out.print("Would you like to add grandchildren of the root? y/n: ");
			choice = input.nextLine();
			if (choice.contains("y")) {
				grandchildNode = new TreeNode<String>(data, childNode); 
			} else if (choice.contains("n")) {
				System.out.println("Parent depth: " + depth(root));
				System.out.println("Child depth: " + depth(childNode));	

				return;
			}
		
		
		
		System.out.println("Root depth: " + depth(root));
		System.out.println("Child depth: " + depth(childNode));
		System.out.println("Grandchild depth: " + depth(grandchildNode));
		

		input.close();
	}
	
	public static int depth(TreeNode<String> temp){
    	int depth = 0;
    	if(temp.parent == null) {
    		return depth;
    	} else {
    		while(temp.parent != null){
    			depth++;
    			temp = temp.parent;
    		}
    		return depth;
    	}
    }
	
}
