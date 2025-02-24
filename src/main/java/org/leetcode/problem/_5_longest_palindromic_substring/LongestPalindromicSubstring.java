package org.leetcode.problem._5_longest_palindromic_substring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result;
        String currentStr;

        if (s == null || s.isBlank())
            return null;

        if (isPalindrome(s))
            return s;

        result = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    currentStr = s.substring(i, j + 1);
                    if (isPalindrome(currentStr) && currentStr.length() > result.length()) {
                        result = currentStr;
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }

        return true;
    }
}
