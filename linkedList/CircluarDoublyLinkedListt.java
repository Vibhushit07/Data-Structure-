package linkedList;

class MyCircluarDoublyLinkedListt {
	
	Node head;
	int size = 0;
	
	static class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}
	
	public void insertAtBegin(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			newNode.next = newNode;
			newNode.prev = newNode;
		} else {
			
			this.head.prev.next = newNode;
			newNode.prev = this.head.prev;
			newNode.next = this.head;
			this.head.prev = newNode;
		}
		
		this.head = newNode;
		this.size++;
	}
	
	public void insertAtEnd(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
			newNode.next = newNode.prev = newNode;
		} else {
			
			this.head.prev.next = newNode;
			newNode.prev = this.head.prev;
			
			newNode.next = this.head;
			this.head.prev = newNode;
		}
		
		this.size++;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void printList() {
		
		Node curr = this.head;
		
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while(curr != this.head);
		
		System.out.println();
	}
}

public class CircluarDoublyLinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCircluarDoublyLinkedListt cdll = new MyCircluarDoublyLinkedListt();
		
		cdll.insertAtBegin(1);
		cdll.insertAtBegin(2);
		cdll.insertAtBegin(3);
		cdll.printList();
		System.out.println(cdll.getSize());
		
		cdll.insertAtEnd(4);
		cdll.insertAtEnd(5);
		cdll.printList();
		System.out.println(cdll.getSize());
	}

}
