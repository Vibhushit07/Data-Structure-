package arrays;

import java.util.*;

class Solution{
    
    public static class Pair implements Comparable<Pair>{
        int data;
        int row, col;
        
        public int compareTo(Pair p){
            return this.data- p.data;
        }
    }
    
    public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
    {
        // Write your code here.
        
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i = 0; i < k; i++){
            Pair p = new Pair();
            p.data = arrays[i][0];
            p.row = i;
            p.col = 0;
            pq.add(p);
        }
        
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            
            result.add(p.data);
            p.col++;
            if(p.col < k){
                p.data = arrays[p.row][p.col];
                pq.add(p);
            }
        }
        
        return result;
        
    }
}

public class mergeArrays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			Solution s = new Solution();
			
			ArrayList<Integer> a = s.mergeKArrays(arr, n);
			
			for(int i = 0; i < a.size(); i++)
				System.out.print(a.get(i) + " ");
			System.out.println();
		}
	}
}