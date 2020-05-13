package strings;

import java.util.*;

public class pangram{
	
	public static void pan(String str, int arr[]) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				arr[str.charAt(i) - 'a'] = 1;
		}
		
		if(print(arr))
			System.out.println("1");
		else
			System.out.println("0");
	}
	
	public static boolean print(int arr[]) {
		for(int i = 0; i < 26; i++) {
			if(arr[i] == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		while(t-- > 0){
		    String str = sc.nextLine();
		    int arr[] = new int[26];
		    str = str.toLowerCase();
		    pan(str, arr);
		}
	}
}