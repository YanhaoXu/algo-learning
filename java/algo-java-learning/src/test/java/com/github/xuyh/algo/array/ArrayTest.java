package com.github.xuyh.algo.array;

import org.junit.jupiter.api.Test;

class ArrayTest {
  @Test
  public void test001() {
    Array array = new Array(6);
    array.insert(0, 1);
    array.insert(1, 2);
    array.insert(2, 3);
    array.insert(3, 4);
    array.insert(4, 5);
    array.printAll();

    System.out.println(array.find(3));

    array.insert(1, 10);
    array.insert(-1, 10);
    array.insert(6, 10);
    array.printAll();
    array.delete(6);
    array.printAll();
    array.delete(5);
    array.printAll();
    array.delete(0);
    array.printAll();
  }
}
