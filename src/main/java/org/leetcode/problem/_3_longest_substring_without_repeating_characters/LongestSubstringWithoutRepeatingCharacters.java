package org.leetcode.problem._3_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<String, Integer> occurs = new HashMap<>();
        int currentLength = 0;
        String symbol = "";

        if (s == null || s.length() == 0)
            return 0;

        for (int i = 0; i < s.length(); i++) {
            symbol = String.valueOf(s.charAt(i));
            if (!occurs.containsKey(symbol)) {
                occurs.put(symbol, i);
                currentLength = currentLength + 1;
            } else {
                break;
            }
        }

        return Math.max(currentLength, lengthOfLongestSubstring(s.substring(occurs.get(symbol) + 1)));
    }
}
