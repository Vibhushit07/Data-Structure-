package sorting;

import java.util.Scanner;

public class MergeIterative {

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

	public static void sort(int arr[]) {
		
		for(int i = 1; i < arr.length; i *= 2) {
			for(int left = 0; left < arr.length-1; left += 2 * i) {
				
				int middle = Math.min(arr.length-1, left + i - 1);
				int right = Math.min(arr.length-1, left + 2*i - 1);
				merge(arr, left, middle, right);
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
