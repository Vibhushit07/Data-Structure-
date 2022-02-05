package circularLinkedList;

import org.w3c.dom.Node;

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
	
//	public void printList() {
//		
//		Node temp = this.head;
//		
//		do {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		} while(temp != this.head);
//		
//		System.out.println();
//	}
}

public class CircularLinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCircularLinkedListt cl = new MyCircularLinkedListt();
		
		cl.insertAtBeginNaive(1);
		cl.insertAtBeginNaive(2);
		cl.insertAtBeginNaive(3);
		cl.insertAtBeginNaive(4);
		
//		cl.printList();
	}

}
