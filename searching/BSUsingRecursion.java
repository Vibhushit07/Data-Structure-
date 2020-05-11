package searching;

import java.util.*;

public class BSUsingRecursion {
	
	public static int searchUtil(int arr[], int element, int left, int right) {
		
		int mid = (left + right) / 2;
		
		if(left > right)
			return -1;
		
		if(arr[mid] == element) {
			return mid;
			
		} else if(arr[mid] < element) {
			return searchUtil(arr, element, mid+1, right);
			
		} else {
			return searchUtil(arr, element, left, mid-1);
		}
		
	}
	
	public static int search(int arr[], int element) {
		
		Arrays.sort(arr);
		
		return searchUtil(arr, element, 0, arr.length-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to enter");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements");
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the element to be searched");
		
		int element = sc.nextInt();
		
		System.out.println("Index of element is: " + search(arr, element));
	}
}
