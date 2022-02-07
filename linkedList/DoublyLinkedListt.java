package linkedList;

class MyDoublyLinkedListt {
	
	Node head;
	Node tail;
	int size = 0;
	
	static class Node {
		int data;
		Node prev;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = prev = null;
		}
	}
	
	// insert at beginning of DLL using head node
	public void insertAtBegin(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.head.prev = newNode;
			newNode.next = this.head;
			this.head = newNode;
		}
		
		this.size++;
	}
	
	// insert at end of DLL using head node
	public void insertAtEnd(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			
			Node curr = this.head;
			
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = newNode;
			newNode.prev = curr;
			this.tail = newNode;
		}
		
		this.size++;
	}
	
	// insert at end of DLL using tail node
	public void insertAtEndTail(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			
			this.tail.next = newNode;
			newNode.prev = this.tail;
			this.tail = newNode;
		}
		
		this.size++;
	}
	
	public void deleteHead() {
		
		if(this.head != null) {
		
			if(this.head.next == null) { 
				this.head = null;
				this.tail = null;
			}
			
			else {
				this.head = this.head.next;
				this.head.prev = null;
			}
			
			this.size--;
		}
	}
	
	// delete at end of DLL using head node
	public void deleteLast() {
		
		if(this.head != null) {
			
			if(this.head.next == null) { 
				this.head = null;
				this.tail = null;
			}
			
			else {
				
				Node curr = this.head;
				
				while(curr.next != null) {
					curr = curr.next;
				}
				
				this.tail = curr.prev;
				curr.prev.next = null;
			}
			
			this.size--;
		}
	}
	
	// delete at end of DLL using tail node
		public void deleteLastTail() {
			
			if(this.head != null) {
				
				if(this.head.next == null) { 
					this.head = null;
					this.tail = null;
				}
				
				else {
					
					this.tail = this.tail.prev;
					this.tail.next = null;
				}
				
				this.size--;
			}
		}
	
	public int getSize() {
		return this.size;
	}
	
	public void printDLL() {
		
		Node curr = this.head;
		
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
		System.out.println();
	}
}

public class DoublyLinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDoublyLinkedListt dll = new MyDoublyLinkedListt();
		
		dll.insertAtBegin(1);
		dll.insertAtBegin(2);
		dll.printDLL();
		System.out.println(dll.getSize());
		
		dll.insertAtEnd(3);
		dll.printDLL();
		System.out.println(dll.getSize());
		
		dll.deleteHead();
		dll.printDLL();
		System.out.println(dll.getSize());
		
		dll.deleteLast();
		dll.printDLL();
		System.out.println(dll.getSize());
		
		dll.insertAtEndTail(2);
		dll.printDLL();
		System.out.println(dll.getSize());
		
		dll.deleteLastTail();
		dll.printDLL();
		System.out.println(dll.getSize());
	}

}
