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
	}

}
