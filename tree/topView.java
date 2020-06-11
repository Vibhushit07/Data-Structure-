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

class Pair {
	int data;
	int level;
	
	Pair(int data, int level) {
		this.data = data;
		this.level = level;
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
	
	void view(Node root, int level) {
		if(root == null) return;
		
		TreeMap<Integer, Pair> map = new TreeMap<>();
		
		viewUtil(root, 0, 0, map);
		
		for(Integer i : map.keySet()) {
			System.out.print(map.get(i).data + " ");
		}
	}
	
	void viewUtil(Node root, int dist, int level, TreeMap<Integer, Pair> map) {
		if(root == null) return;
		
		if(!map.containsKey(dist)) {
			map.put(dist, new Pair(root.data, level));
		} else {
			if(map.get(dist).level > level) {
				map.put(dist, new Pair(root.data, level));
			}
		}
		
		viewUtil(root.left, dist-1, level+1, map);
		viewUtil(root.right, dist+1, level+1, map);
	}
	
}

public class topView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//explicit linking
		BinaryTree bt = new BinaryTree(2); // BinaryTree with root node 2
		bt.root.left = new Node(3);
		bt.root.right = new Node(5);
		bt.root.left.right = new Node(9);
		bt.root.right.left = new Node(7);
		
		System.out.println("Top View");
		bt.view(bt.root, 1);
	}
}