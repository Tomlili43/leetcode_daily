package linked_list;



public class AddTwoNumber {
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) { this.val = x; }
    ListNode(int x, ListNode next) { this.val = x; this.next = next; }
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode p = dummy;
    int carry = 0;
    while (l1!=null || l2!=null || carry!=0) {
      if (l1!=null) {
        carry += l1.val;
        l1 = l1.next;
      }
      if (l2!=null) {
        carry += l2.val;
        l2 = l2.next;
      }
      p.next = new ListNode(carry%10);
      carry /= 10;
      p = p.next;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new AddTwoNumber().new ListNode(2);
    l1.next = new AddTwoNumber().new ListNode(4);
    l1.next.next = new AddTwoNumber().new ListNode(3);
    ListNode l2 = new AddTwoNumber().new ListNode(5);
    l2.next = new AddTwoNumber().new ListNode(6);
    l2.next.next = new AddTwoNumber().new ListNode(4);
    
    AddTwoNumber obj = new AddTwoNumber();
    ListNode result = obj.addTwoNumbers(l1, l2);
    while (result!=null) {
      System.out.print(result.val + " ");
      result = result.next;
    }
    System.out.println();
  }
}
