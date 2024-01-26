package com.tom.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class RightSideView {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();

    if (root == null)
      return result;

    queue.offer(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (i == 0)
          result.add(node.val);

        if (node.right != null)
          queue.offer(node.right);
        if (node.left != null)
          queue.offer(node.left);
      }
    }
    return result;
  }
}
