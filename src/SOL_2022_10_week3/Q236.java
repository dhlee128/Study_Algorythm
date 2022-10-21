package SOL_2022_10_week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q236 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);

        System.out.println(lowestCommonAncestor(node, new TreeNode(1), new TreeNode(2)));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if(leftNode!=null &&rightNode!=null) return root;

        if(leftNode==null){
            return rightNode;
        }else{
            return leftNode;
        }
    }
}
