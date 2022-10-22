package SOL_2022_10_week3;

import java.util.LinkedList;
import java.util.Queue;

//98. Validate Binary Search Tree
public class Q98 {

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

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    public boolean isValidBST(TreeNode root, long max, long min) {

        if(root==null) return true;

        if(root.val<=min ||root.val>=max) return false;

        return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
    }
}
