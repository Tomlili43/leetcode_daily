import tree.TreeNode;


public class ValidateBST {
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if(!isValidBST(root.left)) {
            return false;
        }
        if(root.val <= pre) {
            return false;
        }
        pre = root.val;
        if(!isValidBST(root.right)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        ValidateBST v = new ValidateBST();
        System.out.println(v.isValidBST(root));
    }
}
