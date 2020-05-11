package linkedList;

class MyLinkedListt{
	
	Node head;
	int size = 0;
	
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
			this.head = node;
		} else {
			Node temp = this.head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = node;
		}
		
		this.size++;
	}
	
	public void insertAtHead(int data) {
		
		Node node = new Node(data);
		
		node.next = head;
		this.head = node;
		this.size++;
	}
	
	public void insertAtPosition(int pos, int data) {
		
		Node node = new Node(data);
		
		if(pos < 0) {
			
			System.out.println("Invalid position");
			
		} else if(pos == 0) {
			
			node.next = head;
			this.head = node;
			this.size++;
			
		} else {
			
			int i = 0;
			Node temp = this.head;
			
			while(temp != null && i < pos-1) {
				temp = temp.next;
				i++;
			}
			
			if(temp.next == null) {
				System.out.println("Invalid Position");
			} else {
			
				node.next = temp.next;
				temp.next = node;
				this.size++;
			}
		}
	}
	
	public int size() {	return this.size; }
	
	public void clear() { this.head = null; }
	
	public boolean contains(int element) {
		
		Node temp = this.head;
		
		while(temp != null) {
			if(temp.data == element)
				return true;
			temp = temp.next;
		}
		
		return false;
	}
	
	public int getFirst() { 
		
		if(this.head == null)
			return -1;
		
		return this.head.data; 
		
	}
	
	public int getLast() {
		
		if(this.head == null)
			return -1;
		
		Node temp = this.head;
		
		while(temp.next != null)
			temp = temp.next;
		
		return temp.data;
	}
	
	public void remove() {
		if(this.head != null)
			this.head = this.head.next;
	}
	
	public void removeLast() {
		Node prev = null;
		Node curr = this.head;
		
		if(head == null) {
			return;
			
		} else if(this.head.next == null) {
			this.head = null;
			
		} else {
		
			while(curr.next != null) {
				prev = curr;
				curr = curr.next;
			}
			
			prev.next = null;
		}
	}
	
	public int indexOf(int element) {
		
		int index = 0;
		
		Node curr = this.head;
		
		while(curr != null) {
			
			if(curr.data == element) return index;
			
			index++;
			curr = curr.next;
		}
		
		return -1;
	}
	
	public void printList() {
		
		Node temp = this.head;
		
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
		
		System.out.println(ll.size());
		
//		ll.clear();
//		ll.printList();
		
		System.out.println(ll.contains(9));
		System.out.println(ll.contains(-1));
		
		System.out.println(ll.getFirst());
		
		System.out.println(ll.getLast());
		
		ll.remove();
		ll.printList();
		
		ll.removeLast();
		ll.printList();
		
		System.out.println(ll.indexOf(2));
		System.out.println(ll.indexOf(0));
		
	}

}
