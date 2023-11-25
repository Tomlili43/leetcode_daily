package tree;


public class ConvertSortedLinkedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        return sortedListToBST(head, null);
    }

    private TreeNode sortedListToBST(ListNode head, ListNode tail) {
        if (head == tail) return null;
        ListNode slow = head, fast = head;
        // fast.next != tail is the key
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        // slow is the middle node
        root.left = sortedListToBST(head, slow);
        root.right = sortedListToBST(slow.next, tail);
        return root;
    }   
    
    public static void main(String[] args) {
        ConvertSortedLinkedListToBinarySearchTree c = new ConvertSortedLinkedListToBinarySearchTree();
        ListNode head = new ListNode(-10);
        ListNode node1 = new ListNode(-3);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(9);
        head.next = node1; node1.next = node2; node2.next = node3; node3.next = node4;
        TreeNode root = c.sortedListToBST(head);
        // inorder
        TreeTraversal treeTraversal = new TreeTraversal();
        System.out.println(treeTraversal.levelOrder(root));
    }
}