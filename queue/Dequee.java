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
	
	public void insertRear(int data) {
		
		if(this.isFull()) {
			System.out.println("Deque is full");
			return;
		}
		
		this.arr[(this.front + this.size++) % this.arr.length] = data;
	}
	
	public void deleteFront() {
		
		if(this.isEmpty()) {
			System.out.println("Deque is empty");
		} else {
			this.front = (this.front + 1) % this.arr.length;
			this.size--;
		}
	}
	
	public void deleteRear() {
		
		if(this.isEmpty()) {
			System.out.println("Deque is empty");
		} else {
			this.size--;
		}
	}
	
	public void printDeque() {
		
		for(int i = 0; i < this.size; i++) {
			System.out.print(this.arr[(this.front + i) % this.arr.length] + " ");
		}
		
		System.out.println();
	}
}

public class Dequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDequee md = new MyDequee(6);
		
		md.insertFront(1);
		md.insertFront(2);
		md.printDeque();
		System.out.println(md.getSize());
		
		md.insertRear(3);
		md.printDeque();
		System.out.println(md.getSize());
		
		md.deleteFront();
		md.printDeque();
		System.out.println(md.getSize());
		
		md.deleteRear();
		md.printDeque();
		System.out.println(md.getSize());

	}

}
