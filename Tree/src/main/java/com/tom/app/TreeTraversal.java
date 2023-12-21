package com.tom.app;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import tree.TreeNode;


public class TreeTraversal {
    public List<Integer> inorder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    private void inorder(TreeNode root, List<Integer> res){
        if(root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    private void preOrder(TreeNode root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }

    private void postOrder(TreeNode root, List<Integer> res){
        if(root == null) return;
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        // use queue to store level node and output all of its child
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        //remove node poll;
        while(!q.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            int size = q.size();
            for(int i =0;i<size;i++){
                TreeNode head = q.poll();
                System.err.println(head.val);
                levelList.add(head.val);
                if(head.left!=null){
                    q.offer(head.left);
                }
                if(head.right!=null) {
                    q.offer(head.right);
                }
            }
            res.add(levelList);
        }
        return res;
    }
    
    public static void main(String[] args){
        BST bst = new BST();
        int[] nums = {1, 2, 3, 4, 5};
        TreeNode root = bst.sortedArrayToBST(nums);
        TreeTraversal sol = new TreeTraversal();
        List<List<Integer>> res = new ArrayList<>();
        res = sol.levelOrder(root);
        System.out.println(res);
        
    }
}
