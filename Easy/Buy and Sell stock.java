https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=array

class Solution {
    public int maxProfit(int[] prices) {
        // If there are no prices or only one price, no profit can be made
        if (prices.length == 0) {
            return 0;
        }

        int lowestElement = prices[0]; // The lowest price encountered so far
        int maxProfit = 0;             // The maximum profit we can achieve

        // Iterate through the prices starting from the second day
        for (int i = 1; i < prices.length; i++) {
            int currentElement = prices[i];
            int currentProfit = currentElement - lowestElement;  // Potential profit if sold today

            // Update the lowest element if we find a new lower price
            if (currentElement < lowestElement) {
                lowestElement = currentElement;
            }

            // Update maxProfit if the currentProfit is greater than the previous maxProfit
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        // Return the maximum profit found
        return maxProfit;
    }
}
