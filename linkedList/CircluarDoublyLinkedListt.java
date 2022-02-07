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
			this.head = newNode;
		} else {
			
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
		}
		
		this.size++;
	}
}

public class CircluarDoublyLinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
