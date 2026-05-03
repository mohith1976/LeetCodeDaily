class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length + nums2.length];

        int pos = 0;
        for (int element : nums1)
            nums[pos++] = element;
        for (int element : nums2)
            nums[pos++] = element;

        Arrays.sort(nums);

       
        if (nums.length % 2 != 0) {
   
    return (double) nums[nums.length / 2];
} 
    
    return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
    }

}