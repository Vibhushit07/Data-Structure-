package arrays;

import java.util.*;

/*
 * 	You will be given an unsorted array of all distinct integers. 
 * 	Check if it is possible to make the array sorted by performing the ‘Rule’ given below or not. 
 * 	If it is possible, print ‘Yes’; otherwise, print ‘No’.
 * 
 * 	Rule: You can rotate any number of subarrays as many times as you want,
 *  but the centre of the subarrays should be same as that of the given array.
 */

public class sortArray {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arrayCopy = new int[n], array = new int[n];
       for (int i = 0; i < n; i++) {
           array[i] = s.nextInt();
           arrayCopy[i] = array[i];
       }
      
       // Write your code here
        Arrays.sort(arrayCopy);
        for(int i = 0; i < n; i++){
            if(array[i] != arrayCopy[i] && arrayCopy[n-i-1] != array[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
   }
}

