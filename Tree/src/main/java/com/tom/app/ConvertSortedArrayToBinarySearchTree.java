package com.tom.app;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start >= end) return null;
        int mid = (start + end) >>> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid);
        root.right = sortedArrayToBST(nums, mid+1, end);
        return root;
    }   
    
    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree c = new ConvertSortedArrayToBinarySearchTree();
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = c.sortedArrayToBST(nums);
        // inorder
        TreeTraversal treeTraversal = new TreeTraversal();
        System.out.println(treeTraversal.levelOrder(root));
    }
}
