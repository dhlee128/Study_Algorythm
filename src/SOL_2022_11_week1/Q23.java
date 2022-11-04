package SOL_2022_11_week1;

import java.util.PriorityQueue;

public class Q23 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode();

        if(lists==null) return res;

        PriorityQueue<ListNode> queue = new PriorityQueue<>((ListNode n1, ListNode n2) -> (n1.val-n2.val));

        for(ListNode list : lists) {
            if(list!=null) queue.add(list);
        }

        ListNode head = res;

        while(!queue.isEmpty()) {
            ListNode node = queue.poll();
            head.next = node;
            head = head.next;

            if(node.next!=null) queue.add(node.next);
        }
        return res.next;
    }

}
