package org.leetcode.problem._1_two_sum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
class TwoSumTest {
    @Spy
    private TwoSum twoSum;

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3, 3}, 6));
        assertArrayEquals(new int[]{1, 3}, twoSum.twoSum(new int[]{1, 5, 11, -1, 3}, 4));
        assertArrayEquals(new int[]{1, 4}, twoSum.twoSum(new int[]{21, 3, 0, 99, -14, -11}, -11));
    }
}