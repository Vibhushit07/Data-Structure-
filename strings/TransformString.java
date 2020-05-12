package strings;

import java.util.Scanner;

class TransformString{
    static boolean anagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int a[] = new int[256];
        for(int i = 0; i < s1.length(); i++){
            a[s1.charAt(i)]++;
            a[s2.charAt(i)]--;
        }
        
        for(int i = 0; i < 256; i++){
            if(a[i] != 0)
                return false;
        }
        
        return true;
    }
    
    static int transform(String s1, String s2){
        int res = 0;
        int i = s1.length()-1;
        int j = s2.length()-1;
        while(i >= 0){
            if(s1.charAt(i) != s2.charAt(j)){
                res++;
            }else{
                j--;
            }
            i--;
        }
        return res;
    }
    
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int t = Integer.parseInt(sc.nextLine());
	    while(t-- > 0){
	        String s[] = sc.nextLine().split(" ");
	        String s1 = s[0];
	        String s2 = s[s.length-1];
	        
	        if(s1.length() == 0 && s2.length() == 0){
	            System.out.println("-1");
	            continue;
	        }
	        
	        if(anagram(s1, s2)){
	            System.out.println(transform(s1, s2));
	        }else{
	            System.out.println("-1");
	        }
	   
	    }
	    
	}
}