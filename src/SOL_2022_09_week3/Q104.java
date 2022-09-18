package SOL_2022_09_week3;

public class Q104 {

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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {

        if(root == null) return 0; //빈 노드이면 0 반환

        return maxDepthCal(root,1); //최소 깊이는 1
    }

    public static int maxDepthCal(TreeNode root, int dept) {

        int lDept = dept;
        int rDept = dept;

        if(root.left != null) lDept = maxDepthCal(root.left, dept+1);
        if(root.right != null) rDept = maxDepthCal(root.right, dept+1);

        return (lDept > rDept) ? lDept : rDept;
    }

}
