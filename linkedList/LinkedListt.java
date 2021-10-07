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
	
	/*if head is NULL then assign node to head 
	else iterate to the last node and append the new node after last node.*/
	
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
	
	public int get(int index) {
		
		if(index < 0)
			return -1;
		
		int i = 0;
		Node curr = head;
		
		while(curr != null) {
			
			if(i == index)
				return curr.data;
			
			i++;
			curr = curr.next;
		}
		
		return -1;
		
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
	
	public void remove(int index) {
		
		if(index < 0) {
			System.out.println("Index is invalid");
		
		}else if(index == 0) {
			this.head = this.head.next;
			
		}else {
		
			Node curr = this.head;
			Node prev = null;
			int i = 0;
		
			while(curr != null && i < index) {
				i++;
				prev = curr;
				curr = curr.next;
			}
			
			if(curr == null) {
				System.out.println("Invalid index");
			} else {
				prev.next = curr.next;
			}
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
	
	public void set(int index, int element) {
		
		if(index < 0) {
			System.out.println("Invlaid index");
		} else {
			int i = 0;
			Node curr = this.head;
			
			while(curr != null && i < index) {
				i++;
				curr = curr.next;
			}
			
			if(curr == null) {
				System.out.println("Invalid index");
			} else {
				curr.data = element;
			}
		}
		
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
		
		System.out.println(ll.get(3));
		System.out.println(ll.get(-1));
		
		ll.remove(0);
		ll.printList();
		ll.remove(-1);
		ll.remove(10);
		
		ll.set(0, 10);
		ll.set(3, 9);
		ll.set(10, 10);
		ll.set(-1, 0);
		ll.printList();
		
	}

}
