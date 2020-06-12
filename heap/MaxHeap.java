package heap;

class MaxIntHeap{
	int arr[];
	int size;
	MaxIntHeap(){
		arr = new int[10];
		size = 0;
	}
	
	int getParentIndex(int i) {
		return (i - 1) / 2;
	}
	
	int getLeftChildIndex(int i) {
		return (2 * i + 1);
	}
	
	int getRightChildIndex(int i) {
		return (2 * i + 2);
	}
	
	boolean hasParent(int i) {
		return getParentIndex(i) >= 0;
	}
	
	boolean hasLeftChild(int i) {
		return getLeftChildIndex(i) < size;
	}
	
	boolean hasRightChild(int i) {
		return getRightChildIndex(i) < size;
	}
	
	boolean isEmpty() {
		return size <= 0; // size == 0
	}
	
	int size() {
		return size;
	}
	
	int parent(int index) {
		return arr[getParentIndex(index)];
	}
	
	int leftChild(int index) {
		return arr[getLeftChildIndex(index)];
	}
	
	int rightChild(int index) {
		return arr[getRightChildIndex(index)];
	}
	
	int peek() {
		return arr[0];
	}
	
	void insert(int value) {
		arr[size++] = value;
		heapifyUp();
	}
	
	void heapifyUp() {
		int index = size-1;
		while(hasParent(index) && parent(index) < arr[index]) {
			swap(index, getParentIndex(index));
			index = getParentIndex(index);
		}
	}
	
	void swap(int a, int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	void print() {
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	int poll() {
		int val = arr[0];
		arr[0] = arr[size-1];
		size--;
		heapifyDown();
		return val;
	}
	
	void heapifyDown() {
		int i = 0;
		while(i < size && hasLeftChild(i)) {
			int greaterChildIndex = getLeftChildIndex(i);
			if(hasRightChild(i) && rightChild(i) > leftChild(i)) {
				greaterChildIndex = getRightChildIndex(i);
			}
			if(arr[i] < arr[greaterChildIndex]) {
				swap(i, greaterChildIndex);
			}else {
				break;
			}
			i = greaterChildIndex;
		}
	}
}

public class MaxHeap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxIntHeap mh = new MaxIntHeap();
		mh.insert(10);
		mh.insert(5);
		mh.insert(3);
		mh.insert(2);
		mh.insert(7);
		mh.print();
	}
}