package com.lkl.algorithm.utils;

import java.util.Random;

public class GenerateHelper {
    private GenerateHelper() {
    }

    public static Integer[] generateRandomArray(int n, int bound) {
        if (n < 1) {
            throw new IllegalArgumentException("n must greater 0.");
        }
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static Integer[] generateOrderArray(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must greater 0.");
        }
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}
