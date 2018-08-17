package rotateList;

public class Demo {
    /**
     * Given a linked list, rotate the list to the right by k places, where k is non-negative.
     *
     *
     * Input: 1->2->3->4->5->NULL, k = 2
     * Output: 4->5->1->2->3->NULL
     * Explanation:
     * rotate 1 steps to the right: 5->1->2->3->4->NULL
     * rotate 2 steps to the right: 4->5->1->2->3->NULL
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = dummyHead;
        int i = 0;
        for (i = 0; pre.next != null; i++)
            pre = pre.next;
        if (i == 0 || k % i == 0) return dummyHead.next;
        for (i -= k % i; i > 0; i--)
            cur = cur.next;
        pre.next = dummyHead.next;
        dummyHead.next = cur.next;
        cur.next = null;
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}