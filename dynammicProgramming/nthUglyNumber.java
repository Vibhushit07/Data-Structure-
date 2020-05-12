package dynammicProgramming;

import java.util.*;

public class nthUglyNumber { 
	
	static int getNthUglyNo(int n) {
		
		int ugly[] = new int[n]; 

		int i2 = 0, i3 = 0, i5 = 0; 
		
		int nextMultipleOf2 = 2; 
		int nextMultipleOf3 = 3; 
		int nextMultipleOf5 = 5; 
		
		ugly[0] = 1; 
		
		for(int i = 1; i < n; i++) { 
			
			int uglyNum = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5)); 
			
			ugly[i] = uglyNum;
					
			if (uglyNum == nextMultipleOf2) { 
				i2 = i2+1; 
				nextMultipleOf2 = ugly[i2]*2; 
			} 
			
			if (uglyNum == nextMultipleOf3) { 
				i3 = i3+1; 
				nextMultipleOf3 = ugly[i3]*3; 
			} 
			
			if (uglyNum == nextMultipleOf5) { 
				i5 = i5+1; 
				nextMultipleOf5 = ugly[i5]*5; 
			} 
		}
		
		return ugly[n-1];
	} 

	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(getNthUglyNo(n)); 
	} 
} 