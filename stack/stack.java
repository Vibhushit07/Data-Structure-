package stack;

class MyStack {
	private int arr[];
	private int top;
	private int length;
	
	MyStack() {
		this.arr = new int[10];
		this.top = -1;
		this.length = 10;
	}
	
	public void push(int element) {
		if(this.top == this.length-1) {
			System.out.println("Overflow");
		} else {
			arr[++this.top] = element;
		}
	}
	
	public int pop() {
		if(this.top == -1) {
			System.out.println("Underflow");
			return -1;
		} else {
			return this.arr[this.top--];
		}
	}
	
	public int peek() {
		if(this.top == -1) {
			System.out.println("Underflow");
			return -1;
		} else {
			return this.arr[this.top];
		}
	}
	
	public boolean isEmpty() {
		return this.top < 0;
	}
	
	public int size() {
		return this.top + 1;
	}
	
	public void printStack() {
		for(int i = 0; i <= this.top; i++)
			System.out.print(this.arr[i] + " ");
		System.out.println();
	}
}

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms = new MyStack();
		
		for(int i = 0; i < 10; i++)
			ms.push(i);
		
		ms.printStack();
		
		ms.push(10);
		
		ms.pop();
		
		System.out.println(ms.peek());
		
		System.out.println(ms.isEmpty());
		
		ms.pop();
		
		System.out.println(ms.isEmpty());
		
		System.out.println(ms.size());
	}

}
