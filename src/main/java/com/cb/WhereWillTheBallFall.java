/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

/**
 * Leetcode: #1706
 * Category: Medium
 * URL: https://leetcode.com/problems/where-will-the-ball-fall/
 */
public class WhereWillTheBallFall {
    public int[] findBall(int[][] grid) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        int result[] = new int[colSize];

        for (int i = 0; i < colSize; i++) {
            int cPos = i;
            int nPos = -1;

            for (int j = 0 ; j < rowSize; j++) {
                nPos = cPos + grid[j][cPos];

                if (nPos < 0 || nPos >= colSize || grid[j][cPos] != grid[j][nPos]) {
                    cPos = -1;
                    break;
                }
                cPos = nPos;
            }
            result[i] = cPos;
        }
        return result;
    }
}
