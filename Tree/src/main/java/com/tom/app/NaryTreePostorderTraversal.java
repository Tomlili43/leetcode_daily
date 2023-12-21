package com.tom.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.w3c.dom.Node;

public class NaryTreePostorderTraversal {
  public List<Integer> postorder(Node root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      Node node = stack.pop();
      result.addFirst(node.val);
      for (Node child : node.children) {
        stack.push(child);
      }
    }
    return result;
  }
}
