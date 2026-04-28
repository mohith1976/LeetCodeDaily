class Solution{
public int longestEqualSubarray(List<Integer> nums, int k) {
    int size = 0;
    int left = 0;
    int  n = nums.size();
    Map<Integer, Integer> count = new HashMap<>();
    
    for (int right = 0; right < n; right++) {
        int num = nums.get(right);
        count.put(num, count.getOrDefault(num, 0) + 1);
        size = Math.max(size, count.get(num));
            
        if ((right - left + 1) - size > k) {
            count.put(nums.get(left), count.get(nums.get(left)) - 1);
            left++;
        }
    }
    return size;
}
}
