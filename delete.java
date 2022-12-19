/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class delete {
    public void deleteNode(ListNode node) {
        ListNode p = node.next;
        node.val = p.val;
        node.next = p.next;
    }
}
