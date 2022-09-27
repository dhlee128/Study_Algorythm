package SOL_2022_09_week4;

import java.util.Stack;

public class Q226 {

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {

        if(root == null) return null;

        swap(root);
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public void swap(TreeNode root) {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }


}
