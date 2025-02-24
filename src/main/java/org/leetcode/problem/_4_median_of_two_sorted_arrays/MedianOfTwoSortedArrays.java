package org.leetcode.problem._4_median_of_two_sorted_arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums;

        if (nums1.length >= nums2.length) {
            nums = merge(nums1, nums2);
        } else {
            nums = merge(nums2, nums1);
        }

        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }

    private int[] merge(int[] nums1, int[] nums2) {
        int k = 0;
        int j = 0;
        int[] nums = new int[nums1.length + nums2.length];

        if (nums1.length == 0 && nums2.length == 0) {
            return nums;
        } else if (nums1.length == 0) {
            return nums2;
        } else if (nums2.length == 0) {
            return nums1;
        } else if (nums1[nums1.length - 1] <= nums2[0]) {
            return concat(nums1, nums2);
        } else if (nums2[nums2.length - 1] <= nums1[0]) {
            return concat(nums2, nums1);
        } else {
            for (int value : nums1) {
                while (j < nums2.length && value > nums2[j]) {
                    nums[k++] = nums2[j];
                    j++;
                }
                nums[k++] = value;
            }

            return nums;
        }
    }

    private int[] concat(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int k = 0;

        for (int value : nums1) {
            nums[k++] = value;
        }
        for (int value : nums2) {
            nums[k++] = value;
        }

        return nums;
    }
}
