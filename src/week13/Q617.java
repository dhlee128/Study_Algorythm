package week13;

public class Q617 {

    public static  class TreeNode {
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

    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1,new TreeNode(3,new TreeNode(5),null),new TreeNode(2));
        TreeNode treeNode2 = new TreeNode(2,new TreeNode(1,null,new TreeNode(4)),new TreeNode(3,null,new TreeNode(7)));

        mergeTrees(treeNode1,treeNode2);

    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode tmpNode;

        if(root1==null && root2==null){
            tmpNode=null;
        }else if(root1==null && root2!=null){
            tmpNode=new TreeNode(0+root2.val);
            tmpNode.left=mergeTrees(null,root2.left);
            tmpNode.right=mergeTrees(null,root2.right);
        }else if(root1!=null && root2==null){
            tmpNode=new TreeNode(root1.val+0);
            tmpNode.left=mergeTrees(root1.left,null);
            tmpNode.right=mergeTrees(root1.right,null);
        }else{
            tmpNode=new TreeNode(root1.val+root2.val);
            tmpNode.left=mergeTrees(root1.left,root2.left);
            tmpNode.right=mergeTrees(root1.right,root2.right);

        }
        return tmpNode;
    }
}
