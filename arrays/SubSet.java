package arrays;

import java.util.*;

/*
 * You will be given an array of non-negative integers. 
 * You need to find the sum of the product of elements of all possible subsets.
 * 
 *       -----LOGIC-----
 *       
 *       Suppose arr[] = {a, b,c}
 *       Possible subsets are {}, {a}, {b}, {c}, {a,b}, {a,c}, {b,c}, {a,b,c}
 *       Sum of products of subsets = 0+a+b+c+a*b+a*c+b*c+a*b*c
 *       
 *       a+b+c+ab+ac+bc+abc
 *       a(1+c)+b(1+c)+ab(1+c)+c
 *       a(1+c)+b(1+c)+ab(1+c)+c+1-1
 *       (1+c)(a+b+ab+1)-1
 *       (1+c)(a(1+b)+1+b)-1
 *       (1+c)((1+b)(1+a))-1
 *       
 *       Result = (1+a)(1+b)(1+c)-1
 */

public class SubSet {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int arr[] = new int[n];
       for (int i = 0; i < n; i++)
           arr[i] = s.nextInt();
       sumOfProductOfSubsets(arr, n);
   }

   static void sumOfProductOfSubsets(int arr[], int n) {
       int result = 1;
       
       for (int i = 0; i < n; i++) {
           if (arr[i] < 0) {
               System.out.println("Invalid Input");
               return;
           }
           result *= (arr[i] + 1);
       }
       
       System.out.println(result - 1);
   }
}
