package SOL_2022_09_week2;

public class Q21 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode listNode2 = new ListNode(1,new ListNode(3,new ListNode(4)));

        ListNode res = Solution.mergeTwoLists(listNode1, listNode2);
        System.out.println(res);
    }
}

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //빈 리스트일 경우
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = new ListNode(-1);
        ListNode node = head;

        //두 노드가 널이 아닐 경우에만 크기 비교
        while(list1!=null && list2!=null){
            if(list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            }else{
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        //나머지 노드
        if(list1 == null) {
            node.next = list2;
        }else{
            node.next = list1;
        }

        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){ this.val=val; }
    ListNode(int val, ListNode next){ this.val=val; this.next=next;}
}
