package com.tom.app;

import java.util.*;

/**
 * BotLeftVal
 */
public class BotLeftVal {
  public int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList();
    queue.offer(root);
    while (!queue.isEmpty()) {
      root = queue.poll();
      if (root.right != null)
        queue.offer(root.right);
      if (root.left != null)
        queue.offer(root.left);
    }
    return root.val;
  }
}
