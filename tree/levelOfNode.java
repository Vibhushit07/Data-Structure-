//package tree;
//
///**
// * 	 Tree will look like this
// * 
// *         2
// *       /   \
// *      3     5
// *       \   /
// *        9 7
// */
//
//import java.util.*;
//
//class Node {
//	int data;
//	Node left;
//	Node right;
//	
//	Node(int data){
//		this.data = data;
//		this.left = null;
//		this.right = null;
//	}
//}
//
//class BinaryTree {
//	Node root;
//	
//	BinaryTree(){
//		this.root = null;
//	}
//	
//	BinaryTree(int data) {
//		this.root = new Node(data);
//	}
//	
//	int level(int nodeValue) {
//		
//		if(root == null) return -1;
//		
//		Queue<Node> q = new LinkedList<>();
//		q.add(this.root);
//		q.add(null);
//		int level = 0;
//		
//		while(!q.isEmpty()) {
//			Node node = q.remove();
//			if(node == null && !q.isEmpty()) {
//				q.add(null);
//				level++;
//			}
//			
//			if(node != null) {
//				
//				if(node.data == nodeValue) return level+1;
//				
//				if(node.left != null)
//					q.add(node.left);
//				if(node.right != null)
//					q.add(node.right);
//			}
//		}
//		
//		return -1;
//	}
//	
//}
//
//public class levelOfNode {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//explicit linking
//		BinaryTree bt = new BinaryTree(2); // BinaryTree with root node 2
//		bt.root.left = new Node(3);
//		bt.root.right = new Node(5);
//		bt.root.left.right = new Node(9);
//		bt.root.right.left = new Node(7);
//		
//		System.out.println(bt.level(5));
//	}
//}