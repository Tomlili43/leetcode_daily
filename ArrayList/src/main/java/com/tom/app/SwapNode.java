package com.tom.app;

/**
 * SwapNode
 */
public class SwapNode {

  public ListNode swapPairs(ListNode head) {
    ListNode tmp = new ListNode(0);
    tmp.next = head;
    ListNode cur = tmp;

    while (cur.next != null && cur.next.next != null) {
      ListNode first_node = cur.next;
      ListNode sec_node = cur.next.next;
      first_node.next = sec_node.next;
      cur.next = sec_node;
      cur.next.next = first_node;
      cur = cur.next.next;
    }
    return tmp.next;
  }
}
