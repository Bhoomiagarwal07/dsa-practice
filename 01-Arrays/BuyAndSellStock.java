/*
Problem: Best Time to Buy and Sell Stock

Problem Statement:
Given an array of stock prices where prices[i] represents the price
of a stock on the ith day, find the maximum profit that can be made
by buying on one day and selling on a later day.

Approach:
- Use a single pass through the array.
- Keep track of the minimum buying price seen so far using minBP.
- For every price, calculate the possible profit by selling at that price.
- Update maxProfit whenever a higher profit is found.
- If the current price is smaller than minBP, update minBP.
- We must buy before selling, so the minimum price is always taken
  from an earlier day.

Example:
prices = {7, 1, 5, 3, 6, 4}

Minimum buying price = 1
Best selling price = 6
Maximum profit = 6 - 1 = 5

Time Complexity: O(n)
- Traverse the prices array only once.

Space Complexity: O(1)
- Only a few variables are used.

Approach: Greedy / Single Pass
*/

public class BuyAndSellStock {

    public static int getMaxProfit(int prices[]){
        int minBP = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] > minBP){
                int profit = prices[i]-minBP;
                maxProfit = Math.max(profit , maxProfit);
            }
            else{
                minBP = prices[i];
            }
            }
            return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));
    }
}
