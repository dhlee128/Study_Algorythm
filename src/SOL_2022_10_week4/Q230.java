package SOL_2022_10_week4;

//230. Kth Smallest Element in a BST
public class Q230 {
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

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }
    int cnt = 0;
    int res = 0;
    public void dfs(TreeNode root, int k) {
        if(root==null) return;

        dfs(root.left, k);
        cnt++; if(cnt==k) res = root.val;
        dfs(root.right, k);
    }
}
