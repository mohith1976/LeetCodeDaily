class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int left = 0, right = 0, count = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {
            
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if (map.get(nums[right]) == 1) count++;

            
            while (count > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) count--;
                left++;
            }

           
            result += (right - left + 1);
            right++;
        }
        return result;
    }
}