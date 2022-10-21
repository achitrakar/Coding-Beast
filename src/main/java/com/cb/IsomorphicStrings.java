/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

import java.util.HashMap;

/**
 * Leetcode: #205
 * Category: Easy
 * URL: https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        var map = new HashMap<Character, Character>();
        if (s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i< s.length(); i++) {
            var src = s.charAt(i);
            var target = t.charAt(i);
            if (!map.containsKey(src)) {
                // This will be costly, and hence can be optimized.
                if (map.containsValue(target)) {
                    return false;
                }
                map.put(src, target);
            }
            if (map.get(src) != target) {
                return false;
            }
        }
        return true;
    }
}
