package com.github.xuyh.algo.sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BubbleSortTest {

  @Test
  void bubbleSort() {
    int[] arr = new Random(System.nanoTime()).ints(0, 1000).limit(10000).toArray();
    int[] compArr = Arrays.copyOf(arr, arr.length);
    Arrays.sort(compArr);
    BubbleSort.sort(arr);
    assertThat(arr, equalTo(compArr));
  }
}
