package org.leetcode.problem._8_string_to_integer_atoi;

public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        int start = 0;
        double result = 0;
        int sign = 1;

        if (s == null || s.isBlank() || (!isDigit(s.charAt(start))) && !isSpace(s.charAt(start)) && !isSign(s.charAt(start))) {
            return 0;
        }

        if (s.length() > 1 && isSign(s.charAt(0)) && isSign(s.charAt(1))) {
            return 0;
        }

        while (isSpace(s.charAt(start))) {
            start++;
        }

        if (isSign(s.charAt(start))) {
            if (s.charAt(start) == '-') {
                sign = -1;
            }
            start++;
        }

        for (int i = start; i < s.length(); i++) {
            if (!isDigit(s.charAt(i))) {
                break;
            }

            result = s.charAt(i) - '0' + result * 10;
        }

        result = sign * result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }

    private boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private boolean isSign(char ch) {
        return ch == '-' || ch == '+';
    }

    private boolean isSpace(char ch) {
        return ch == ' ';
    }
}
