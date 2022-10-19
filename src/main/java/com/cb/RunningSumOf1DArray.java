/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

/**
 * Leetcode: #1480
 * Category: Easy
 * URL: https://leetcode.com/problems/running-sum-of-1d-array/
 */

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
