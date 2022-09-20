package SOL_2022_09_week3;

public class Q543 {

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
    static int num = 0;
    public static int diameterOfBinaryTree(TreeNode root) {

        diameterOfBinaryTreeCal(root);

         return num;
    }

    public static int diameterOfBinaryTreeCal(TreeNode root) {

        if(root == null) return 0;

        int ld = diameterOfBinaryTreeCal(root.left);
        int rd = diameterOfBinaryTreeCal(root.right);

        num = Math.max(ld+rd, num);
        return Math.max(ld,rd)+1;
    }

    public static void main(String[] args) {
        //root = [1,2,3,4,5]
        //TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        TreeNode node = new TreeNode(1, new TreeNode(2), null);
        System.out.println(diameterOfBinaryTree(node));
    }
}
