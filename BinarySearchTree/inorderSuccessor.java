package BinarySearchTree;

public class inorderSuccessor {
	
	public static Node getMin(Node root) {
		if(root == null) return root;
		
		while(root.left != null) {
			root = root.left;
		}
		
		return root;
	}

	public static Node getInorderSuccessor(Node root, int val) {
		if(root == null) return root;
		
		Node successor = null;
		 while(root != null) {
			 if(val < root.data) {
				 successor = root;
				 root = root.left;
			 } else if(val > root.data) {
				 root = root.right;
			 } else {
				 if(root.right != null) {
					 successor = getMin(root.right);
				 }
				 
				 return successor;
			 }
		 }
		 
		 return null;
		
	}
	
	public static void printSuccessor(Node node) {
		if(node != null) {
			System.out.println(node.data);
		} else {
			System.out.println(node);
		}
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
		
		Node successor = getInorderSuccessor(tree.root, 14);
		printSuccessor(successor);
		
		successor = getInorderSuccessor(tree.root, 9);
		printSuccessor(successor);
		
		successor = getInorderSuccessor(tree.root, 8);
		printSuccessor(successor);
		
	}

}
