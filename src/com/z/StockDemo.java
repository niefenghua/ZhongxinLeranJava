package com.z;

/*
 * 假设有一个数组，它的第i个元素是一支给定的股票在第i天的价格。
 * 如果你最多只允许完成一次交易(例如,一次买卖股票),设计一个算法来找出最大利润。
 * 
 * 思路：先找出最大数，在找出最大数之前的最小数
 * 
 */

public class StockDemo {

	public static void main(String[] args) {

		int prices[] ={12,13,10,17,11,9,14};

		int profit = maxProfit2(prices);
		System.out.println(profit);
		

	}

	public static int maxProfit(int[] prices) {

		if(prices.length==0 || prices.length==1){
			return 0;
		}
		
		// 找出最大数
		int max = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > max) {
				max = prices[i];
			}
		}
		

		// 找出最大数的下标
		int index = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] == max)
				index = i;
		}
		
		if(index==0){
			return 0;
		}

		// 找出最大数之前的最小数
		int min = prices[0];
		for (int i = 1; i < index; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}
		}

		return max - min;
	}
	
	
	public static int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;  //just remember the smallest price
        int profit = 0;
        for (int i : prices) {
            min = i < min ? i : min;
            profit = (i - min) > profit ? i - min : profit;
        }

        return profit;
    }

}
