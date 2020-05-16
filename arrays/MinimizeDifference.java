package arrays;

import java.util.*;

/*
	You are given 3 sorted arrays of random lengths.
	You’ve to find the absolute minimum difference between Max(a,b,c)-Min(a,b,c). 
	a,b,c here belong to the 3 arrays respectively.
*/

public class MinimizeDifference {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        for (int i = 0 ; i < n1;i++){
            arr1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        
        for(int i = 0; i < n3;i++){
            arr3[i] = sc.nextInt();
        }
        
        minimiseTriplet(n1,arr1,n2,arr2,n3,arr3);
    }
    static void minimiseTriplet(int n1, int[] arr1, int n2,int[] arr2, int n3, int[] arr3 ){
        
        int i = n1-1, j = n2-1, k = n3-1;
        int minDiff = Integer.MAX_VALUE;
        
        while(i != -1 && j != -1 && k != -1){
        
        	int max = Math.max(arr1[i], Math.max(arr2[j], arr3[k]) );
            int min = Math.min(arr1[i], Math.min(arr2[j], arr3[k]) );
            int diff = Math.abs(max - min);
            
            if(minDiff > diff){
                minDiff = diff;
            }
            
            if(max == arr1[i]){
                i--;
            }else if(max == arr2[j]){
                j--;
            }else{
                k--;
            }
        }
        
        System.out.println(minDiff);
    }
}