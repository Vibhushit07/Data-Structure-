package arraylist;

import java.util.*;

class MyArrayList{
	private int arr[];   
	private int length;       // contains the length of array 
	private int capacity;     // contains max size of array
	
	// Constructor to declare array of size 10
	public MyArrayList(){
		this.arr = new int[10];      // declaring array
		this.length = 0;				// initializing length variable
		this.capacity = 10;          // initializing capacity variable
	}
	
	// Constructor to declare array of specified size 
	public MyArrayList(int capacity) {
		this.arr = new int[capacity];   // declaring array
		this.capacity = capacity;  // initializing capacity variable
		this.length = 0;                // initializing length of array
	}
	
	// Method to add element at the end of array
	public void add(int element) {
		if(this.length == this.capacity) 
			increaseSize();
		this.arr[this.length++] = element;
	
	}
	
	// function to add element at specified index 
	public void add(int index, int element) {
		if(this.length == this.capacity)
			increaseSize();
		for(int i = this.length; i > index; i--) {
			this.arr[i] = this.arr[i-1];
		}
		
		this.arr[index] = element;
		this.length++;
	}
	
	private void increaseSize() {
		int newArr[] = new int[this.capacity];
		for(int i = 0; i < this.length; i++) {
			newArr[i] = this.arr[i];
		}
		
		this.capacity = this.capacity + this.capacity * 3 / 2;
		
		this.arr = new int[this.capacity];
		
		for(int i = 0; i < this.length; i++) {
			this.arr[i] = newArr[i];
		}
	}
	
	public void set(int index, int element) {
		if(index >= 0 && index < this.length)  
			this.arr[index] = element;
		else
			System.out.println(index + " index out of bound");
	}
	
	public int get(int index) {
		if(index >= 0 && index < this.length)
			return this.arr[index];
		else
			System.out.println(index + " index out of bound");
		return -1;
	}
	
	public int size() {
		return this.length;
	}
	
	public int indexOf(int element) {
		for(int i = 0; i < this.length; i++) {
			if(this.arr[i] == element)
				return i;
		}
		
		return -1;
	}
	
	public boolean contains(int element) {
		for(int i = 0; i < this.length; i++) {
			if(this.arr[i] == element)
				return true;
		}
		
		return false;
	}
	
	public void displayList() {
		System.out.print("[ ");
		for(int i = 0; i < this.length-1; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		
		System.out.println(this.arr[this.length-1] + "]");
	}
}


public class arrayList {

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
