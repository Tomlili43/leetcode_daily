package com.tom.app;

import java.util.*;

/**
 * CompleteBT
 */
public class CompleteBT {
  public boolean isCompleteTree(TreeNode root) {
    boolean end = false;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode cur_node = queue.poll();
      if (cur_node == null) {
        end = true;
      } else {
        if (end)
          return false;
        queue.offer(cur_node.left);
        queue.offer(cur_node.right);
      }

    }
    return true;
  }
}
