import java.util.Stack;

public class SinglyLinkedList {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public int[] printListReversingly(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        for (ListNode p = head; p != null; p = p.next){
            stk.push(p.val);
        }
        int[] res = new int[stk.size()];
        int k = 0;
        while (!stk.isEmpty())
        {   res[k++] = stk.pop();
        }
        return res;
    }
}

