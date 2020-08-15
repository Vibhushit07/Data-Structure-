package queue;

class MyQueue {
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	
	MyQueue () {
		arr = new int[10];
		front = 0;
		rear = 0;
		capacity = 10;
	}
	
	public void enqueue(int data) {
		if(this.rear == this.capacity) {
			System.out.println("Overflow");
			return;
		}
		
		this.arr[this.rear++] = data;
	}
	
	public void printQueue () {
		if(this.front == this.rear) {
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i = this.front; i < this.rear; i++) {
			System.out.print(this.arr[i] + " ");
		}
		
		System.out.println();
	}
}

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue my = new MyQueue();
		
		for(int i = 0; i <= 10; i++) {
			my.enqueue(i);
		}
		
		my.printQueue();

	}

}
