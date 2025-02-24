package org.leetcode.problem._1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
            Integer secondNum = target - nums[i];
            if (map.containsKey(secondNum) && !map.get(secondNum).equals(i)) {
                return new int[]{map.get(secondNum), i};
            }
        }

        return new int[0];
    }
}
