package arrays;

import java.util.*;

public class SubArray{
	public static void main (String[] args){
	 
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
            int totalSubArrays = n*(n+1)/2;
            
            int countArrays = 0; 
            
            int count = 0;
            
            for(int i = 0; i < n; i++){
                if(arr[i] <= k){
                    count++;
                }else{
                    countArrays += (count * (count+1) / 2);
                    count = 0;
                }
            }
            
            countArrays += (count * (count+1) / 2);
            
            System.out.println(totalSubArrays - countArrays);
        }
	}
}