package SOL_2022_11_week1;

import java.awt.geom.QuadCurve2D;
import java.util.*;

//103. Binary Tree Zigzag Level Order Traversal
public class Q103 {

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> fromLtoR = new LinkedList<>();
        Queue<TreeNode> fromRtoL = new LinkedList<>();

        fromLtoR.offer(root);
        fromRtoL.offer(root);

        boolean flagFromLtoR = true;

        while(!fromLtoR.isEmpty()) {
            int size = fromLtoR.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<size; i++) {
                TreeNode treeNode = fromLtoR.poll();
                TreeNode treeNode2 = fromRtoL.poll();
                if(flagFromLtoR) {
                    list.add(treeNode.val);
                } else {
                    list.add(treeNode2.val);
                }

                if(treeNode.left!=null) fromLtoR.offer(treeNode.left);
                if(treeNode.right!=null) fromLtoR.offer(treeNode.right);

                if(treeNode2.right!=null) fromRtoL.offer(treeNode2.right);
                if(treeNode2.left!=null) fromRtoL.offer(treeNode2.left);
            }
            flagFromLtoR = (flagFromLtoR==true?false:true);
            res.add(list);
        }
        return res;
    }
}
