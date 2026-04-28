class Solution {
    public long countSubarrays(int[] nums, long k) {
        
        long score = 0;
        long count =0;
       
        int l = 0;
        int r =0;
        int n = nums.length;

        while(r<n)
        {
            score = (score + nums[r]);

            
            while(score * (r - l + 1) >=k)
            {
                score = (score - nums[l]);
                l++;
            }
            if(score<k)
            {
                count += r-l+1;;
            }
            r++;
        }
        return count;
    }
}