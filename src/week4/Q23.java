package week4;

import java.util.PriorityQueue;

//23. Merge k Sorted Lists
public class Q23 {
//lists = [[1,4,5],[1,3,4],[2,6]]
    public static void main(String[] args) {
        ListNode node1=new ListNode(1,new ListNode(4,new ListNode(5)));
        ListNode node2=new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode node3=new ListNode(2,new ListNode(6));

        ListNode[] lists={node1, node2, node3};
        mergeKLists(lists);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode listNode=new ListNode();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(ListNode ln:lists){
            while(ln != null) {
                queue.offer(ln.val);
                ln = ln.next;
            }
        }

       /* while(!queue.isEmpty()){
            listNode.val=queue.poll();
            if(queue.isEmpty()) break;
            ListNode tmp=new ListNode(queue.poll());
            listNode.next=tmp;
        }*/

        ListNode tmp=new ListNode();
        while(!queue.isEmpty()){
            tmp.val=queue.poll();
            if(queue.isEmpty()) break;
            tmp.next=new ListNode(queue.poll());
            tmp.next=tmp;
        }

        return listNode;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
