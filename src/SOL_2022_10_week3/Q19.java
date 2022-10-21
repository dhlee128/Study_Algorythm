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
        List<Integer> list = new ArrayList<>();
        while(head!=null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();

        ListNode res = new ListNode();
        ListNode temp = res;


        for(int i=0; i<list.size();i++){
            if(i!=(size-n)){//n-size 제외
                System.out.println(list.get(i));
                temp.next = new ListNode(list.get(i));
                temp = temp.next;
            }
        }

        return res.next;
    }
}
