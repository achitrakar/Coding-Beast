/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Leetcode: #219
 * Category: Easy
 * URL: https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i); // update current index
        }
        return false;
    }

    /**
     * This approach is more efficient in terms of memory.
     */
    public boolean containsNearbyDuplicateV2(int[] nums, int k) {
        var set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i-k-1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
