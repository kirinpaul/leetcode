package org.leetcode.problem._5_longest_palindromic_substring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class LongestPalindromicSubstringTest {
    @Spy
    private LongestPalindromicSubstring longestPalindromicSubstring;

    @Test
    void longestPalindrome() {
        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
        assertEquals("xnanx", longestPalindromicSubstring.longestPalindrome("krhjgbiqabghbwlgxnanxptytbNCBHnblkiu"));
    }
}