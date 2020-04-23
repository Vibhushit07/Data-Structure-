package arraylist;

import java.util.*;

class MyArrayList{
	private int arr[];   
	private int length;       // contains the length of array 
	private int capacity;     // contains max size of array
	
	// Constructor to declare array of size 10
	public MyArrayList(){
		arr = new int[10];      // declaring array
		length = 0;				// initializing length variable
		capacity = 10;          // initializing capacity variable
	}
	
	// Constructor to declare array of specified size 
	public MyArrayList(int capacity) {
		arr = new int[capacity];   // declaring array
		this.capacity = capacity;  // initializing capacity variable
		length = 0;                // initializing length of array
	}
	
	// Method to add element at the end of array
	public void add(int element) {
		if(length == capacity) 
			increaseSize();
		arr[length++] = element;
	
	}
	
	// function to add element at specified index 
	public void add(int index, int element) {
		if(length == capacity)
			increaseSize();
		for(int i = length; i > index; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[index] = element;
		length++;
	}
	
	private void increaseSize() {
		int newArr[] = new int[this.capacity];
		for(int i = 0; i < length; i++) {
			newArr[i] = this.arr[i];
		}
		
		this.capacity = this.capacity + this.capacity * 3 / 2;
		
		this.arr = new int[capacity];
		
		for(int i = 0; i < length; i++) {
			this.arr[i] = newArr[i];
		}
	}
	
	public void set(int index, int element) {
		if(index >= 0 && index < length)  
			arr[index] = element;
		else
			System.out.println(index + " index out of bound");
	}
	
	public int get(int index) {
		if(index >= 0 && index < length)
			return arr[index];
		else
			System.out.println(index + " index out of bound");
		return -1;
	}
	
	public void displayList() {
		System.out.print("[ ");
		for(int i = 0; i < length-1; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		
		System.out.println(this.arr[length-1] + "]");
	}
}


public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		MyArrayList list = new MyArrayList();
		
		System.out.println("Enter number of elements you want to enter");
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		list.displayList();
		
		list.add(1, 2);
		list.displayList();
		
		list.set(0, 0);
		list.displayList();
		
		System.out.println(list.get(0));
		System.out.println(list.get(-2));
		System.out.println(list.get(10));

	}

}
