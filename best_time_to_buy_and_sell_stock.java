class Solution {
    public int maxProfit(int[] prices) {

        ///...solved using kadane pattern...///
        int profit=0,i=0,j=1;
        while(j<prices.length){
            if(prices[j]-prices[i] <= 0) {
                i=j;
                j++;
            }
            else if(prices[j]-prices[i] > 0){
                if(prices[j]-prices[i] > profit) profit=prices[j]-prices[i];
                j++;
            }
        }

        return profit;

        ///...This is the Brute Force approach there will be (T.L.E.) and T.C=O(n^2)...///

    //     int  maxp=0;
    //     for(int i=0;i<prices.length;i++){
    //         for(int j=i+1;j<prices.length;j++){
    //             if(prices[j]-prices[i]>maxp){
    //                 maxp=prices[j]-prices[i];
    //             }
    //         }
    //     }
    //     return maxp;
    }
}
