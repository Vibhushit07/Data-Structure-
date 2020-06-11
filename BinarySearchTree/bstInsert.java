package BinarySearchTree;

class bst {
	Node root;
	
	bst(){
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

class bstt{
	Node root;
	
	bstt(){
		root = null;
	}
	
	void insert(int data) {
		Node newNode = new Node(data);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		Node curr = root;
		Node prev = null;
		
		while(curr != null) {
			prev = curr;
			
			if(data <= curr.data) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		
		if(data <= prev.data) {
			prev.left = newNode;
		} else {
			prev.right = newNode;
		}
	}
	
	void print(Node node) {
		if(node == null) return;
		
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
	
}

public class bstInsert{
	public static void main(String[] args) {
		
		bst ir = new bst();
		ir.insert(50); 
        ir.insert(30); 
        ir.insert(20); 
        ir.insert(40); 
        ir.insert(70); 
        ir.insert(60); 
        ir.insert(80); 
		ir.print(ir.root);
		
		System.out.println();
		
		bstt it = new bstt();
		it.insert(5); 
        it.insert(3); 
        it.insert(2); 
        it.insert(4); 
        it.insert(7); 
        it.insert(6); 
        it.insert(8); 
		it.print(it.root);
        
	}
}