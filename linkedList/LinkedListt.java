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
		
		if(head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public void printList() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
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
		
		
	}

}
