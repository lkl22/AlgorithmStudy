package com.lkl.algorithm.utils;

import com.lkl.algorithm.constant.Const;
import com.lkl.algorithm.sort.InsertSort;
import com.lkl.algorithm.sort.SelectionSort;

public class SortHelper {
    private SortHelper() {
    }

    public static <E extends Comparable<E>> void verifyArrayOrder(E[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                throw new RuntimeException("Arrays are not ordered.");
            }
        }
    }

    public static void testSort(String sortName, Integer[] array) {
        LogUtils.printf("test %s start\n", sortName);
        boolean isPrintArray = array.length < 20;
        if (isPrintArray) {
            LogUtils.print("Before sort:", array);
        }
        long startTime = System.nanoTime();
        if (Const.SORT_NAME_INSERT.equals(sortName)) {
            InsertSort.sort(array);
        } else if (Const.SORT_NAME_SELECTION.equals(sortName)) {
            SelectionSort.sort(array);
        }
        LogUtils.printf("Sort time: %fs\n", (System.nanoTime() - startTime) / 1000000000.0);
        SortHelper.verifyArrayOrder(array);
        if (isPrintArray) {
            LogUtils.print("After sort:", array);
        }

        LogUtils.printf("test %s end.\n\n", sortName);
    }
}
