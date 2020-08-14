package stack;

class MyStacks {
	
	Node top;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	MyStacks() {
		this.top = null;
	}
	
	public void push(int data) {
		Node temp = new Node(data);
		
		if(this.top == null) {
			this.top = temp;
			
		} else {
			temp.next = this.top;
			this.top = temp;
		}
	}
	
	public int pop() {
		if(this.top == null) {
			return -1;
		}
		
		int data = this.top.data;
		this.top = this.top.next;
		return data;
	}
	
	public int peek() {
		return this.top == null ? -1 : this.top.data;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public void printStack() {
		Node temp = this.top;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStacks ms = new MyStacks();
		
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.push(5);
		
		ms.printStack();
		
		System.out.println(ms.pop());
		ms.printStack();
		
		System.out.println(ms.peek());
		
		System.out.println(ms.isEmpty());
	}

}
