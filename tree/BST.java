package tree;
import java.util.ArrayList;
import java.util.LinkedList;

public class BST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return constructBSTRecursive(nums, 0, nums.length - 1);
    }

    private TreeNode constructBSTRecursive(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = constructBSTRecursive(nums, left, mid - 1);
        node.right = constructBSTRecursive(nums, mid + 1, right);
        return node;
    }


    public static void main(String[] args) {
        BST bst = new BST();
        int[] nums = {1, 2, 3, 4, 5};
        TreeNode root = bst.sortedArrayToBST(nums);
        // retrieve the tree
        System.out.println(root.left.val);
        System.out.println(root.left.right.val);
        System.out.println(root.val);
        System.out.println(root.right.val);
        System.out.println(root.right.right.val);

    }
}

