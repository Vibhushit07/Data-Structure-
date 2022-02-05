package Leet_Code_Challenge;

class Solution {
    public String frequencySort(String s) {
        
        int len = s.length();
        int []freq = new int[256];
        
        int bucketLevel = 0;
        
        for(int i = 0; i < len; i++){
            freq[s.charAt(i)]++;
            
            bucketLevel = Math.max(bucketLevel, freq[s.charAt(i)]);
        }
        
        StringBuilder []bucket = new StringBuilder[bucketLevel+1];
        
        for(int i = 0; i < bucket.length; i++){
            bucket[i] = new StringBuilder();
        }
        
        for(int i = 0; i < 256; i++){
            
            if(freq[i] > 0){
               bucket[freq[i]].append(Character.toString((char)i)); 
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i = bucketLevel; i > 0; i--){
            
            char chars[] = bucket[i].toString().toCharArray();
            
            for(int j = 0; j < chars.length; j++){
                for(int k = 0; k < i; k++){
                    result.append(chars[j]);
                }
            }
        }
        
        return result.toString();
        
    }
}