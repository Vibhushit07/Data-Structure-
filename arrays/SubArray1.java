package arrays;

import java.util.Scanner;

/*
 * Count sub arrays having sum less than k
 */

public class SubArray1 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i =0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();

        countSubArray(n,arr,k);
    }

    static void countSubArray(int n, int[] arr,int k){
        int start = 0;
        int end = 0;
        int count = 0;
        int sum = arr[0];

        while (end < n && start < n){
          
            if(sum < k){
                
            	end++;
                count += end-start;
                
                if(end < n)
                    sum += arr[end];
            } else{
                sum -= arr[start];
                start++;
            }
        }
        
        System.out.println(count);
    }
}