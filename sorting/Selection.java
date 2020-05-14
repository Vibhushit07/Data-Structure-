package sorting;

import java.util.*;

public class Selection {

	public static void sort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			int min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
			}
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void print(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
		System.out.println("Enter elements");
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sort(arr);
		print(arr);
	}

}
