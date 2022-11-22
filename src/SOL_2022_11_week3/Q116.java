package SOL_2022_11_week3;

import java.util.LinkedList;
import java.util.Queue;

public class Q116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if(root==null) return null;
        dsf(root.left, root.right);

        return root;
    }

    public void dsf(Node leftNode, Node rightNode) {

        if(leftNode==null || rightNode==null) return;

        leftNode.next = rightNode;

        dsf(leftNode.left, leftNode.right);
        dsf(leftNode.right, rightNode.left);
        dsf(rightNode.left, rightNode.right);
    }
}

