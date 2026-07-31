class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Since 1 <= costs[i] <= 10^5, we create a frequency array of size 100001
        int maxCost = 100000;
        int[] frequency = new int[maxCost + 1];
        
        // Count the occurrence of each ice cream price
        for (int cost : costs) {
            frequency[cost]++;
        }
        
        int iceCreamCount = 0;
        
        // Iterate through all possible prices from cheapest (1) to most expensive (100000)
        for (int price = 1; price <= maxCost; price++) {
            if (frequency[price] == 0) {
                continue;
            }
            
            // If we can't even afford one ice cream at this price, we are done
            if (coins < price) {
                break;
            }
            
            // Determine how many ice creams of this price we can afford
            // It's the minimum of how many are available vs how many we can buy with our coins
            int countToBuy = Math.min(frequency[price], coins / price);
            
            // Deduct the cost and update our counts
            coins -= countToBuy * price;
            iceCreamCount += countToBuy;
        }
        
        return iceCreamCount;
    }
}