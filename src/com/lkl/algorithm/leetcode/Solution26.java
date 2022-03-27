package com.lkl.algorithm.leetcode;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int noDupIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[noDupIndex] != nums[i]) {
                noDupIndex++;
                nums[noDupIndex] = nums[i];
            }
        }
        return noDupIndex + 1;
    }
}
