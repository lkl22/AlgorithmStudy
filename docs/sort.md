# 排序算法

算法对比：

算法|时间复杂度|空间复杂度|稳定性|重要特性
---|---|---|---|---
选择排序|O(n^2)|O(1)|不稳定|
插入排序|O(n^2)|O(1)|稳定|有序数组，插⼊排序的复杂度是 O(n)


## 选择排序

先把最⼩/最大的拿出来，剩下的再把最⼩/最大的拿出来，每次选择还没处理的元素⾥最⼩/最大的元素。

`arr[i…n)` 未排序  `arr[0…i)` 已排序 - **`循环不变`**

`arr[i…n)` 中的最⼩/最大值要放到 arr[i] 的位置

选择排序法的复杂度分析
```java
        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n) 中的最小值
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            DataUtils.swap(arr, i, minIndex);
        }
```

> 1 + 2 + 3 + … + n = (1 + n) * n / 2 = 1/2 * n^2 + 1/2 * n = O(n^2)


## 插入排序

每次处理⼀张牌，把这张牌插⼊到前⾯已经排好序的牌中。

`arr[0, i)` 已排好序， `arr[i…n)` 未排序，把 arr[i] 放到合适的位置。

```java
        for (int i = 0; i < arr.length; i++) {
            // 将 arr[i] 插入到合适的位置
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
```

## 希尔排序

## 冒泡排序

## 归并排序

## 快速排序

## 堆排序

## 计数排序

## 桶排序

## 基数排序
