package BinarySearchTree;

class inorderRec{
	void print(Node node) {
		if(node == null) {
			return;
		}
		
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
}

public class Inorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inorderRec in = new inorderRec();
		
		bst tree = new bst();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        
        in.print(tree.root);
	}

}
