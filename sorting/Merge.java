package sorting;

import java.util.Scanner;

public class Merge {
	
	public static void merge(int arr[], int left, int middle, int right) {
		
		int leftLength = middle - left + 1;
		int rightLength = right - middle;
		
		int Left[] = new int[leftLength];
		int Right[] = new int[rightLength];
		
		for(int i = 0; i < leftLength; i++) {
			Left[i] = arr[left+i];
		}
		
		for(int i = 0; i < rightLength; i++) {
			Right[i] = arr[middle + i + 1];
		}
		
		int i = 0, j = 0, k = left;
		
		while(i < leftLength && j < rightLength) {
			if(Left[i] < Right[j]) {
				arr[k++] = Left[i++];
			} else {
				arr[k++] = Right[j++];
			}
		}
		
		while(i < leftLength) {
			arr[k++] = Left[i++];
		}
		
		while(j < rightLength) {
			arr[k++] = Right[j++];
		}
	}

	public static void sort(int arr[], int left, int right) {
		
		if(left < right) {
			int middle = (left + right) / 2;
			
			sort(arr, left, middle);
			sort(arr, middle+1, right);
			
			merge(arr, left, middle, right);
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
		
		sort(arr, 0, arr.length-1);
		print(arr);
	}

}
