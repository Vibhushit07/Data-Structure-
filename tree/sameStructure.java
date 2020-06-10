//package tree;
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
//	boolean isSameStructure(Node root1, Node root2) {
//		
//		if(root1 == null && root2 == null) return true;
//		
//		if(root1 == null || root2 == null) return false;
//		
//		return isSameStructure(root1.left, root2.left) && isSameStructure(root1.right, root2.right);
//	}
//}
//
//public class sameStructure {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		BinaryTree bt = new BinaryTree(2); // BinaryTree with root node 2
//		bt.root.left = new Node(3);
//		bt.root.right = new Node(5);
//		bt.root.left.right = new Node(9);
//		bt.root.right.left = new Node(7);
//		
//		BinaryTree bt1 = new BinaryTree(20); // BinaryTree with root node 2
//		bt1.root.left = new Node(50);
//		bt1.root.right = new Node(33);
//		bt1.root.left.right = new Node(57);
//		bt1.root.right.left = new Node(98);
//		
//		System.out.println(bt.isSameStructure(bt1.root, bt.root));
//	}
//
//}
