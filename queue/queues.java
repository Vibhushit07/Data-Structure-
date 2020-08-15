package queue;

class MyQueues {
	
	private Node front;
	private Node rear;
	private int size;
	
	static class Node {
		int data;
		Node next;
		
		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	MyQueues () {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
}

public class queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
