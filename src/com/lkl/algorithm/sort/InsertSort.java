package com.lkl.algorithm.sort;

import com.lkl.algorithm.constant.Const;
import com.lkl.algorithm.utils.DataUtils;
import com.lkl.algorithm.utils.GenerateHelper;
import com.lkl.algorithm.utils.SortHelper;

/**
 * 插入排序算法：假设前面的数据有序，拿后面的数据往前面有序的数据中插入，位置交换相比选择排序多
 * <p>
 * 时间复杂度：O(n * n)
 * 空间复杂度：O(1)
 * <p>
 * 稳定性：稳定的
 */
public class InsertSort {
    public static <E extends Comparable<E>> void sort(E[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            E t = array[i];
            for (int j = i; j - 1 >= 0 && array[j].compareTo(array[j - 1]) < 0; j--) {
                DataUtils.swap(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        int size = 18;
        Integer[] array = GenerateHelper.generateRandomArray(size, size);
        SortHelper.testSort(Const.SORT_NAME_INSERT, array);
    }
}
