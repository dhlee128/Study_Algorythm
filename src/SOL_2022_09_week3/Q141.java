package SOL_2022_09_week3;

public class Q141 {

    public static void main(String[] args) {
        //head = [3,2,0,-4], pos = 1
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {

    /*
        //방법1. 토끼와 거북이 알고리즘(fast and slow algorithm)
        if(head == null) return false;

        ListNode slow_node = head; //한칸씩 이동
        ListNode fast_node = head; //두칸씩 이동

        while(true) {
            if(slow_node.next == null || fast_node.next==null || (fast_node.next!=null && fast_node.next.next == null)) {
                return false;
            }else{
                slow_node = slow_node.next;
                fast_node = fast_node.next.next;
            }

            if(slow_node == fast_node) return true;
        }*/

        //방법2. -100000 <= Node.val <= 100000
        while(true) {
            if(head == null) return false;

            if(head.val == 100001) return true;

            head.val = 100001;
            head = head.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
