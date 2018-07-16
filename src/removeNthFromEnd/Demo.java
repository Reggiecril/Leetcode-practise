package removeNthFromEnd;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || head.next == null)
			return null;
		ListNode pre = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		ListNode cur = null;
		int count = 0;
		while (pre != null) {
			if ((count + 1) == n) {
				ListNode preNext = pre.next;
				pre = preNext;
			} else {
				ListNode preNext = pre.next;
				pre.next = cur;
				cur = pre;
				pre = preNext;
			}
			count++;

		}
		return cur;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
