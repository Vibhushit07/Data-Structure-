package BinarySearchTree;

class insertRecursive {
	Node root;
	
	insertRecursive(){
		root = null;
	}
	
	void insert(int data) {
		this.root = insert(this.root, data);
	}
	
	Node insert(Node node, int data) {
		
		if(node == null) {
			node = new Node(data);
			return node;
		}
		
		if(node.data >= data)
			node.left =  insert(node.left, data);
		else
			node.right = insert(node.right, data);
		
		return node;
	}
	
	void print(Node node) {
		if(node == null) return;
		
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
}

public class bst{
	public static void main(String[] args) {
		
		insertRecursive ir = new insertRecursive();
		
		ir.insert(50); 
        ir.insert(30); 
        ir.insert(20); 
        ir.insert(40); 
        ir.insert(70); 
        ir.insert(60); 
        ir.insert(80); 

		ir.print(ir.root);
        
	}
}