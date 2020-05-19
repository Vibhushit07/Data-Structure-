package arrays;

import java.util.*;

/*
 * Rohit and Rahul are very close friends, and as Rahul’s birthday is coming up, 
 * Rohit decides to share a chocolate bar with him. 
 * Rohit has made you the in-charge for the sharing of this chocolate. 
 * Each square of the bar has a number written on it, 
 * and Rohit has decided that he will share a contiguous piece of chocolate, 
 * in which the sum of each number on the squares is equal to the month in which Rahul was born, 
 * and the numbers written on these squares add up to Rahul’s birth date. 
 * You need to find the number of ways chocolate can be divided.
 * 
 * Example:
 * 
 * 	Input:
 * 		1 4 3 5 6 4	
 * 		18
 * 		4
 * 	Output:
 * 		2
 * 
 * Explanation:
 * 
 * From the input you can get the following:
 * Consider the chocolate bar as the array of integers. Here the chocolateBar = [1, 4, 3, 5, 6, 4]. 
 * Each element of the array indicates the number on the square of the chocolate bar.
 * The next line is an integer (here, it is ‘18’) indicating the date of Rahul’s birthday.
 * The next line is an integer (here, it is 4) indicating the month of Rahul’s birthday.
 * Here, for the given input you can divide the chocolate bar in two ways, they are:
 * 	4 3 5 6 
 * 	3 5 6 4
 * such that the chocolate piece is contiguous, 
 * the number of squares of the chocolate piece is equal to the month 
 * in which Rahul was born (here, it is 4), 
 * and the sum of the integers present on these square is equal to Rahul’s birth date (here, it is 18).
 */


public class ChocolateBar {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for(int i=0; i < n; i++){
           arr[i] = s.nextInt();
       }
       int d = s.nextInt();
       int m = s.nextInt();
       numberOfSubArrays(arr, n, d, m);
   }
  
   static void numberOfSubArrays(int[] arr,int n, int d, int m){
       
        if(m > n){
            System.out.println("0");
            return;
        }
       
        int count = 0, sum = 0;
        for(int i = 0; i < m; i++)
            sum += arr[i];
        if(sum == d){
            count++;
        }    
        for(int i = 1; i <= n-m; i++){
            sum = sum - arr[i-1] + arr[i+m-1];
            if(d == sum)
                count++;
        }
        
        System.out.println(count);
   }
}
