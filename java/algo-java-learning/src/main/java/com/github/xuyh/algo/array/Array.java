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
    if (index < 0 || index >= count) return -1;
    return data[index];
  }

  public boolean insert(int index, int value) {

    if (count == size) return false;

    if (index < 0 || index >= count) return false;

    for (int i = count; i > index; i--) {
      data[i] = data[i - 1];
    }

    data[index] = value;
    count++;
    return true;
  }

  public boolean delete(int index) {

    if (count == size) return false;

    if (index < 0 || index >= count) return false;

    for (int i = index+1; i < count; i++) {
      data[i - 1] = data[i];
    }

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
