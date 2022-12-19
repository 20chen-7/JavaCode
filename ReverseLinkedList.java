public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }return prev;
    }
    /**recursion
     * if (head == null || head.next == null){
     *     return head;
     * }
     *  1->2->3->4->5
     *            head = 1;
     *            head.next = 2
     *            tail = 5
     * ListNode tail = reverseList(head.next);
     * head.next.next = head;
     * head.next = null;
     * return tail;
     * */
}
