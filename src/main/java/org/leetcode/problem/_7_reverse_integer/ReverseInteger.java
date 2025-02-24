package org.leetcode.problem._7_reverse_integer;

public class ReverseInteger {
    public int reverse(int x) {
        int reverse = 0;
        int digit;

        while (x != 0) {
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            digit = x % 10;
            x = x / 10;
            reverse = digit + reverse * 10;
        }

        return reverse;
    }
}
