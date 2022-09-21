package SOL_2022_09_week3;

public class Q2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        //l1 = [2,4,3], l2 = [5,6,4]
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(addTwoNumbers(node1, node2));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = new ListNode(); //정답 노드
        ListNode node = answer; //temp 노드

        int carry = 0;

        while(l1!=null || l2!=null){
            int sum = carry;

            if(l1!=null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10; //반올림 값
            sum %= 10; //두 노드를 더한 한자리 값

            node.next = new ListNode(sum);
            node = node.next;
        }
        // 반올림 값이 있는 경우
        if(carry>0) node.next = new ListNode(carry);

        return answer.next;
    }
}
