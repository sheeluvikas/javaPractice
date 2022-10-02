package binarytree;

public class MergeTwoBinaryTrees {

    public static void main(String[] args) {


        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(3);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(5);

        TreeNode node1 = new TreeNode(2);
        node1.left = new TreeNode(1);
        node1.right = new TreeNode(3);
        node1.left.right = new TreeNode(4);
        node1.right.right = new TreeNode(7);

        MergeTwoBinaryTrees trees = new MergeTwoBinaryTrees();
        TreeNode root = new TreeNode();
        TreeNode finalNode = trees.mergeTrees(root, node, node1);
        System.out.println(finalNode);
    }

    public TreeNode mergeTrees(TreeNode root, TreeNode root1, TreeNode root2) {

        if(root1 == null && root2 == null){
            return null;
        }

        if (root1 == null && root2 != null){
            root = new TreeNode(root2.val);
            root = mergeTrees(root.left, root2.left, root2.right);
        }
        else if (root1 != null && root2 == null){
            root = new TreeNode(root1.val);
            root = mergeTrees(root.left, root1.left, root1.right);
        }
        else{
            root = new TreeNode(root1.val + root2.val);
            root = mergeTrees(root.left, root1.left, root1.right);
            root = mergeTrees(root.right, root2.left, root2.right);
        }

        return root;
    }

}
