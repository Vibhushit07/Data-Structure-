package practise;

import java.util.*;

public class UniqueDigit {
	
	static int uniqueDigit(int number) {
		HashSet<Integer> hs = new HashSet<>();
		
		while(number != 0) {
			int rem = number % 10;
			number /= 10;
			hs.add(rem);
		}
		
		return hs.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueDigit(84001));
	}

}
