package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepthBinaryTree {

    public static void main(String[] args) {
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();
    }

    public static TreeNode addNodes(TreeNode root, int left, int right){
        TreeNode node = new TreeNode();

        return root;
    }

    public int maxDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return 0;
        }
        queue.offer(root);
        int count = 0;

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node != null){
                    if(node.left != null) {
                        queue.offer(node.left);
                    }
                    if(node.right != null){
                        queue.offer(node.right);
                    }
                }
            }

            count++;
        }


        return count;
    }
}
