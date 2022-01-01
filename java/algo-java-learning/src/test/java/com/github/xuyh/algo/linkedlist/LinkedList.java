package com.github.xuyh.algo.linkedlist;

/** 单链表 */
public class LinkedList {

  private Node head = null;

  /**
   * 查找data==value的节点
   *
   * @param value
   * @return
   */
  public Node find(int value) {
    Node p = head;
    while (p != null && p.data != value) {
      p = p.next;
    }
    return p;
  }

  /**
   * 在节点b后插入节点x
   *
   * @param b
   * @param x
   */
  public void insert(Node b, Node x) {
    if (b == null) {
      // 在链表头部
      x.next = head;
      head = x;
    } else {
      x.next = b.next;
      b.next = x;
    }
  }

  /**
   * 删除节点b（在已知前驱节点a的情况下）
   *
   * @param a
   * @param b
   */
  public void remove(Node a, Node b) {
    if (a == null) { // 待删除的节点b是头结点
      head = head.next;
    } else {
      a.next = b.next; // a.next.next等于b.next
    }
  }

  public Node get(int k) {
    Node p = head;
    for (int i = 0; i != k; i++) {
      p = p.next;
    }
    return p;
  }

  /** 节点 */
  public class Node {
    public int data;
    public Node next;
  }
}
