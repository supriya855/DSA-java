class Solution {
    public int maxProfit(int[] prices) {
        //brute force
        // int maxProfit=0,profit=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]-prices[i]>0){
        //             profit=prices[j]-prices[i];
        //             maxProfit=Math.max(maxProfit,profit);
        //         }
        //     }
        // }
        // return maxProfit;
        int min=Integer.MAX_VALUE,profit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(prices[i]-min,profit);
            
        }
        return profit;
    }
}