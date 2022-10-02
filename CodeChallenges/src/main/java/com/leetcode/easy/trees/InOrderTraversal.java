package com.leetcode.easy.trees;

public class InOrderTraversal {

    TreeNode tree = new TreeNode();

    public static void main(String[] args) {

    }

    public TreeNode increasingBST(TreeNode root) {

        if (root == null){
            return null;
        }

        increasingBST(root.left);
        increasingBST(root.right);

        tree.val = root.val;
        tree.left = root;

        return tree;
    }
}
