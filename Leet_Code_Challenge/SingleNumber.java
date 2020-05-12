package Leet_Code_Challenge;

class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        
        for(int num : nums)
            result ^= num;
        
        return result;
    }
}