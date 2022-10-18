/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

/**
 * Leetcode: #938
 * Category: Easy
 * URL: https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSum {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        // Base Condition
        if (root == null) {
            return 0;
        }

        var leftSum = 0;
        var rightSum = 0;

        if (root.val > low) {
            leftSum = rangeSumBST(root.left, low, high);
        }

        if (root.val < high) {
            rightSum = rangeSumBST(root.right, low, high);
        }

        if (low <= root.val && root.val <= high) {
            return leftSum + rightSum + root.val;
        } else {
            return leftSum + rightSum;
        }
    }

    public static void main(String[] args) {
        // Example 1
        var root = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18)));
        var low = 7;
        var high = 15;
        System.out.println("(Expected, Actual) = (32, " + rangeSumBST(root, low, high) + ")");

        // Example 2
        root = new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)), new TreeNode(15, new TreeNode(13), new TreeNode(18)));
        low = 6;
        high = 10;
        System.out.println("(Expected, Actual) = (23, " + rangeSumBST(root, low, high) + ")");
    }
}
