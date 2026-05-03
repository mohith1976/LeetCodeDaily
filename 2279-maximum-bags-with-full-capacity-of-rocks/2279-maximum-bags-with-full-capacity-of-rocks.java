class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int total =0;
        int rem[] = new int[capacity.length];

        for(int i=0;i<capacity.length;i++)
        {
            rem[i] = capacity[i]- rocks[i];

        }
        Arrays.sort(rem);
        for(int i=0;i<rocks.length;i++)
        {
            if(rem[i]==0) total++;

            if(rem[i]>0 && rem[i]<=additionalRocks)
            {
                additionalRocks -=rem[i];
                total++;
            }
        }

        return total;
    }
}