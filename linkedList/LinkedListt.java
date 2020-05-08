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
	
		MyLinkedListt ll1 = new MyLinkedListt();
		MyLinkedListt ll2 = new MyLinkedListt();
		
		ll1.insertAtEnd(1);
		ll1.insertAtEnd(2);
		ll1.insertAtEnd(3);
		ll1.insertAtEnd(4);
		ll1.insertAtEnd(5);
		
		ll2.insertAtEnd(6);
		ll2.insertAtEnd(7);
		ll2.insertAtEnd(8);
		ll2.insertAtEnd(9);
		ll2.insertAtEnd(10);
	
		ll1.printList();
		System.out.println();
		ll2.printList();
		
	}

}
