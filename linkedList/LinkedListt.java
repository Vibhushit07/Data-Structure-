package linkedList;

class MyLinkedListt{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertAtEnd(int data) {
		
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
		} else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = node;
		}
	}
	
	public void insertAtHead(int data) {
		
		Node node = new Node(data);
		
		node.next = head;
		head = node;
	}
	
	public void insertAtPosition(int pos, int data) {
		
		Node node = new Node(data);
		
		if(pos < 0) {
			
			System.out.println("Invalid position");
			
		} else if(pos == 0) {
			
			node.next = head;
			head = node;
			
		} else {
			
			int i = 0;
			Node temp = head;
			
			while(temp != null && i < pos-1) {
				temp = temp.next;
				i++;
			}
			
			if(temp.next == null) {
				System.out.println("Invalid Position");
			} else {
			
				node.next = temp.next;
				temp.next = node;
			}
		}
	}
	
	public void printList() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println();
	}
	
}

public class LinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyLinkedListt ll = new MyLinkedListt();
		
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
	
		ll.printList();
		
		ll.insertAtHead(0);
		
		ll.printList();
		
		ll.insertAtPosition(1, 4);
		ll.insertAtPosition(-1, 0);
		ll.insertAtPosition(7, 9);
		ll.insertAtPosition(6, 9);
		
		ll.printList();
		
	}

}
