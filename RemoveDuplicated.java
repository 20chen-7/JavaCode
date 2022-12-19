public class RemoveDuplicated {
    public ListNode deleteDuplication(ListNode head) {
        LisNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while (p.next != null){
            ListNode q = p.next;
            while ( q!= null && q.val == p.next.val){
                q = q.next;
            }
            if (p.next.next == q) {
                p = p.next;
            }else{
                p.next = q;
            }
        }return dummy.next;
    }
}
