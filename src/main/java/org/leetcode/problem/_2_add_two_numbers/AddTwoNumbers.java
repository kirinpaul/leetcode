package org.leetcode.problem._2_add_two_numbers;

import java.util.AbstractMap;
import java.util.Map;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;
        int i = 0;
        int j = 0;
        while (current1 != null) {
            i++;
            current1 = current1.next;
        }
        while (current2 != null) {
            j++;
            current2 = current2.next;
        }
        if (i < j) {
            ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
        }

        int mod = 0;
        return recursionSum(l1, l2, mod);
    }

    private ListNode recursionSum(ListNode l1, ListNode l2, int mod) {
        Map.Entry<Integer, Integer> sumAndMod = getSumAndMod(l1 != null ? l1.val : 0, l2 != null ? l2.val : 0, mod);
        if (l1 != null || l2 != null) {
            return new ListNode(sumAndMod.getKey(), recursionSum(l1 != null ? l1.next : null, l2 != null ? l2.next : null, sumAndMod.getValue()));
        }

        if (mod > 0) {
            return new ListNode(mod);
        } else {
            return null;
        }
    }

    private Map.Entry<Integer, Integer> getSumAndMod(int num1, int num2, int mod) {
        int currentSum = num1 + num2 + mod;
        return new AbstractMap.SimpleEntry<>(currentSum % 10, currentSum / 10);
    }
}
