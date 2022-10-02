package com.leetcode.easy.trees;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumBST {

    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int sum = 0;

        while (!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                if(node.val <= high && node.val >= low){
                    sum+= node.val;
                }

                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }

        return sum;
    }
}
