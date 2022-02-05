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
			
			while(temp != this.head) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			newNode.next = this.head;
		}
		
		this.head = newNode;
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
	}

}
