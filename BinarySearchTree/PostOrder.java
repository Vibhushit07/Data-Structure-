package BinarySearchTree;

class postOrderRecursive{
	void print(Node node) {
		if(node == null) {
			return;
		}
		
		print(node.left);
		print(node.right);
		System.out.print(node.data + " ");
	}
}

public class PostOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postOrderRecursive po = new postOrderRecursive();
		
		bst tree = new bst();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        
        po.print(tree.root);
	}

}
