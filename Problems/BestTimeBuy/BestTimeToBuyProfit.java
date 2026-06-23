package Problems.BestTimeBuy;

public class BestTimeToBuyProfit {
    static int maxProfit(int[] prices) {
        int profit = 0, buy = prices[0];

        for(int i = 0; i < prices.length; i++){
            
            profit = Math.max(profit,prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }
        return profit;
        
    }
    public static void main(String[] args) {
        int[] arr = {11,3,55,6,88,9};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }
    
}
