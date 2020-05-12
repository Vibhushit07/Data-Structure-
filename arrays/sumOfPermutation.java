package arrays;

import java.util.*;

class GfG{
    public long getSum(int A[],int n){
      
        long sumOfDigits = 0;
        
        for(int i = 0; i < n; i++){
            sumOfDigits += A[i];
        }
        
        sumOfDigits *= factorial(n-1);
        
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += (sumOfDigits * Math.pow(10, i) ); 
        }
        
        return sum % 1000000007;
    }
    
    long factorial(int n){
        long fact = 1;
        for(int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
}

public class sumOfPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0) {
				GfG g = new GfG();
				int n = sc.nextInt();
				int arr[] = new int[n];
				
				for(int i = 0; i < n; i++)
					arr[i] = sc.nextInt();
				System.out.println(g.getSum(arr, n));
			}
	}

}