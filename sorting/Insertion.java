package sorting;

import java.util.Scanner;

public class Insertion {

	public static void sort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			int temp = arr[i];
			int j = 0;
			for(j = i-1; j >= 0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
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
