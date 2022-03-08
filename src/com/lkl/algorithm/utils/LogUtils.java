package com.lkl.algorithm.utils;

import javax.swing.*;
import java.util.Arrays;

public class LogUtils {
    private LogUtils() {
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void print(String pre, Integer[] array) {
        System.out.println(pre + Arrays.toString(array));
    }
}
