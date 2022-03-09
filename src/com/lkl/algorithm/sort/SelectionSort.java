package com.lkl.algorithm.sort;

import com.lkl.algorithm.constant.Const;
import com.lkl.algorithm.utils.DataUtils;
import com.lkl.algorithm.utils.GenerateHelper;
import com.lkl.algorithm.utils.SortHelper;

public class SelectionSort {

    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n) 中的最小值
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            DataUtils.swap(arr, i, minIndex);
        }
    }

    // 换个方法实现选择排序法，我们叫 sort2
    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            // 选择 arr[0...i] 中的最大值
            int maxIndex = i;
            for (int j = i; j >= 0; j--) {
                if (arr[j].compareTo(arr[maxIndex]) > 0)
                    maxIndex = j;
            }
            DataUtils.swap(arr, i, maxIndex);
        }
    }


    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = GenerateHelper.generateRandomArray(n, n);
            SortHelper.testSort(Const.SORT_NAME_SELECTION, arr);
        }
    }
}

