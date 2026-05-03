class Solution {
    public int sumOfPrimesInRange(int n) {
        int N = n;
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }

        int start = Math.min(N, r);
        int end = Math.max(N, r);
        int sum = 0;

        for (int j = start; j <= end; j++) {
            if (isPrime(j)) {
                sum += j;
            }
        }
        return sum;
    } 

    
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
} 