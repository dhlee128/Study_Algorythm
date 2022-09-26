package SOL_2022_09_week4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        if(head == null) { return null; }

        stack.add(head.val);

        while(head.next != null){
            head = head.next;
            stack.add(head.val);
        }

        ListNode res = new ListNode();
        ListNode resHead = res;
        while(!stack.isEmpty()) {
            resHead.next = new ListNode(stack.pop());
            resHead = resHead.next;
        }

        return res.next;
    }

    public static void main(String[] args){

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    }

}
