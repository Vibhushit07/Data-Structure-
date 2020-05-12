package arrays;

import java.util.*;

public class SumOfBitDiff{
    static int bitDiff(int n){
        int count = 0;
        
        while(n > 0){
            n = n & (n-1);
            count++;
        }
        
        return count;
    }
    
	public static void main (String[] args){
	 
	    Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    
	    while(t-- > 0){
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        int sum = 0;
	        
	        for(int i = 0; i < n; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        for(int i = 0; i < n; i++){
	            for(int j = i + 1; j < n; j++){
	                sum += bitDiff(arr[i] ^ arr[j]);
	            }
	        }
	        
	        System.out.println(sum * 2);
	    }
	}
}