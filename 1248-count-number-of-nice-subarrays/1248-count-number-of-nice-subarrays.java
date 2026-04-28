class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int count =0;
        int sum =0;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++)
        {
            if(nums[i] %2 == 0){
                nums[i] = 0;
            }else if(nums[i] %2 ==1){
                nums[i] = 1;
            }

            sum += nums[i];

            if(sum ==k)
            {
                count++;
            }

            int rem = sum -k;

            if(map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(sum , map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}