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
//class Pair {
//	int data;
//	int level;
//	
//	Pair(int data, int level) {
//		this.data = data;
//		this.level = level;
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
//	void view(Node root) {
//		
//		Stack<Node> s1 = new Stack<>();
//		Stack<Node> s2 = new Stack<>();
//		
//		s1.push(root);
//		 
//		while(!s1.isEmpty() || !s2.isEmpty()) {
//			
//			while(!s1.isEmpty()) {
//				Node node = s1.pop();
//				System.out.print(node.data + " ");
//				
//				if(node.right != null)
//					s2.push(node.right);
//				if(node.left != null)
//					s2.push(node.left);
//			}
//			
//			while(!s2.isEmpty()) {
//				Node node = s2.pop();
//				System.out.print(node.data + " ");
//				
//				if(node.left != null)
//					s1.push(node.left);
//				if(node.right != null)
//					s1.push(node.right);
//			}
//		}
//	}
//	
//}
//
//public class spiralView {
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
//		System.out.println("Spiral View");
//		bt.view(bt.root);
//	}
//}