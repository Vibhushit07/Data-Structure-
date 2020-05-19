package strings;

import java.util.*;

public class isogram {

	static boolean checkIsogram(String str) {
		
		HashSet<Character> hs = new HashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(hs.contains(str.charAt(i)))
				return false;
			
			hs.add(str.charAt(i));
		}
			
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		if(checkIsogram(str)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
