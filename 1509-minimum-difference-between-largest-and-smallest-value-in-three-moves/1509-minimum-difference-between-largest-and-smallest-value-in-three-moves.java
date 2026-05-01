class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        int max = Integer.MAX_VALUE;

        if (n <= 4) return 0;

        Arrays.sort(nums);
        
        for (int i = 0; i <= 3; i++) {
            max = Math.min(max, nums[n - 4 + i] - nums[i]);
        }

        return max;
    }
}