package com.tom.dtp;

/**
 * ReversedLinkedListII
 */
public class ReversedLinkedListII {
  public ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null) {
      return null;
    }

    ListNode prev = null;
    ListNode curr_node = head;

    while (left > 1) {
      prev = curr_node;
      curr_node = curr_node.next;
      left--;
      right--;
    }

    ListNode connction = prev;
    ListNode tail = curr_node;
    while (right > 0) {
      ListNode tmp_next = curr_node.next;
      curr_node.next = prev;
      prev = curr_node;
      curr_node = tmp_next;
      right--;
    }
    if (connction != null) {
      connction.next = prev;
    } else {
      head = prev;
    }
    tail.next = curr_node;
    return head;

  }
}
