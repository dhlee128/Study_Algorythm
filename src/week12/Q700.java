package week12;

//700. Search in a Binary Search Tree
public class Q700 {

    public static void main(String[] args) {

        TreeNode root=new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        int val=2;
        searchBST(root,val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {

        if(root.val==val){
            return root;
        }else if(root.val<val){
            if(root.right==null) return null;
            root=searchBST(root.right,val);
        }else{
            if(root.left==null) return null;
            root=searchBST(root.left,val);
        }

        return root;
    }

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
}
