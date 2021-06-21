package week10;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//101. Symmetric Tree
public class Q101 {

    public static void main(String[] args) {
        //1,2,2,3,4,4,3
        TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(isSymmetric(node));

    }

    public static boolean isSymmetric(TreeNode root) {
        if(root==null){return true;}

        return check(root.left,root.right);
    }

    public static boolean check(TreeNode leftNode, TreeNode rightNode){
        if(leftNode==null && rightNode==null){
            return true;
        }else if(leftNode==null || rightNode==null){
            return false;
        }else if(leftNode.val!=rightNode.val){
            return false;
        }else{
            if(check(leftNode.left,rightNode.right)&&check(leftNode.right,rightNode.left)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static class TreeNode {
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
}
