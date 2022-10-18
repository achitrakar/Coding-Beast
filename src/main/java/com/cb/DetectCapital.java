/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;

/**
 * Leetcode: #520
 * Category: Easy
 * URL: https://leetcode.com/problems/detect-capital/
 */
public class DetectCapital extends TestCase {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(char c: word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count += 1;
            }
        }
        return (count == 0 || count == word.length() || ((count == 1 && Character.isUpperCase(word.charAt(0)))));
    }

    /**
     * An alternative solution that uses a regular expression
     * @param word
     * @return
     */
    public boolean detectCapitalUseReg(String word) {
        return (word.matches("[A-Z]*|[A-Z]?[a-z]*"));
    }

    @Test
    public void testDetectCapital() {

        // A HashMap containing input with its expected output
        var inputs = new HashMap<String, Boolean>();
        inputs.put("USA", true);
        inputs.put("FlaG", false);
        inputs.put("Google", true);
        inputs.put("leetcode", true);
        inputs.put("ffffffffffffffffffffF", false);

        inputs.forEach((input, expected) -> assertEquals(expected, Boolean.valueOf(detectCapitalUse(input))));
        inputs.forEach((input, expected) -> assertEquals(expected, Boolean.valueOf(detectCapitalUseReg(input))));
    }
}
