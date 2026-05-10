class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;

        while (l <= r) {
           
                if (numbers[l] + numbers[r] == target) {
                    int[] nums = { l + 1, r + 1 };
                    return nums;
                } else if (numbers[l] + numbers[r] < target) {
                    l++;
                } else
                    r--;

            
            
        }
        return new int[]{-1,-1};
    }
}