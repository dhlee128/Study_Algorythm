package SOL_2022_10_week4;

import java.util.ArrayList;
import java.util.List;

public class Q105 {

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
    //preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
    //[3] [9] [12,20,7]
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<inorder.length; i++) {
            list.add(inorder[i]);
        }

        return partition(preorder, list,0);
    }

    public TreeNode partition(int[] preorder, List<Integer> inorder, int preIndex) {

        TreeNode node = new TreeNode();
        node.val = preorder[preIndex];

        List<Integer> leftNode = new ArrayList<>();
        List<Integer> rightNode = new ArrayList<>();

        boolean leftF = true;
        int center = -1;
        for(int i=0; i<inorder.size(); i++) {
            if(preorder[preIndex]==inorder.get(i)) {
                leftF = false;
                center = i;
            } else {
                if(leftF) {
                    leftNode.add(inorder.get(i));
                } else {
                    rightNode.add(inorder.get(i));
                }
            }
        }

        if(center==-1) return partition(preorder, inorder, preIndex+1);
        if(leftNode.size()!=0) node.left = partition(preorder, leftNode, preIndex+1);
        if(rightNode.size()!=0) node.right = partition(preorder, rightNode, preIndex+1);

        return node;
    }
}
