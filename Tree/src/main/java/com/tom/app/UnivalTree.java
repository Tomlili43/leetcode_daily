package com.tom.app;

public class UnivalTree {
  public boolean isUnivalTree(TreeNode root) {
    boolean left_bol = root.left == null || root.left.val == root.val && isUnivalTree(root.left);
    boolean right_bol = root.right == null || root.right.val == root.val && isUnivalTree(root.right);
    return left_bol && right_bol;
  }
}
