package week5;

import java.util.LinkedList;
import java.util.Queue;
//111. Minimum Depth of Binary Tree
public class Q111 {
    public static void main(String[] args) {
        //3,9,20,null,null,15,7
        //TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15), new TreeNode(7)));
        TreeNode root=new TreeNode(1,new TreeNode(2,new TreeNode(4), new TreeNode(5)),new TreeNode(3));
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        int cnt=0;

        if(root==null){ return cnt;}

        Queue<TreeNode> queue=new LinkedList<>();
        root.level=1;//루트 노드 레벨은 1
        queue.offer(root);//root

        TreeNode tmp=new TreeNode();
        while(true){
            tmp=queue.poll();

            TreeNode left=tmp.left;
            TreeNode right=tmp.right;

            if(left!=null){
                left.level=tmp.level+1;//자식노드 레벨=(상위노드 레벨+1)
                queue.offer(left);
            }
            if(right!=null){
                right.level=tmp.level+1;//자식노드 레벨=(상위노드 레벨+1)
                queue.offer(right);
            }

            if(left==null&&right==null){//자식노드 X
                cnt=tmp.level;
                break;
            }

        }

        return cnt;
    }

    static class TreeNode {
        int level;//레벨
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
