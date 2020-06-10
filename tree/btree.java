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
	
	void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		
		System.out.println("Level order of Binary Tree");
		while(!q.isEmpty()) {
			Node node = q.remove();
			
			if(node.left != null)
				q.add(node.left);
			if(node.right != null)
				q.add(node.right);
			
			System.out.print(node.data + " ");
		}
		
		System.out.println();
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
		
		bt.levelOrder();
		
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