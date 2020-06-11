package BinarySearchTree;

import java.util.*;

class inorderRecursive{
	void print(Node node) {
		if(node == null) {
			return;
		}
		
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
}

class inorderIterative{
	void print(Node node) {
		if(node == null) {
			return;
		}
		
		Node curr = node;
		
		Stack<Node> stack = new Stack<>();
		
		while(curr != null || !stack.isEmpty()) {
			while(curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			
			curr = stack.pop(); 
			System.out.print(curr.data + " ");
			
			curr = curr.right; 
		}
	}
}

public class Inorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inorderRecursive in = new inorderRecursive();
		
		bst tree = new bst();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        
        in.print(tree.root);
        
        inorderIterative inT = new inorderIterative();
        
        bst tree1 = new bst();
		tree1.insert(5); 
        tree1.insert(3); 
        tree1.insert(2); 
        tree1.insert(4); 
        tree1.insert(7); 
        tree1.insert(6); 
        tree1.insert(8);
        
        System.out.println();
        inT.print(tree1.root);
	}

}
