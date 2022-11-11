package SOL_2022_11_week2;

public class Q108 {
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

    public TreeNode sortedArrayToBST(int[] nums) {

        return cal(nums, 0, nums.length-1);

    }

    public TreeNode cal(int[] nums, int left, int right) {
        if(left>right) return null;

        int mid = (left+right)/2;

        return new TreeNode(nums[mid], cal(nums, left, mid-1), cal(nums, mid+1, right));
    }
}

