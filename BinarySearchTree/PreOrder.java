package BinarySearchTree;

class preOrderRecursive{
	void print(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.print(node.data + " ");
		print(node.left);
		print(node.right);
	}
}

public class PreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preOrderRecursive pr = new preOrderRecursive();
		
		bst tree = new bst();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        
        pr.print(tree.root);
	}

}
