class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int l =0;
        int r =0;
        
        while(r < nums.length -1)
        {
            int farPoint =0;
            for(int i =l; i<=r;i++)
            {
                farPoint = Math.max(farPoint, i+nums[i]);
            }
            l = r+1;
            r = farPoint;
            jumps++;
             
        }
        return jumps;


    }
}