package org.leetcode.problem._3_longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class LongestSubstringWithoutRepeatingCharactersTest {
    @Spy
    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        assertEquals(12, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcdefghijkleqwe"));
    }
}