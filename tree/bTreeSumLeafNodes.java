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
	
	int sumLNodes(Node root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return root.data;
		return sumLNodes(root.left) + sumLNodes(root.right);
	}
}

public class bTreeSumLeafNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//explicit linking
		BinaryTree bt = new BinaryTree(2); // BinaryTree with root node 2
		bt.root.left = new Node(3);
		bt.root.right = new Node(5);
		bt.root.left.right = new Node(9);
		bt.root.right.left = new Node(7);
		
		System.out.println("Number of node in a binary tree: " + bt.sumLNodes(bt.root));
	}
}
