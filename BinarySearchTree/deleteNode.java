package BinarySearchTree;


/**
 * 
 *  Case 1 - Leaf Node
 *  	if node is left child of its parent node then make its left child null
 *  	else make its right child null
 *  
 *  Case 2 - Node has 1 child
 *  	connect node's parent and node's child
 *  
 *  Case 3 - Node has 2 child
 *  	replace it with largest node in it's left sub-tree or
 *  	replace it with smallest node in it's right sub-tree 
 *
 */

public class deleteNode {

	static int getMinValue(Node root) {
		if(root == null) return -1;
		
		if(root.left == null) return root.data;
		
		return getMinValue(root.left);
	}
	
	static Node deleteNode(Node root, int data) {
		
		if(root == null) return null;
		
		if(data < root.data) {
			root.left = deleteNode(root.left, data);
		} else if(data > root.data) {
			root.right = deleteNode(root.right, data);
		} else {
			// leaf node or node having 1 child
			if(root.left == null) return root.right;
			if(root.right == null) return root.left;
			
			// node having 2 children
			root.data = getMinValue(root.right);
			root.right = deleteNode(root.right, root.data);
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bst tree = new bst();
		
		tree.insert(8);
		tree.insert(3);
		tree.insert(10);
		tree.insert(1);
		tree.insert(6);
		tree.insert(14);
		tree.insert(4);
		tree.insert(7);
		tree.insert(13);
		tree.print(tree.root);
		
		System.out.println();
		
		deleteNode(tree.root, 10);
		tree.print(tree.root);
		
		
		
	}

}
