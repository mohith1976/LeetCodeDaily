class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int c =0;
        int r =0;
        int n = costs.length-1;
        Arrays.sort(costs);

        while(r<=n)
        {
            if( coins>= costs[r])
            {
                c+=1;
                coins -= costs[r];
            }
            r++;
        }
        return c;
    }
}