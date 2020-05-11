package searching;

import java.util.*;


public class linearSearch {
	
	public static int search(int arr[], int element) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to enter");
		
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
