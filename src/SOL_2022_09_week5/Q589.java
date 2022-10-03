package SOL_2022_09_week5;

import java.util.*;

//589. N-ary Tree Preorder Traversal
public class Q589 {

    class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public static void main(String[] args) {
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        do {
            root = stack.pop();
            list.add(root.val);

            List<Node> children = root.children;
            for (int i = children.size()-1; i>=0; i--) {
                Node node = children.get(i);
                stack.add(node);
            }
        }while(!stack.isEmpty());

        return list;
    }

}
