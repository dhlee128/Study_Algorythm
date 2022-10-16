package SOL_2022_10_week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//148. Sort List
public class Q148 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //head = [4,2,1,3], head = [-1,5,3,4,0]
    public ListNode sortList(ListNode head) {

        List<Integer> list = new ArrayList<>();
        while(head!=null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);

        ListNode node = new ListNode();
        ListNode nodeHead = node;

        for(int i=0; i<list.size(); i++) {
            nodeHead.next = new ListNode(list.get(i));
            nodeHead = nodeHead.next;
        }
        return node;

    }
}
