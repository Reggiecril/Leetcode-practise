package 两个链表的第一个公共结点;

public class Demo {
    /**
     * 输入两个链表，找出它们的第一个公共结点。
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode pre = pHead1;
        while (pre != null) {
            ListNode cur = pHead2;
            while (cur != null) {

                if (pre == cur)
                    return pre;
                cur = cur.next;
            }
            pre = pre.next;
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
