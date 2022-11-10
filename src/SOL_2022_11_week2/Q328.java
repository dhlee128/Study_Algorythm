package SOL_2022_11_week2;

public class Q328 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddEvenList(ListNode head) {
        //odd -> even
        ListNode headOdd = new ListNode();
        ListNode headEven = new ListNode();

        ListNode odd = headOdd;
        ListNode even = headEven;

        int idx = 0;
        while (head != null) {
            idx++;
            if(idx%2==0) {//even
                even.next = head;
                even = even.next;
            } else {
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
        }
        even.next = null;

        odd.next = headEven.next;

        return headOdd.next;
    }
}
