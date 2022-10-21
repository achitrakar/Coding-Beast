/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

import java.util.HashSet;

/**
 * Leetcode: #217
 * Category: Easy
 * URL: https://leetcode.com/problems/contains-duplicate/
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
