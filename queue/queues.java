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
	
	public void enqueue(int data) {
		
		Node newNode = new Node(data);
		
		if(this.front == null) {
			this.front = newNode;
			this.rear = newNode;
			
		} else {
			this.rear.next = newNode;
			this.rear = newNode;
		}
	}
	
	public void printQueue() {
		Node temp = this.front;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println();
	}
}

public class queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueues mq = new MyQueues();
		
		for(int i = 0; i < 5; i++) {
			mq.enqueue(i);
		}
		
		mq.printQueue();
	}
}