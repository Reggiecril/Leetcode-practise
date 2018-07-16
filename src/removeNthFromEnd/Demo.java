package removeNthFromEnd;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a linked list, remove the n-th node from the end of list and return its
	 * head.
	 * 
	 * Example:
	 * 
	 * Given linked list: 1->2->3->4->5, and n = 2.
	 * 
	 * After removing the second node from the end, the linked list becomes
	 * 1->2->3->5.
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
