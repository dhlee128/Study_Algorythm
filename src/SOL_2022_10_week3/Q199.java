package SOL_2022_10_week3;

import java.util.*;

//199. Binary Tree Right Side View
public class Q199 {

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

    public List<Integer> rightSideView(TreeNode root) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        dfs(root, 0, map);

        for(int i=0; i<map.size(); i++) {
            list.add(map.get(i));
        }
        return list;
    }

    public void dfs(TreeNode root, int level, Map<Integer, Integer> map) {
        if(root==null) return;

        map.put(level, root.val);

        dfs(root.left, level+1, map);
        dfs(root.right, level+1, map);
    }

    public void bfs(TreeNode root, Queue<TreeNode> queue, List<Integer> list) {
        if(root==null) return;

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();

                if(i==size-1) list.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
    }
}
