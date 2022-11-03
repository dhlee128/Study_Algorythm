package SOL_2022_11_week1;

public class Q25 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        int[] temp = new int[k];
        int idx = 0;

        while(head!=null){

            temp[k-idx-1] = head.val;
            head = head.next;

            idx++;

            if(k==idx) {
                idx = 0;
                reverse(temp);
            }
        }

        if(idx!=0) {
            for(int i=k-1; i>=k-idx; i--) {
                list.next = new ListNode(temp[i]);
                list = list.next;
            }
        }

        return res;
    }
    ListNode res = null;
    ListNode list = null;
    boolean start = true;
    public void reverse(int[] temp) {
        for(int i=0; i<temp.length; i++) {
            if (start) {
                res = new ListNode(temp[i]);
                list = res;
                start = false;
            }else{
                list.next = new ListNode(temp[i]);
                list = list.next;
            }
        }
    }
}
