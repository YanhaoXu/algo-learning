package com.github.xuyh.algo.linkedlist;

public class SinglyLinkedList {

  private Node head = null;

  public Node findByValue(int value) {
    Node p = head;
    while (p != null && p.data != value) {
      p = p.next;
    }
    return p;
  }

  public Node findByIndex(int index) {
    Node p = head;
    int pos = 0;
    while (p != null && pos != index) {
      p = p.next;
    }
    return p;
  }

  public class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public int getData() {
      return data;
    }
  }
}
