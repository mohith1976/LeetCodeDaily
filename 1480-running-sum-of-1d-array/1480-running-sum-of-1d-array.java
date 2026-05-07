class Solution {
    public int[] runningSum(int[] nums) {
        
        int max =0;
        int[] sum = new int[nums.length];

        for(int i=0;i<= nums.length-1;i++)
        {
            max += nums[i];
            sum[i] = max;
        }

        return sum;

        
    }
}