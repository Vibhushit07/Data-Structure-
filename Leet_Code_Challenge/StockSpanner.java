package Leet_Code_Challenge;

import java.util.*;


/*
 * Write a class StockSpanner which collects daily price quotes for some stock, 
 * and returns the span of that stock's price for the current day.
 * 
 * The span of the stock's price today is defined as the maximum number of consecutive days 
 * (starting from today and going backwards) for which the price of the stock was less than 
 * or equal to today's price.
 * 
 * For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], 
 * then the stock spans would be [1, 1, 1, 2, 1, 4, 6].
 */

class StockSpanner {
    
    ArrayList<Integer> al = new ArrayList<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        if(al.size() == 0){
            al.add(price);
            return 1;
        }
        
        int count = 0;
        
        for(int i = al.size()-1; i >= 0; i--){
            if(al.get(i) > price)
                break;
            count++;
        }
        
        al.add(price);
        return count+1;
    }
}
