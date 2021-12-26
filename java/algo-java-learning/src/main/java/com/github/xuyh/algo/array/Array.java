package com.github.xuyh.algo.array;

public class Array {
  public int data[];
  private int size;
  private int count;

  public Array(int capacity) {
    this.data = new int[capacity];
    this.size = capacity;
    this.count = 0;
  }

  public int find(int index) {
    if (index < 0 || index > count - 1) return -1;
    return data[index];
  }

  public boolean insert(int index, int value) {
    return true;
  }

  public boolean delete(int index) {

    return true;
  }

  public void printAll() {
    System.out.print("[");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d ", data[i]);
    }
    System.out.print("]");
  }
}
