package org.example;

class Task3_BestTimeToBuySellStock {
    public int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE, best = 0;
        for (int p : prices){
            if (p < min){
                min = p;
            }else{
                best = Math.max(best, p - min);
            }
        }
        return best;
    }
}
