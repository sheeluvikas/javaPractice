package coding.tree;

public class BST {

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2, treeNode1, treeNode2);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(4, treeNode3, treeNode5);

        System.out.println(searchBST(treeNode4, 2).val);


    }

    public static TreeNode searchBST (TreeNode node, int val){

        if(node == null){
            return null;
        }
        if(node.val == val){
            return node;
        }
        if(val < node.val) {
            return searchBST(node.left, val);
        }
        else {
            return searchBST(node.right, val);
        }
    }
}
