package reverseLinkedListII;

/**
 * @author Reggie
 *
 * Reverse a linked list from position m to n. Do it in one-pass.
 *
 * Note: 1 ≤ m ≤ n ≤ length of list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 */
public class Demo {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode pre=dummyHead;
        for(int i=m-1;i>0;i--)pre=pre.next;

        ListNode second=pre.next;
        ListNode toil=second.next;
        for(int i=0;i<n-m;i++){
            second.next=toil.next;
            toil.next=pre.next;
            pre.next=toil;
            toil=second.next;
        }
        return dummyHead.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
