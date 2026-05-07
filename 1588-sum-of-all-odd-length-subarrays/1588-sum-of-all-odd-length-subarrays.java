class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        boolean oddlength = false;

        int max = 0;

        for (int l = 0; l < arr.length; l++) {
            int sum = 0;
            for (int r = l; r < arr.length; r++) {
                sum += arr[r];

                if ((r - l + 1) % 2 == 1) {
                    max += sum;
                }
            }
        }
        return max;
    }
}