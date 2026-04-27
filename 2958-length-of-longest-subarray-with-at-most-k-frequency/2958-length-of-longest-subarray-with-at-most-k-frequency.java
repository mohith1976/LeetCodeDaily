class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int window = 0;
        int max =0;
        int l=0;
        int r=0;
        int n = nums.length;

        while(r<n)
        {
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            while(map.get(nums[r]) >k) {
              int newCount =  map.get(nums[l]) -1;
                map.put(nums[l],  newCount);
                l++;
            }
            
            window = r - l+1;
            max= Math.max(max, window);
            r++;
        }
        
       return max;
    }
}