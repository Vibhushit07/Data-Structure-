package queue;

class MyDequee {
	
	int arr[];
	int front, size;
	
	public MyDequee(int cap) {
		arr = new int[cap];
	}
	
	public boolean isFull() {
		return size == arr.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return this.size;
	}
}

public class Dequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
