package arraylist;

import java.util.*;

/*
 * You are given an array of n integers, both negative and positive. 
 * You need to partition them into two different arrays without directly 
 * comparing any element to 0, 1, -1 or any other fixed value. Consider 0 as a positive number. 
 * If arr[0] is a positive number, then print all the positive numbers in the given order
 *  in the first line of output and then all the negative numbers in the given order in the second line
 *   of output, vice - versa.
*/

public class Partition {
	
   public static void main(String[] args) {
    
	   Scanner sc = new Scanner(System.in);
       
	   int n = sc.nextInt();
       int arr[] = new int[n];
       
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       
       partitionNegativeAndPositive(n, arr);
   }

   static void partitionNegativeAndPositive(int n, int[] arr) {
	   
       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       
       list1.add(arr[0]);
       for (int i = 1; i < n; i++) {
           
           if ((arr[0] ^ arr[i]) < 0) {
               list2.add(arr[i]);
           } else {
               list1.add(arr[i]);
           }
       }
       
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }

        System.out.println();

        if (list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                System.out.print(list2.get(i) + " ");
            }
        } else {
           if (arr[0] > -1) {
               System.out.println("Array doesn't have negative numbers");
           } else
               System.out.println("Array doesn't have positive numbers");
       }
   }
}
