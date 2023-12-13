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
