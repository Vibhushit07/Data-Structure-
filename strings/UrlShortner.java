package strings;

import java.util.*;

class UrlShortener{
	public static void main (String[] args){
	 
        Scanner sc = new Scanner(System.in);
        
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            long num = sc.nextLong();
            
            long temp = num;
            
            String str = "";
            
            while(temp != 0){
                int rem = (int)(temp % 62);
                temp /= 62;
                str = s.charAt(rem) + "" + str;
            }
            
            System.out.println(str);
            System.out.println(num);
        }
	}
}