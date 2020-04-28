package arraylist;

class MyGenericArrayList<T>{
	private Object arr[];   
	private int length;       // contains the length of array 
	private int capacity;     // contains max size of array
	
	// Constructor to declare array of size 10
	public MyGenericArrayList(){
		arr = new Object[10];      // declaring array
		length = 0;				   // initializing length variable
		capacity = 10;             // initializing capacity variable
	}
	
	// Constructor to declare array of specified size 
	public MyGenericArrayList(int capacity) {
		arr = new Object[capacity];   // declaring array
		this.capacity = capacity;  // initializing capacity variable
		length = 0;                // initializing length of array
	}
	
	// Method to add element at the end of array
	public void add(T element) {
		if(length == capacity) 
			increaseSize();
		arr[length++] = element;
	
	}
	
	// function to add element at specified index 
	public void add(int index, T element) {
		if(length == capacity)
			increaseSize();
		for(int i = length; i > index; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[index] = element;
		length++;
	}
	
	private void increaseSize() {
		Object newArr[] = new Object[this.capacity];
		for(int i = 0; i < length; i++) {
			newArr[i] = this.arr[i];
		}
		
		this.capacity = this.capacity + this.capacity * 3 / 2;
		
		this.arr = new Object[capacity];
		
		for(int i = 0; i < length; i++) {
			this.arr[i] = newArr[i];
		}
	}
	
	public void set(int index, Object element) {
		if(index >= 0 && index < length)  
			arr[index] = element;
		else
			System.out.println(index + " index out of bound");
	}
	
	public T get(int index) {
		if(index >= 0 && index < length)
			return (T)arr[index];
		else
			System.out.println(index + " index out of bound");

		return (T)(Object)(-1);
		
	}
	
	public int size() {
		return this.length;
	}
	
	public int indexOf(T element) {
		for(int i = 0; i < this.length; i++) {
			if(arr[i] == element)
				return i;
		}
		
		return -1;
	}
	
	public boolean contains(T element) {
		for(int i = 0; i < this.length; i++) {
			if(arr[i] == element)
				return true;
		}
		
		return false;
	}
	
	public void displayList() {
		System.out.print("[ ");
		for(int i = 0; i < length-1; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		
		System.out.println(this.arr[length-1] + "]");
	}
}

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

MyArrayList list = new MyArrayList();
		
		for(int i = 0; i < 5; i++)
			list.add(i);
		
		list.displayList();
		
		list.add(1, 2);
		list.displayList();
		
		list.set(0, 0);
		list.displayList();
		
		System.out.println(list.get(0));
		System.out.println(list.get(-2));
		System.out.println(list.get(10));
		
		System.out.println(list.size());
		
		System.out.println(list.indexOf(1));
		System.out.println(list.indexOf(-1));
		
		System.out.println(list.contains(1));
		System.out.println(list.contains(-1));
	}

}
