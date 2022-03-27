package com.lkl.algorithm.leetcode;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int p = 0, q = length - 1;
        while (p < length && q >= p) {
            if (nums[p] == val) {
                nums[p] = nums[q--];
            } else {
                p++;
            }
        }
        return q + 1;
    }
}
