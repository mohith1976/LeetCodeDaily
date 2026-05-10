class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long Dividend = Math.abs((long) dividend);
        long Divisor = Math.abs((long) divisor);

        int quotient = 0;

        while (Dividend >= Divisor) {
            long tempDivisor = Divisor;
            int count = 1;

            while (Dividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                count <<= 1;
            }

            Dividend -= tempDivisor;
            quotient += count;
        }

        return (sign == -1) ? -quotient : quotient;
    }
}