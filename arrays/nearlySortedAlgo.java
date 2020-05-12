package arrays;

import java.util.*;

class nearlySortedAlgo{
	public static void main (String[] args){
	 
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0){
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int arr[] = new int[n];
	        
	        for(int i = 0; i < n; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        print(arr, k);
	        System.out.println();
	    }
	}
	
	static void print(int arr[], int k){
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
	    
	    for(int i = 0; i < k; i++){
	        pq.add(arr[i]);
	    }
	    
	    for(int i = k; i < arr.length; i++){
	        System.out.print(pq.remove()+ " ");
	        pq.add(arr[i]);
	    }
	    
	    while(!pq.isEmpty()){
	        System.out.print(pq.remove() + " ");
	    }
	}
}