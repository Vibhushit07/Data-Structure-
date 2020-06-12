package tree;

class Nodee {
	int data;
	Nodee left;
	Nodee right;
	
	Nodee(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinaryTreee {
	Nodee root;
	
	BinaryTreee(){
		this.root = null;
	}
	
	BinaryTreee(int data) {
		this.root = new Nodee(data);
	}
	
	Nodee lca(Nodee root, int n1, int n2) {
		if(root == null) return root;
		
		if(root.data == n1 || root.data == n2) return root;
		
		Nodee leftLca = lca(root.left, n1, n2);
		Nodee rightLca = lca(root.right, n1, n2); 
		
		if(leftLca != null && rightLca != null) return root;
		
		if(leftLca != null) return leftLca;
		
		return rightLca;
	}
}

public class lca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreee bt = new BinaryTreee();
		
		bt.root = new Nodee(1);
		bt.root.left = new Nodee(2);
		bt.root.right = new Nodee(3);
		bt.root.left.left = new Nodee(4);
		bt.root.left.right = new Nodee(5);
		bt.root.right.left = new Nodee(6);
		bt.root.right.right = new Nodee(7);
		
		Nodee node = bt.lca(bt.root, 4, 5);
		
		if(node != null) {
			System.out.println(node.data);
		} else {
			System.out.println("Ancestor not found");
		}
	}

}
