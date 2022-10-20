/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

/**
 * Leetcode: #724
 * Category: Easy
 * URL: https://leetcode.com/problems/find-pivot-index/
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        var totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        var leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
