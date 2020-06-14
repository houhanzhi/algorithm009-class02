package com.datastructure.algorithm.week04;

/**
 * 买卖股票的最佳时机II
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - prices[i - 1];
            if (temp > 0)
                result += temp;
        }
        return result;
    }
}
