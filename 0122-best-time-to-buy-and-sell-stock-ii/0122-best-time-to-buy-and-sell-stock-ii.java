class Solution {
    public int maxProfit(int[] prices) {
        int sum =0;
        int l = 0;
        int r =1;
        int n = prices.length;

        while(r<n)
        {
            int diff= prices[r]-prices[l];
            
            if(diff>0)
            {
                
                sum+= diff;
               

            }
                l=r;
            
            r++;
        }

        return sum;


    }
}