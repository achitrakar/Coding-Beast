/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

/**
 * Leetcode: #12
 * Category: Medium
 * URL: https://leetcode.com/problems/integer-to-roman/
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        String[] notations =
                new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] value =
                new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        var result = new StringBuilder();
        var rem = num;

        for (int i = 0 ; i < value.length ; i++) {
            var rep = rem / value[i];
            result.append(notations[i].repeat(rep));
            rem = rem % value[i];
        }
        return result.toString();
    }
}
