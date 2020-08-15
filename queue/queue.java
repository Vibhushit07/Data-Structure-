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
	
	public int dequeue() {
		if(this.front == this.rear) {
			System.out.println("Underflow");
			return -1;
		}
		
		int delete = this.arr[this.front];
		
		for(int i = this.front; i < this.rear - 1; i++) {
			this.arr[i] = this.arr[i+1];
		}
		
		this.rear--;
		
		return delete;	
	}
	
	public int peek() {
		if(this.front == this.rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		return this.arr[this.front];
	}
	
	public boolean isEmpty() {
		return this.front == this.rear;
	}
	
	public int size() {
		return this.rear;
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
		MyQueue mq = new MyQueue();
		
		for(int i = 0; i <= 10; i++) {
			mq.enqueue(i);
		}
		
		mq.printQueue();
		
		System.out.println(mq.dequeue());
		
		mq.printQueue();
		
		System.out.println(mq.peek());
		
		System.out.println(mq.isEmpty());
		
		System.out.println(mq.size());
	}

}
