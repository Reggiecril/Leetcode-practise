package 合并两个排序的链表;

public class Demo {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode cur1 = new ListNode(0);
        ListNode cur2 = new ListNode(0);
        if (list1.val > list2.val) {
            cur1 = list2;
            cur2 = list1;
        } else {
            cur1 = list1;
            cur2 = list2;
        }
        while (cur1.next != null && cur2 != null) {
            if (cur1.next.val < cur2.val)
                cur1 = cur1.next;
            else {

                ListNode li = new ListNode(cur2.val);
                cur2 = cur2.next;
                li.next = cur1.next;
                cur1.next = li;
                cur1 = cur1.next;
            }
        }
        if (cur1.next == null && cur2 != null) {
            cur1.next = cur2;
        }
        return list1;
    }

    private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
