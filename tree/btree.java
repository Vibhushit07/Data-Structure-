package tree;


/**
 * 	 Tree will look like this
 * 
 *         2
 *       /   \
 *      3     5
 *       \   /
 *        9 7
 */

import java.util.*;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree {
	Node root;
	
	BinaryTree(){
		this.root = null;
	}
	
	BinaryTree(int data) {
		this.root = new Node(data);
	}
	
	// to calculate number of nodes in a tree
	int countNodes(Node root) { 
		if(root != null)
			return 1 + countNodes(root.left) + countNodes(root.right);
		return 0;
	}
	
	// to calculate leaf nodes
	int leafNodes(Node root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		return leafNodes(root.left) + leafNodes(root.right);
	}
	
	// to calculate height of tree 
	int height(Node root) {
		if(root == null) return -1;
		
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	// print elements at given level
	void printAtLevel(Node root, int level) {
		if(root == null) return;
		
		if(level == 1) {
			System.out.print(root.data + " ");
			return;
		}
		
		printAtLevel(root.left, level-1);
		printAtLevel(root.right, level-1);
	}
}

public class btree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//explicit linking
		BinaryTree bt = new BinaryTree(2); // BinaryTree with root node 2
		bt.root.left = new Node(3);
		bt.root.right = new Node(5);
		bt.root.left.right = new Node(9);
		bt.root.right.left = new Node(7);
		
		System.out.println("Number of node in a binary tree: " + bt.countNodes(bt.root));
		
		System.out.println("Leaf Nodes: " + bt.leafNodes(bt.root));
		
		System.out.println("Height of tree: " + bt.height(bt.root));
		
		System.out.println("Elements At level 1: " );
		bt.printAtLevel(bt.root, 1);
		System.out.println();
		
		System.out.println("Elements At level 2: " );
		bt.printAtLevel(bt.root, 2);
		System.out.println();
		
		System.out.println("Elements At level 3: " );
		bt.printAtLevel(bt.root, 3);
		System.out.println();
	}
}