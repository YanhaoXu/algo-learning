package com.github.xuyh.algo.sorts;

public class BubbleSort {

  // 冒泡排序
  public static void sort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    for (int i = 0; i < arr.length; i++) {
      boolean flag = false;
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          flag = true;
        }
      }
      if (!flag) break;
    }
  }
}
