package strings;

import java.util.*;

public class anagram{
	
    public static boolean checkAnagram(String str[]) {
        int count[] = new int[256];
        
        if(str[0].length() != str[1].length())
            return false;
            
        for(int i = 0; i < str[0].length(); i++){
            count[str[0].charAt(i)]++;
            count[str[1].charAt(i)]--;
        }
        
        for(int i = 0; i < 256; i++) {
            if(count[i] != 0)
                return false;
        }
        
        return true;
        
    }
    
	public static void main (String[] args){
	 
	    Scanner sc = new Scanner(System.in);
	    int t = Integer.parseInt(sc.nextLine());
	    
	    while(t-- > 0){
	        String str[] = sc.nextLine().split(" ");
	        
	        if(checkAnagram(str)){
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	    }
	}
}