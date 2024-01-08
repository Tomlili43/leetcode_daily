package com.tom.app;

import java.util.Stack;

/**
 * RangeSumBST
 */
public class RangeSumBST {

  public int rangeSumBST(TreeNode root, int L, int R) {
    int range_sum = 0;
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node != null) {
        if (node.val >= L && node.val <= R) {
          range_sum += node.val;
        }
        if (node.val > L) {
          stack.add(node.left);
        }
        if (node.val < R) {
          stack.add(node.right);
        }
      }
    }
    return range_sum;
  }
}
