package SOL_2022_10_week3;

import java.util.ArrayList;
import java.util.List;

//19. Remove Nth Node From End of List
public class Q19 {

    public class ListNode { int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = head;

        ListNode head1 = head;
        ListNode head2 = head;

        ListNode temp = res;

        for(int i=0; i<n; i++) {
            if(head2.next==null) return res.next;
            head2 = head2.next;
        }

        while(true) {
            if(head2.next == null) break;
            head1=head1.next;
            head2=head2.next;
        }

        while(head1!=temp) {
            temp = temp.next;
        }

        temp.next = head1.next.next;

        return res;
    }
}
