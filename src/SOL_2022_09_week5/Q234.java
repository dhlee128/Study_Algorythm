package SOL_2022_09_week5;

import java.util.Stack;

public class Q234 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode listNode = head;

        Stack<Integer> stack = new Stack<>();
        while(head!=null) {
            stack.add(head.val);
            head = head.next;
        }

        for(int i=0;i<stack.size();i++) {
            if(stack.pop()!=listNode.val) return false;
            listNode = listNode.next;
        }

        return true;
    }
}
