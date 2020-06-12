package BinarySearchTree;

public class lca {
	
	static Node lca(Node root, int n1, int n2) {

		if(root == null) return root;

		if(root.data == n1 || root.data == n2) return root;
		
		if(root.data > n1 && root.data < n2) return root;
		if(root.data < n1 && root.data > n2) return root;
		
		if(root.data < n1 && root.data < n2) return lca(root.right, n1, n2);
		if(root.data > n1 && root.data > n2) return lca(root.left, n1, n2);
		
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bst tree = new bst();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        
        Node node = lca(tree.root, 30, 20);
        System.out.println(node.data);
        
	}

}
