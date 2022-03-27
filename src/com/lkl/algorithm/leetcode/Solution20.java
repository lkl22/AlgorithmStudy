package com.lkl.algorithm.leetcode;

import java.util.Queue;
import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                chars.push(c);
            } else if (chars.isEmpty()) {
                return false;
            } else if (c == ')') {
                if ('(' != chars.pop()) {
                    return false;
                }
            } else if (c == '}') {
                if ('{' != chars.pop()) {
                    return false;
                }
            } else if (c == ']') {
                if ('[' != chars.pop()) {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }
}
