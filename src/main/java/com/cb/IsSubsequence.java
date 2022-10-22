/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

/**
 * Leetcode: #392
 * Category: Easy
 * URL: https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        var j = 0;
        for (int i = 0; i < s.length() ; i++) {
            var found = false;
            for (; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    j = j+1;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
