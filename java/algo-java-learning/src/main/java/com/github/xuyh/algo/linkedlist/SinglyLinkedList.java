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

  /**
   * 带头节点的链表反转 等价于从第二个节点开始从新头插入建立链表
   *
   * @param p
   * @return
   */
  public Node inverseLinkedListHead(Node p) {
    Node Head = new Node(0, null);

    Head.next = p;
    Node Cur = p.next;
    Node next = null;

    while (Cur != null) {
      next = Cur.next;
      Cur.next = Head.next;
      Head.next = Cur;
      Cur = next;
    }

    return Head;
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
