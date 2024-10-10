//https://leetcode.com/problems/happy-number/submissions/1418281016/

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquaresOfDigits(n);
        }
        return n == 1;
    }

    private static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum; 
    }
}
