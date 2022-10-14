package SOL_2022_10_week2;

import java.util.*;

public class Q114 {

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

    public void flatten(TreeNode root) {
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);

            if(!stack.isEmpty()) {
                node.right = stack.peek();
                node.left = null;
            }
        }
    }
}
