
public class ReversedLinkedList {
   ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }
    return prev;
  }
  // psvm
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    head.next = second;
    second.next = third;
    third.next = null;
    ReversedLinkedList rll = new ReversedLinkedList();
    ListNode result = rll.reverseList(head);
    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }
}
