/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

/**
 * Leetcode: #704
 * Category: Easy
 * URL: https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            var mid = l + ((r-l+1) / 2);

            if(nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
