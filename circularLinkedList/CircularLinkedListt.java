package circularLinkedList;

class MyCircularLinkedListt {
	
	Node head;
	int size = 0;
	
	static class Node {
		
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertAtBeginNaive(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			newNode.next = newNode;
		} else {
			Node temp = this.head;
			
			while(temp.next != this.head) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			newNode.next = this.head;
		}
		
		this.size++;
		this.head = newNode;
	}
	
	public void insertAtBeginEfficient(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			newNode.next = newNode;
			this.head = newNode;
		} else {
			newNode.next = this.head.next;
			this.head.next = newNode;
			
			int t = this.head.data;
			this.head.data = newNode.data;
			newNode.data = t;
		}
		
		this.size++;
	}
	
	public void insertAtEndNaive(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			newNode.next = newNode;
			this.head = newNode;
		} else {
			Node temp = this.head;
			
			while(temp.next != this.head) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			newNode.next = this.head;
		}
		
		this.size++;
		
	}
	
	public void insertAtEndEfficient(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			newNode.next = newNode;
			this.head = newNode;
		} else {
			
			newNode.next = this.head.next;
			this.head.next = newNode;
			
			int t = this.head.data;
			this.head.data = newNode.data;
			newNode.data = t;
			
			this.head = newNode;
		}
		
		this.size++;
	}
	
	public void printList() {
		
		Node temp = this.head;
		
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while(temp != this.head);
		
		System.out.println();
	}
	
}

public class CircularLinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCircularLinkedListt cl = new MyCircularLinkedListt();
		
		cl.insertAtBeginNaive(1);
		cl.insertAtBeginNaive(2);
		cl.insertAtBeginNaive(3);
		cl.insertAtBeginNaive(4);
		
		cl.printList();
		
		cl.insertAtBeginEfficient(5);
		cl.insertAtBeginEfficient(6);
		
		cl.printList();
		
		cl.insertAtEndNaive(7);
		
		cl.printList();
		
		cl.insertAtEndEfficient(8);
		
		cl.printList();
	}

}
