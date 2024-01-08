package com.tom.app;

public class BiTreePrunning {
  public TreeNode pruneTree(TreeNode root) {
    if (root == null)
      return null;
    if (root.left == null && root.right == null && root.val == 0)
      return null;
    containsOne(root);
    return root;
  }

  public boolean containsOne(TreeNode node) {
    if (node == null)
      return false;
    boolean left_contain = containsOne(node.left);
    boolean right_contain = containsOne(node.right);
    if (!left_contain)
      node.left = null;
    if (!right_contain)
      node.right = null;
    return node.val == 1 || left_contain || right_contain;
  }
}
