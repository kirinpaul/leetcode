package org.leetcode.problem._4_median_of_two_sorted_arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MedianOfTwoSortedArraysTest {
    @Spy
    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @Test
    void findMedianSortedArrays() {
        assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        assertEquals(4.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2, 5, 7}, new int[]{3, 4, 10, 11}));
    }
}