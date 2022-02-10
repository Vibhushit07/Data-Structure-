package queue;

class MyDequee {
	
	int arr[];
	int front, size;
	
	public MyDequee(int cap) {
		this.arr = new int[cap];
	}
	
	public boolean isFull() {
		return this.size == arr.length;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void insertFront(int data) {
		
		if(this.isFull()) {
			System.out.println("Deque is full");
			return;
		}
		
		if(this.front == 0) {
			this.front = this.arr.length - 1;
			this.arr[this.front] = data;
		} else {
			this.arr[(--this.front) % this.arr.length] = data;
		}
		
		this.size++;
	}
}

public class Dequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
