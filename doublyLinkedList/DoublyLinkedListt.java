package doublyLinkedList;

class MyDoublyLinkedListt {
	
	Node head;
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
	
	public void insertAtBegin(int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
		} else {
			this.head.prev = newNode;
			newNode.next = this.head;
			this.head = newNode;
		}
		
		this.size++;
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
	}

}
