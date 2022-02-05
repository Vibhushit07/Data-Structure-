package Leet_Code_Challenge;

/* Given a string s and a non-empty string p, 
 * find all the start indices of p's anagrams in s.
 */

import java.util.*;

class Solution {
    
    public boolean compareArray(int arr1[], int arr2[]) {
        
        for(int i = 0; i < 256; i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        
        Solution so = new Solution();
        
        int countS[] = new int[256];
        int countP[] = new int[256];
        
        List<Integer> list = new ArrayList<>();
        
        if(s.length() == 0 || p.length() == 0 || s.length() < p.length())
            return list;
        
        for(int i = 0; i < p.length(); i++){
            countS[s.charAt(i)]++;
            countP[p.charAt(i)]++;
        }
        
        for(int i = p.length(); i < s.length(); i++){
            if(so.compareArray(countS, countP))
                list.add(i - p.length());
            
            countS[s.charAt(i)]++;
            countS[s.charAt(i - p.length())]--;
        }
        
        if(so.compareArray(countS, countP))
            list.add(s.length() - p.length());
        
        return list;
        
    }
}