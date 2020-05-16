package arrays;

import java.util.*;

public class SpiralMatrix {
   public static void main(String args[]) {
	   
       Scanner s = new Scanner(System.in);
       
       int n = s.nextInt();
       int m = s.nextInt();
       int[][] arr = new int[n][m];
       
       for (int i = 0; i < n; i++)
           for (int j = 0; j < m; j++)
               arr[i][j] = s.nextInt();
       
       spiral(arr, n, m);
   }

   static void spiral(int[][] arr, int n, int m) {
	   
       int startRowInd = 0;
       int startColumnInd = 0;
       int endRowInd = n - 1;
       int endColumnInd = m - 1;
       
       while (startRowInd <= endRowInd && startColumnInd <= endColumnInd) {
           
           for (int i = startColumnInd; i <= endColumnInd; i++)
               System.out.print(arr[startRowInd][i]+" ");
           startRowInd++;
           
           for (int i = startRowInd; i <= endRowInd; i++)
        	   System.out.print(arr[i][endColumnInd]+" ");
           endColumnInd--;
           
           if (startRowInd <= endRowInd) {
               for (int i = endColumnInd; i >= startColumnInd; i--)
            	   System.out.print(arr[endRowInd][i]+" ");
               endRowInd--;
           }
           
           if (startColumnInd <= endColumnInd) {
               for (int i = endRowInd; i >= startRowInd; i--)
            	   System.out.print(arr[i][startColumnInd]+" ");
               startColumnInd++;
           }
       }
     
   }
}
